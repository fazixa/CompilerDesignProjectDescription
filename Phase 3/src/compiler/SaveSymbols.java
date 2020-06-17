package compiler;

import compiler.accessModifier.AccessModifier;
import compiler.gen.MiniJavaBaseListener;
import compiler.gen.MiniJavaParser;
import compiler.symbolTable.SymbolTable;
import compiler.symbolTable.symbolTableItem.*;
import compiler.symbolTable.symbolTableItem.varItems.FieldSymbolTableItem;
import compiler.symbolTable.symbolTableItem.varItems.LocalVariableSymbolTableItem;
import compiler.types.Type;
import compiler.types.VoidType;
import compiler.types.arrayType.ArrayType;
import compiler.types.singleType.BoolType;
import compiler.types.singleType.IntType;
import compiler.types.singleType.SingleType;
import compiler.types.singleType.UserDefinedType;
import compiler.error.Error;

import java.util.*;


public class SaveSymbols extends MiniJavaBaseListener {

    SymbolTable currSymbolTable;
    public static Map<String, Type> types = new HashMap<>();
    public static Map<String, ClassDeclaration> classes = new HashMap<>();
    MethodSymbolTableItem currMethod;

    public static Type getType(String name) {
        if (types.containsKey(name)) {
            return types.get(name);
        }
        if (name.contains("[]")) {
            String subName = name.substring(0, name.length() - 2);
            if (types.containsKey(subName)) {
                types.put(name, new ArrayType((SingleType) types.get(subName)));
            } else {
                types.put(name, new ArrayType(new UserDefinedType(classes.getOrDefault(subName, null), subName)));
            }
        } else {
            types.put(name, new UserDefinedType(classes.getOrDefault(name, null), name));
        }
        return types.get(name);
    }

    private AccessModifier getAccessModifier(MiniJavaParser.AccessModifierContext access) {
        if (access != null) {
            if ((access.getText().equals("private"))) {
                return AccessModifier.ACCESS_MODIFIER_PRIVATE;
            }
        }
        return AccessModifier.ACCESS_MODIFIER_PUBLIC;
    }

    private ClassDeclaration getClass(String name, String type, boolean isDefined) {
        if (classes.containsKey(name)) {
            return classes.get(name);
        }
        if (type.equals("main")) {
            classes.put(name, new MainClassSymbolItem(name));
        } else if (type.equals("interface")) {
            classes.put(name, new InterfaceSymbolTableItem(name));

        } else {
            classes.put(name, new ClassSymbolTableItem(name));
        }
        ((UserDefinedType) getType(name)).isDefined = isDefined;

        return classes.get(name);
    }

    @Override
    public void enterProgram(MiniJavaParser.ProgramContext ctx) {
        currSymbolTable = new SymbolTable(ctx.start.getLine(), 0, "program", null);
        SymbolTable.push(currSymbolTable);
        types.put("boolean", new BoolType());
        types.put("int", new IntType());
        types.put("void", new VoidType());
        types.put("String", new UserDefinedType(getClass("String", "", true), "String"));
        types.put("Object", new UserDefinedType(getClass("Object", "", true), "Object"));
    }

    @Override
    public void exitProgram(MiniJavaParser.ProgramContext ctx) {
        // print all symbols for phase2!
        // SymbolTable.printAll();
    }

    @Override
    public void enterMainClass(MiniJavaParser.MainClassContext ctx) {
        int line = ctx.start.getLine();
        int column = ctx.className.getCharPositionInLine();
        ClassDeclaration mainClassSymbolItem = getClass(ctx.className.getText(), "main", true);
        mainClassSymbolItem.lineNumber = ctx.start.getLine();
        currSymbolTable.put(mainClassSymbolItem);
        SymbolTable symbolTable = new SymbolTable(line, column, ctx.className.getText(), currSymbolTable);
        currSymbolTable = symbolTable;
        (mainClassSymbolItem).setSymbolTable(symbolTable);
        SymbolTable.push(currSymbolTable);
    }

