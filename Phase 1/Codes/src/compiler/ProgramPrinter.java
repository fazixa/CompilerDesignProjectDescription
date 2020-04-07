package compiler;
import compiler.gen.MiniJavaBaseListener;
import compiler.gen.MiniJavaParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramPrinter extends MiniJavaBaseListener {

    String program = "";

    @Override public void enterProgram(MiniJavaParser.ProgramContext ctx) {
        program += "program start{\n";
        // TODO Implement this!
    }

    @Override public void exitProgram(MiniJavaParser.ProgramContext ctx) {
        program += "}\n";
        try {
            FileWriter myWriter = new FileWriter("src/outputs/output.txt");
            myWriter.write(program);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        // TODO Implement this!
    }

    @Override public void enterImportClass(MiniJavaParser.ImportClassContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitImportClass(MiniJavaParser.ImportClassContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterMainClass(MiniJavaParser.MainClassContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitMainClass(MiniJavaParser.MainClassContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterInterfaceDeclaration(MiniJavaParser.InterfaceDeclarationContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitInterfaceDeclaration(MiniJavaParser.InterfaceDeclarationContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterInterfaceMethodDeclaration(MiniJavaParser.InterfaceMethodDeclarationContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitInterfaceMethodDeclaration(MiniJavaParser.InterfaceMethodDeclarationContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterFieldDeclaration(MiniJavaParser.FieldDeclarationContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitFieldDeclaration(MiniJavaParser.FieldDeclarationContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterLocalDeclaration(MiniJavaParser.LocalDeclarationContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitLocalDeclaration(MiniJavaParser.LocalDeclarationContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterParameterList(MiniJavaParser.ParameterListContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitParameterList(MiniJavaParser.ParameterListContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterParameter(MiniJavaParser.ParameterContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitParameter(MiniJavaParser.ParameterContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterMethodBody(MiniJavaParser.MethodBodyContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitMethodBody(MiniJavaParser.MethodBodyContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterType(MiniJavaParser.TypeContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitType(MiniJavaParser.TypeContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterBooleanType(MiniJavaParser.BooleanTypeContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitBooleanType(MiniJavaParser.BooleanTypeContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterIntType(MiniJavaParser.IntTypeContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitIntType(MiniJavaParser.IntTypeContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterReturnType(MiniJavaParser.ReturnTypeContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitReturnType(MiniJavaParser.ReturnTypeContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterAccessModifier(MiniJavaParser.AccessModifierContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitAccessModifier(MiniJavaParser.AccessModifierContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterNestedStatement(MiniJavaParser.NestedStatementContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitNestedStatement(MiniJavaParser.NestedStatementContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterIfElseStatement(MiniJavaParser.IfElseStatementContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitIfElseStatement(MiniJavaParser.IfElseStatementContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterWhileStatement(MiniJavaParser.WhileStatementContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitWhileStatement(MiniJavaParser.WhileStatementContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterPrintStatement(MiniJavaParser.PrintStatementContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitPrintStatement(MiniJavaParser.PrintStatementContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterVariableAssignmentStatement(MiniJavaParser.VariableAssignmentStatementContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitVariableAssignmentStatement(MiniJavaParser.VariableAssignmentStatementContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterArrayAssignmentStatement(MiniJavaParser.ArrayAssignmentStatementContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitArrayAssignmentStatement(MiniJavaParser.ArrayAssignmentStatementContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterLocalVarDeclaration(MiniJavaParser.LocalVarDeclarationContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitLocalVarDeclaration(MiniJavaParser.LocalVarDeclarationContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterExpressioncall(MiniJavaParser.ExpressioncallContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitExpressioncall(MiniJavaParser.ExpressioncallContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterIfBlock(MiniJavaParser.IfBlockContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitIfBlock(MiniJavaParser.IfBlockContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterElseBlock(MiniJavaParser.ElseBlockContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitElseBlock(MiniJavaParser.ElseBlockContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterWhileBlock(MiniJavaParser.WhileBlockContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitWhileBlock(MiniJavaParser.WhileBlockContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterLtExpression(MiniJavaParser.LtExpressionContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitLtExpression(MiniJavaParser.LtExpressionContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterObjectInstantiationExpression(MiniJavaParser.ObjectInstantiationExpressionContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitObjectInstantiationExpression(MiniJavaParser.ObjectInstantiationExpressionContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterArrayInstantiationExpression(MiniJavaParser.ArrayInstantiationExpressionContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitArrayInstantiationExpression(MiniJavaParser.ArrayInstantiationExpressionContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterPowExpression(MiniJavaParser.PowExpressionContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitPowExpression(MiniJavaParser.PowExpressionContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterIdentifierExpression(MiniJavaParser.IdentifierExpressionContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitIdentifierExpression(MiniJavaParser.IdentifierExpressionContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterMethodCallExpression(MiniJavaParser.MethodCallExpressionContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitMethodCallExpression(MiniJavaParser.MethodCallExpressionContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterNotExpression(MiniJavaParser.NotExpressionContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitNotExpression(MiniJavaParser.NotExpressionContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterBooleanLitExpression(MiniJavaParser.BooleanLitExpressionContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitBooleanLitExpression(MiniJavaParser.BooleanLitExpressionContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterParenExpression(MiniJavaParser.ParenExpressionContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitParenExpression(MiniJavaParser.ParenExpressionContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterIntLitExpression(MiniJavaParser.IntLitExpressionContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitIntLitExpression(MiniJavaParser.IntLitExpressionContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterNullLitExpression(MiniJavaParser.NullLitExpressionContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitNullLitExpression(MiniJavaParser.NullLitExpressionContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterAndExpression(MiniJavaParser.AndExpressionContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitAndExpression(MiniJavaParser.AndExpressionContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterArrayAccessExpression(MiniJavaParser.ArrayAccessExpressionContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitArrayAccessExpression(MiniJavaParser.ArrayAccessExpressionContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterAddExpression(MiniJavaParser.AddExpressionContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitAddExpression(MiniJavaParser.AddExpressionContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterThisExpression(MiniJavaParser.ThisExpressionContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitThisExpression(MiniJavaParser.ThisExpressionContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterFieldCallExpression(MiniJavaParser.FieldCallExpressionContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitFieldCallExpression(MiniJavaParser.FieldCallExpressionContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterArrayLengthExpression(MiniJavaParser.ArrayLengthExpressionContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitArrayLengthExpression(MiniJavaParser.ArrayLengthExpressionContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterIntarrayInstantiationExpression(MiniJavaParser.IntarrayInstantiationExpressionContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitIntarrayInstantiationExpression(MiniJavaParser.IntarrayInstantiationExpressionContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterSubExpression(MiniJavaParser.SubExpressionContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitSubExpression(MiniJavaParser.SubExpressionContext ctx) {
        // TODO Implement this!
    }

    @Override public void enterMulExpression(MiniJavaParser.MulExpressionContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitMulExpression(MiniJavaParser.MulExpressionContext ctx) {
        // TODO Implement this!
    }


    @Override public void enterEveryRule(ParserRuleContext ctx) {
        // TODO Implement this!
    }

    @Override public void exitEveryRule(ParserRuleContext ctx) {
        // TODO Implement this!
    }

    @Override public void visitTerminal(TerminalNode node) {
        // TODO Implement this!
    }

    @Override public void visitErrorNode(ErrorNode node) {
        // TODO Implement this!
    }
}