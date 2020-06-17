package compiler.symbolTable.symbolTableItem.varItems;
import compiler.accessModifier.AccessModifier;
import compiler.types.Type;

public class FieldSymbolTableItem extends VarSymbolTableItem {

    private AccessModifier accessModifier;

    public FieldSymbolTableItem(String name, Type type, AccessModifier accessModifier) {
        this.name = name;
        this.accessModifier = accessModifier;
        this.type = type;
    }

    @Override public String toString(){
        return "Field: " + "(name: " + name + ") (type: " + type + ") (accessModifier: " + accessModifier + ")";
    }

    public AccessModifier getAccessModifier() {
        return accessModifier;
    }

    public void setAccessModifier(AccessModifier accessModifier) {
        this.accessModifier = accessModifier;
    }

    public Type getFieldType() {
        return type;
    }

    public void setFieldType(Type fieldType) {
        this.type = fieldType;
    }
}
