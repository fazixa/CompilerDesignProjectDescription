package compiler.symbolTable.symbolTableItem;

import compiler.symbolTable.SymbolTable;

public class InterfaceSymbolTableItem extends ClassDeclaration{

    public static final String interfaceModifier = "interface_";

    public InterfaceSymbolTableItem(String name) {
        this.name = name;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    @Override
    public String toString() {
        return "Interface: " + "(name: " + this.name + ")";
    }

    @Override
    public String getKey() {
        return InterfaceSymbolTableItem.interfaceModifier + name;
    }

}