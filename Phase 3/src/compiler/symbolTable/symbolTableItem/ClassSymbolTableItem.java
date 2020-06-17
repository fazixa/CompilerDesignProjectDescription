package compiler.symbolTable.symbolTableItem;

import java.util.LinkedList;
import java.util.List;

public class ClassSymbolTableItem extends ClassDeclaration{

    public static final String classModifier = "class_";
    public ClassDeclaration parent;
    public List<InterfaceSymbolTableItem> parents;

    public ClassSymbolTableItem(String name) {
        this.name = name;
        this.parents = new LinkedList<>();
    }

    public void setParent(ClassDeclaration parent) {
        this.parent = parent;
    }

    public void setParents(List<InterfaceSymbolTableItem> parents) {
        this.parents = parents;
    }

    @Override
    public String toString() {
        String out;
        if(!this.name.equals("Object")) {
            out = "Class: " + "(name: " + this.name + ") " + "(extends : " + parent.name;
        }else {
            return "Class: " + "(name: " + this.name + ") ";
        }
        if(!parents.isEmpty()){
            out +=  " | implements: " ;
            int i ;
            for ( i = 0 ; i < parents.size() - 1 ; i++ ){
                out += parents.get(i).name +", ";
            }
            out += parents.get(i).name ;
        }
        return out +")";
    }

    public void printParentsTable(){
        ((ClassSymbolTableItem) parent).symbolTable.printItems();
    }

    @Override
    public String getKey() {
        return ClassSymbolTableItem.classModifier + name;
    }


}
