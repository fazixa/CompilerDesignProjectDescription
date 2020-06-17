package compiler.symbolTable.symbolTableItem;

public class MainClassSymbolItem extends ClassDeclaration {

    public static final String mainClassModifier = "mainClass_";

    public MainClassSymbolItem(String name) {
        this.name = name;
    }

    @Override
    public String getKey() {
        return MainClassSymbolItem.mainClassModifier + name;
    }

    @Override
    public String toString() {
        return "MainClass: " + "(name: " + this.name + ")";
    }

}
