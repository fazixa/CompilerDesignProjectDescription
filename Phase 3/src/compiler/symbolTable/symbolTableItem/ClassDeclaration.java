package compiler.symbolTable.symbolTableItem;

import compiler.symbolTable.SymbolTable;

public  abstract class ClassDeclaration  extends SymbolTableItem{
    public SymbolTable symbolTable;
    public SymbolTable getSymbolTable() {
        return symbolTable;
    }
    
    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }
}
