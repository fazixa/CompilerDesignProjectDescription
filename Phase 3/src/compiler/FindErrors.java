package compiler;

import compiler.error.Compare;
import compiler.gen.MiniJavaBaseListener;
import compiler.gen.MiniJavaParser;
import compiler.symbolTable.SymbolTable;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import compiler.error.Error;

import java.util.PriorityQueue;

public class FindErrors extends MiniJavaBaseListener {
    SymbolTable currentSymbolTable;
    public static PriorityQueue<Error> errors = new PriorityQueue<>(new Compare());

    @Override
    public void enterProgram(MiniJavaParser.ProgramContext ctx) {
        // get symbolTable: (name_[lineNumber]_[column])  for example: program_1_0
        currentSymbolTable = SymbolTable.getSymbolTableByKey("program_"+ctx.start.getLine() + "_0");
        System.out.println(currentSymbolTable);
        // TODO
    }

    @Override
    public void exitProgram(MiniJavaParser.ProgramContext ctx) {
        currentSymbolTable = currentSymbolTable.getPreSymbolTable();
        // TODO
    }

    @Override
    public void enterMainClass(MiniJavaParser.MainClassContext ctx) {
        // TODO
    }

    @Override
    public void exitMainClass(MiniJavaParser.MainClassContext ctx) {
        // TODO
    }

