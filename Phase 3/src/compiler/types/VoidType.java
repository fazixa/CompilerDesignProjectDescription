package compiler.types;

public class VoidType extends Type {
    @Override
    public String toString() {
        return "void";
    }

    @Override
    public boolean equals(Type type) {
        return type instanceof VoidType;
    }
}
