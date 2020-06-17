package compiler.symbolTable.symbolTableItem.varItems;

import compiler.types.Type;

public class LocalVariableSymbolTableItem extends VarSymbolTableItem  {

    private int index;  // if not equals 0 -> parameter

    public LocalVariableSymbolTableItem(String name, Type type, int index) {
        this.name = name;
        this.type = type;
        this.index = index;
    }

    public LocalVariableSymbolTableItem(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public int getIndex() {
        return index;
    }

    public Type getVarType() {
        return type;
    }

    public void setVarType(Type varType) {
        this.type = varType;
    }

    @Override
    public String toString() {
        if (index == 0){
            return "LocalVar: " + "(name: " + name + ") (type: " + type + ")";
        }
        return "Parameter: " + "(name: " + name + ") (type: " + type + ") (index: " + index + ")";
    }

}