    @Override
    public void enterClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) {
        // TODO
    }

    @Override
    public void exitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) {
        // TODO
    }

    @Override
    public void enterInterfaceDeclaration(MiniJavaParser.InterfaceDeclarationContext ctx) {
        // TODO
    }

    @Override
    public void exitInterfaceDeclaration(MiniJavaParser.InterfaceDeclarationContext ctx) {
        // TODO
    }

    @Override
    public void enterInterfaceMethodDeclaration(MiniJavaParser.InterfaceMethodDeclarationContext ctx) {
        // TODO
    }

    @Override
    public void exitInterfaceMethodDeclaration(MiniJavaParser.InterfaceMethodDeclarationContext ctx) {
        // TODO
    }

    @Override
    public void enterFieldDeclaration(MiniJavaParser.FieldDeclarationContext ctx) {
        // TODO
    }

    @Override
    public void exitFieldDeclaration(MiniJavaParser.FieldDeclarationContext ctx) {
        // TODO
    }

    @Override
    public void enterLocalDeclaration(MiniJavaParser.LocalDeclarationContext ctx) {
        // TODO
    }

    @Override
    public void exitLocalDeclaration(MiniJavaParser.LocalDeclarationContext ctx) {
        // TODO
    }

    @Override
    public void enterMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx) {
        // TODO
    }

    @Override
    public void exitMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx) {
        // TODO
    }

    @Override
    public void enterParameterList(MiniJavaParser.ParameterListContext ctx) {
        // TODO
    }

    @Override
    public void exitParameterList(MiniJavaParser.ParameterListContext ctx) {
        // TODO
    }

    @Override
    public void enterParameter(MiniJavaParser.ParameterContext ctx) {
        // TODO
    }

    @Override
    public void exitParameter(MiniJavaParser.ParameterContext ctx) {
        // TODO
    }

    @Override
    public void enterMethodBody(MiniJavaParser.MethodBodyContext ctx) {
        // TODO
    }

    @Override
    public void exitMethodBody(MiniJavaParser.MethodBodyContext ctx) {
        // TODO
    }

    @Override
    public void enterType(MiniJavaParser.TypeContext ctx) {
        // TODO
    }

    @Override
    public void exitType(MiniJavaParser.TypeContext ctx) {
        // TODO
    }

    @Override
    public void enterBooleanType(MiniJavaParser.BooleanTypeContext ctx) {
        // TODO
    }

    @Override
    public void exitBooleanType(MiniJavaParser.BooleanTypeContext ctx) {
        // TODO
    }

    @Override
    public void enterIntType(MiniJavaParser.IntTypeContext ctx) {
        // TODO
    }

    @Override
    public void exitIntType(MiniJavaParser.IntTypeContext ctx) {
        // TODO
    }

    @Override
    public void enterReturnType(MiniJavaParser.ReturnTypeContext ctx) {
        // TODO
    }

    @Override
    public void exitReturnType(MiniJavaParser.ReturnTypeContext ctx) {
        // TODO
    }

    @Override
    public void enterAccessModifier(MiniJavaParser.AccessModifierContext ctx) {
        // TODO
    }

    @Override
    public void exitAccessModifier(MiniJavaParser.AccessModifierContext ctx) {
        // TODO
    }

    @Override
    public void enterNestedStatement(MiniJavaParser.NestedStatementContext ctx) {
        // TODO
    }

    @Override
    public void exitNestedStatement(MiniJavaParser.NestedStatementContext ctx) {
        // TODO
    }

    @Override
    public void enterIfElseStatement(MiniJavaParser.IfElseStatementContext ctx) {
        // TODO
    }

    @Override
    public void exitIfElseStatement(MiniJavaParser.IfElseStatementContext ctx) {
        // TODO
    }

    @Override
    public void enterWhileStatement(MiniJavaParser.WhileStatementContext ctx) {
        // TODO
    }

    @Override
    public void exitWhileStatement(MiniJavaParser.WhileStatementContext ctx) {
        // TODO
    }

    @Override
    public void enterPrintStatement(MiniJavaParser.PrintStatementContext ctx) {
        // TODO
    }

    @Override
    public void exitPrintStatement(MiniJavaParser.PrintStatementContext ctx) {
        // TODO
    }

    @Override
    public void enterVariableAssignmentStatement(MiniJavaParser.VariableAssignmentStatementContext ctx) {
        // TODO
    }

    @Override
    public void exitVariableAssignmentStatement(MiniJavaParser.VariableAssignmentStatementContext ctx) {
        // TODO
    }

    @Override
    public void enterArrayAssignmentStatement(MiniJavaParser.ArrayAssignmentStatementContext ctx) {
        // TODO
    }

    @Override
    public void exitArrayAssignmentStatement(MiniJavaParser.ArrayAssignmentStatementContext ctx) {
        // TODO
    }

    @Override
    public void enterLocalVarDeclaration(MiniJavaParser.LocalVarDeclarationContext ctx) {
        // TODO
    }

    @Override
    public void exitLocalVarDeclaration(MiniJavaParser.LocalVarDeclarationContext ctx) {
        // TODO
    }

    @Override
    public void enterExpressioncall(MiniJavaParser.ExpressioncallContext ctx) {
        // TODO
    }

    @Override
    public void exitExpressioncall(MiniJavaParser.ExpressioncallContext ctx) {
        // TODO
    }

    @Override
    public void enterIfBlock(MiniJavaParser.IfBlockContext ctx) {
        // TODO
    }

    @Override
    public void exitIfBlock(MiniJavaParser.IfBlockContext ctx) {
        // TODO
    }

    @Override
    public void enterElseBlock(MiniJavaParser.ElseBlockContext ctx) {
        // TODO
    }

    @Override
    public void exitElseBlock(MiniJavaParser.ElseBlockContext ctx) {
        // TODO
    }

    @Override
    public void enterWhileBlock(MiniJavaParser.WhileBlockContext ctx) {
        // TODO
    }

    @Override
    public void exitWhileBlock(MiniJavaParser.WhileBlockContext ctx) {
        // TODO
    }

    @Override
    public void enterLtExpression(MiniJavaParser.LtExpressionContext ctx) {
        // TODO
    }

    @Override
    public void exitLtExpression(MiniJavaParser.LtExpressionContext ctx) {
        // TODO
    }

    @Override
    public void enterObjectInstantiationExpression(MiniJavaParser.ObjectInstantiationExpressionContext ctx) {
        // TODO
    }

    @Override
    public void exitObjectInstantiationExpression(MiniJavaParser.ObjectInstantiationExpressionContext ctx) {
        // TODO
    }

    @Override
    public void enterArrayInstantiationExpression(MiniJavaParser.ArrayInstantiationExpressionContext ctx) {
        // TODO
    }

    @Override
    public void exitArrayInstantiationExpression(MiniJavaParser.ArrayInstantiationExpressionContext ctx) {
        // TODO
    }

    @Override
    public void enterPowExpression(MiniJavaParser.PowExpressionContext ctx) {
        // TODO
    }

    @Override
    public void exitPowExpression(MiniJavaParser.PowExpressionContext ctx) {
        // TODO
    }

    @Override
    public void enterIdentifierExpression(MiniJavaParser.IdentifierExpressionContext ctx) {
        // TODO
    }

    @Override
    public void exitIdentifierExpression(MiniJavaParser.IdentifierExpressionContext ctx) {
        // TODO
    }

    @Override
    public void enterMethodCallExpression(MiniJavaParser.MethodCallExpressionContext ctx) {
        // TODO
    }

    @Override
    public void exitMethodCallExpression(MiniJavaParser.MethodCallExpressionContext ctx) {
        // TODO
    }

    @Override
    public void enterNotExpression(MiniJavaParser.NotExpressionContext ctx) {
        // TODO
    }

    @Override
    public void exitNotExpression(MiniJavaParser.NotExpressionContext ctx) {
        // TODO
    }

    @Override
    public void enterBooleanLitExpression(MiniJavaParser.BooleanLitExpressionContext ctx) {
        // TODO
    }

    @Override
    public void exitBooleanLitExpression(MiniJavaParser.BooleanLitExpressionContext ctx) {
        // TODO
    }

    @Override
    public void enterParenExpression(MiniJavaParser.ParenExpressionContext ctx) {
        // TODO
    }

    @Override
    public void exitParenExpression(MiniJavaParser.ParenExpressionContext ctx) {
        // TODO
    }

    @Override
    public void enterIntLitExpression(MiniJavaParser.IntLitExpressionContext ctx) {
        // TODO
    }

    @Override
    public void exitIntLitExpression(MiniJavaParser.IntLitExpressionContext ctx) {
        // TODO
    }

    @Override
    public void enterNullLitExpression(MiniJavaParser.NullLitExpressionContext ctx) {
        // TODO
    }

    @Override
    public void exitNullLitExpression(MiniJavaParser.NullLitExpressionContext ctx) {
        // TODO
    }

    @Override
    public void enterAndExpression(MiniJavaParser.AndExpressionContext ctx) {
        // TODO
    }

    @Override
    public void exitAndExpression(MiniJavaParser.AndExpressionContext ctx) {
        // TODO
    }

    @Override
    public void enterArrayAccessExpression(MiniJavaParser.ArrayAccessExpressionContext ctx) {
        // TODO
    }

    @Override
    public void exitArrayAccessExpression(MiniJavaParser.ArrayAccessExpressionContext ctx) {
        // TODO
    }

    @Override
    public void enterAddExpression(MiniJavaParser.AddExpressionContext ctx) {
        // TODO
    }

    @Override
    public void exitAddExpression(MiniJavaParser.AddExpressionContext ctx) {
        // TODO
    }

    @Override
    public void enterThisExpression(MiniJavaParser.ThisExpressionContext ctx) {
        // TODO
    }

    @Override
    public void exitThisExpression(MiniJavaParser.ThisExpressionContext ctx) {
        // TODO
    }

    @Override
    public void enterFieldCallExpression(MiniJavaParser.FieldCallExpressionContext ctx) {
        // TODO
    }

    @Override
    public void exitFieldCallExpression(MiniJavaParser.FieldCallExpressionContext ctx) {
        // TODO
    }

    @Override
    public void enterArrayLengthExpression(MiniJavaParser.ArrayLengthExpressionContext ctx) {
        // TODO
    }

    @Override
    public void exitArrayLengthExpression(MiniJavaParser.ArrayLengthExpressionContext ctx) {
        // TODO
    }

    @Override
    public void enterIntarrayInstantiationExpression(MiniJavaParser.IntarrayInstantiationExpressionContext ctx) {
        // TODO
    }

    @Override
    public void exitIntarrayInstantiationExpression(MiniJavaParser.IntarrayInstantiationExpressionContext ctx) {
        // TODO
    }

    @Override
    public void enterSubExpression(MiniJavaParser.SubExpressionContext ctx) {
        // TODO
    }

    @Override
    public void exitSubExpression(MiniJavaParser.SubExpressionContext ctx) {
        // TODO
    }

    @Override
    public void enterMulExpression(MiniJavaParser.MulExpressionContext ctx) {
        // TODO
    }

    @Override
    public void exitMulExpression(MiniJavaParser.MulExpressionContext ctx) {
        // TODO
    }


    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        // TODO
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        // TODO
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        // TODO
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        // TODO
    }
}