    @Override
    public void exitMainClass(MiniJavaParser.MainClassContext ctx) {
        currSymbolTable = currSymbolTable.getPreSymbolTable();
    }

    @Override
    public void enterMainMethod(MiniJavaParser.MainMethodContext ctx) {
        int line = ctx.start.getLine();
        int column = ctx.start.getCharPositionInLine();
        MethodSymbolTableItem methodSymbolTableItem = new MethodSymbolTableItem("main",
                getType("void"), AccessModifier.ACCESS_MODIFIER_PUBLIC);
        currSymbolTable.put(methodSymbolTableItem);
        methodSymbolTableItem.lineNumber = line;
        Type type = getType(ctx.type().getText());
        methodSymbolTableItem.addParameter(type);
        currSymbolTable = new SymbolTable(line, column, "mainMethod", currSymbolTable);

        LocalVariableSymbolTableItem var = new LocalVariableSymbolTableItem(ctx.Identifier().getText(),
                type, 1);
        var.lineNumber = line;
        currSymbolTable.put(var);
        SymbolTable.push(currSymbolTable);

    }

    @Override
    public void exitMainMethod(MiniJavaParser.MainMethodContext ctx) {
        currSymbolTable = currSymbolTable.getPreSymbolTable();
    }

    @Override
    public void enterClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) {
        String name = ctx.className.getText();
        int line = ctx.start.getLine();
        int column = ctx.className.getCharPositionInLine();
        ClassDeclaration classSymbol = getClass(name, "", true);
        SymbolTable symbolTable;
        ClassSymbolTableItem classSymbolTableItem;
        if (currSymbolTable.put(classSymbol)) {
            classSymbolTableItem = new ClassSymbolTableItem(name + "_" + line + "_" + column);
            symbolTable = new SymbolTable(line, column, name, currSymbolTable);
            classSymbolTableItem.setLine_column(line, column);
            currSymbolTable.put(classSymbolTableItem);
            FindErrors.errors.add(new Error(101, line, column, "class " + name + " has been defined already"));
        } else {
            classSymbolTableItem = (ClassSymbolTableItem) classSymbol;
            symbolTable = new SymbolTable(line, column, name, currSymbolTable);
            classSymbolTableItem.setLine_column(line, column);
        }
        ClassDeclaration parent = getClass("Object", "", true);
        List<InterfaceSymbolTableItem> parents = new LinkedList<>();
        if (ctx.parentName != null) {
            if (getClass(ctx.parentName.getText(), "", false) instanceof ClassSymbolTableItem) {
                parent = (getClass(ctx.parentName.getText(), "", false));
            }
            for (int i = 2; i < ctx.Identifier().size(); i++) {
                if (getClass(ctx.Identifier(i).getText(), "interface", false) instanceof InterfaceSymbolTableItem)
                    parents.add((InterfaceSymbolTableItem) getClass(ctx.Identifier(i).getText(), "interface", false));
            }
        } else {
            for (int i = 1; i < ctx.Identifier().size(); i++) {
                if (getClass(ctx.Identifier(i).getText(), "interface", false) instanceof InterfaceSymbolTableItem)
                    parents.add((InterfaceSymbolTableItem) getClass(ctx.Identifier(i).getText(), "interface", false));
            }
        }
        classSymbolTableItem.setParent(parent);
        classSymbolTableItem.setParents(parents);
        currSymbolTable = symbolTable;
        classSymbolTableItem.setSymbolTable(symbolTable);
        SymbolTable.push(currSymbolTable);
    }

    @Override
    public void exitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) {
        currSymbolTable = currSymbolTable.getPreSymbolTable();
    }

    @Override
    public void enterInterfaceDeclaration(MiniJavaParser.InterfaceDeclarationContext ctx) {
        String name = ctx.interfaceName.getText();
        int line = ctx.start.getLine();
        int column = ctx.interfaceName.getCharPositionInLine();
        ClassDeclaration classSymbol = getClass(name, "interface", true);
        InterfaceSymbolTableItem interfaceSymbolTableItem;
        SymbolTable symbolTable;
        if (currSymbolTable.put(classSymbol)) {
            interfaceSymbolTableItem = new InterfaceSymbolTableItem(name + "_" + line + "_" + column);
            interfaceSymbolTableItem.setLine_column(line, column);
            symbolTable = new SymbolTable(line, column, name, currSymbolTable);
            FindErrors.errors.add(new Error(101, line, column, "class " + name + " has been defined already"));
        } else {
            interfaceSymbolTableItem = (InterfaceSymbolTableItem) classSymbol;
            interfaceSymbolTableItem.setLine_column(line, column);
            symbolTable = new SymbolTable(line, column, name, currSymbolTable);
        }
        currSymbolTable.put(interfaceSymbolTableItem);
        currSymbolTable = symbolTable;
        interfaceSymbolTableItem.setSymbolTable(symbolTable);
        SymbolTable.push(currSymbolTable);
    }

    @Override
    public void exitInterfaceDeclaration(MiniJavaParser.InterfaceDeclarationContext ctx) {
        currSymbolTable = currSymbolTable.getPreSymbolTable();
    }

    @Override
    public void enterInterfaceMethodDeclaration(MiniJavaParser.InterfaceMethodDeclarationContext ctx) {
        String name = ctx.methodName.getText();
        MethodSymbolTableItem methodSymbolTableItem = new MethodSymbolTableItem(name,
                getType(ctx.returnType().getText()), getAccessModifier(ctx.accessModifier()));
        methodSymbolTableItem.setLine_column(ctx.start.getLine(), ctx.methodName.getCharPositionInLine());
        currMethod = methodSymbolTableItem;
        int line = ctx.start.getLine();
        int column = ctx.methodName.getCharPositionInLine();
        methodSymbolTableItem.setLine_column(line, column);
        if (currSymbolTable.put(methodSymbolTableItem)) {
            FindErrors.errors.add(new Error(102, line, column, "method " + name + " has been defined already"));
            methodSymbolTableItem.setName(name + "_" + line + "_" + column);
            currSymbolTable.put(methodSymbolTableItem);
        }
    }

    @Override
    public void exitInterfaceMethodDeclaration(MiniJavaParser.InterfaceMethodDeclarationContext ctx) {
        currMethod = null;
    }

    @Override
    public void enterFieldDeclaration(MiniJavaParser.FieldDeclarationContext ctx) {
        FieldSymbolTableItem fieldSymbolTableItem = new FieldSymbolTableItem(ctx.fieldName.getText(),
                getType(ctx.type().getText()), getAccessModifier(ctx.accessModifier()));
        int line = ctx.start.getLine();
        int column = ctx.fieldName.getCharPositionInLine();
        fieldSymbolTableItem.setLine_column(line, column);
        if (currSymbolTable.put(fieldSymbolTableItem)) {
            FindErrors.errors.add(new Error(104, line, column, "field " + fieldSymbolTableItem.getName() + " has been defined already"));
            fieldSymbolTableItem.setName(ctx.fieldName.getText() + "_" + line + "_" + column);
            currSymbolTable.put(fieldSymbolTableItem);
        }
    }

    @Override
    public void exitFieldDeclaration(MiniJavaParser.FieldDeclarationContext ctx) {

    }

    @Override
    public void enterLocalDeclaration(MiniJavaParser.LocalDeclarationContext ctx) {
        String name = ctx.verName.getText();
        LocalVariableSymbolTableItem var = new LocalVariableSymbolTableItem(name, getType(ctx.type().getText()));
        int line = ctx.start.getLine();
        int column = ctx.verName.getCharPositionInLine();
        var.setLine_column(line, column);
        if (currSymbolTable.put(var)) {
            var.setName(var.getName() + "_" + line + "_" + column);
            currSymbolTable.put(var);
            FindErrors.errors.add(new Error(103, line, column, "var " + name + " has been defined already"));
        }
    }

    @Override
    public void exitLocalDeclaration(MiniJavaParser.LocalDeclarationContext ctx) {

    }

    @Override
    public void enterMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx) {
        String name = ctx.methodName.getText();
        MethodSymbolTableItem methodSymbolTableItem = new MethodSymbolTableItem(name,
                getType(ctx.returnType().getText()), getAccessModifier(ctx.accessModifier()));
        int line = ctx.start.getLine();
        int column = ctx.methodName.getCharPositionInLine();
        methodSymbolTableItem.setLine_column(line, column);
        currMethod = methodSymbolTableItem;
        if (currSymbolTable.put(methodSymbolTableItem)) {
            methodSymbolTableItem.setName(name + "_" + line + "_" + column);
            currSymbolTable.put(methodSymbolTableItem);
            currSymbolTable = new SymbolTable(line, column, name, currSymbolTable);
            FindErrors.errors.add(new Error(102, line, column, "method " + name + " has been defined already"));

        } else {
            currSymbolTable = new SymbolTable(line, column, name, currSymbolTable);
        }
        SymbolTable.push(currSymbolTable);
    }

    @Override
    public void exitMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx) {
        currSymbolTable = currSymbolTable.getPreSymbolTable();
        currMethod = null;
    }

    @Override
    public void enterParameter(MiniJavaParser.ParameterContext ctx) {
        if (currMethod != null) {
            Type type = getType(ctx.type().getText());
            currMethod.addParameter(type);
            LocalVariableSymbolTableItem var = new LocalVariableSymbolTableItem(ctx.Identifier().getText(),
                    type, currMethod.argumentsTypes.size());
            int line = ctx.start.getLine();
            int column = ctx.start.getCharPositionInLine();
            var.setLine_column(line, column);
            if (currSymbolTable.put(var)) {
                var.setName(var.getName() + "_" + line + "_" + column);
                currSymbolTable.put(var);
                FindErrors.errors.add(new Error(103, line, column, "var " + ctx.Identifier().getText() + " has been defined already"));
            }
        }
    }

    @Override
    public void enterNestedStatement(MiniJavaParser.NestedStatementContext ctx) {
        currSymbolTable = new SymbolTable(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "nested", currSymbolTable);
        SymbolTable.push(currSymbolTable);
    }

    @Override
    public void exitNestedStatement(MiniJavaParser.NestedStatementContext ctx) {
        currSymbolTable = currSymbolTable.getPreSymbolTable();

    }


    @Override
    public void enterIfBlock(MiniJavaParser.IfBlockContext ctx) {
        if (!(ctx.statement().children.get(0).getText().equals("{"))) {
            currSymbolTable = new SymbolTable(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "if", currSymbolTable);
            SymbolTable.push(currSymbolTable);
        }
    }

    @Override
    public void exitIfBlock(MiniJavaParser.IfBlockContext ctx) {
        if (!(ctx.statement().children.get(0).getText().equals("{"))) {
            currSymbolTable = currSymbolTable.getPreSymbolTable();
        }
    }

    @Override
    public void enterElseBlock(MiniJavaParser.ElseBlockContext ctx) {
        if (!(ctx.statement().children.get(0).getText().equals("{"))) {
            currSymbolTable = new SymbolTable(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "else", currSymbolTable);
            SymbolTable.push(currSymbolTable);
        }
    }

    @Override
    public void exitElseBlock(MiniJavaParser.ElseBlockContext ctx) {
        if (!(ctx.statement().children.get(0).getText().equals("{"))) {
            currSymbolTable = currSymbolTable.getPreSymbolTable();
        }
    }

    @Override
    public void enterWhileBlock(MiniJavaParser.WhileBlockContext ctx) {
        if (!(ctx.statement().children.get(0).getText().equals("{"))) {
            currSymbolTable = new SymbolTable(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "while", currSymbolTable);
            SymbolTable.push(currSymbolTable);
        }
    }

    @Override
    public void exitWhileBlock(MiniJavaParser.WhileBlockContext ctx) {
        if (!(ctx.statement().children.get(0).getText().equals("{"))) {
            currSymbolTable = currSymbolTable.getPreSymbolTable();
        }
    }
}
