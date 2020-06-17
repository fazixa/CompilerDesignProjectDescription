package compiler.symbolTable.symbolTableItem.varItems;

import compiler.symbolTable.symbolTableItem.SymbolTableItem;
import compiler.types.Type;

public abstract class VarSymbolTableItem extends SymbolTableItem {
    public static String var_modifier = "var_";
    protected Type type;

    public String getKey() {
        return VarSymbolTableItem.var_modifier + name;
    }

    public Type getType() {
        return type;
    }
}
