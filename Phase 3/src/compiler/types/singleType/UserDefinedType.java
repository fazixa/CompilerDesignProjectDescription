package compiler.types.singleType;

import compiler.symbolTable.symbolTableItem.ClassDeclaration;
import compiler.types.Type;

public class UserDefinedType extends SingleType {
    private ClassDeclaration classDeclaration;
    public String name;
    public boolean isDefined = false;

    public UserDefinedType(ClassDeclaration cd, String name) {
        if (cd != null) {
            classDeclaration = cd;
            isDefined = true;
            this.name = name;
        } else {
            this.name = name;
        }
    }

    public ClassDeclaration getClassDeclaration() {
        return classDeclaration;
    }

    public void setClassDeclaration(ClassDeclaration typeClass) {
        this.classDeclaration = typeClass;
    }

    @Override
    public String toString() {
        return "[classType = " + name + ", isDefined = " + isDefined + "]";
    }

    @Override
    public boolean equals(Type type) {
        return (type instanceof UserDefinedType && type.toString().equals(toString()));
    }
}
