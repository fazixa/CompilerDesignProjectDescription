package compiler.types.singleType;


import compiler.types.Type;

public class BoolType extends SingleType {
    @Override
    public String toString() {
        return "bool";
    }

    @Override
    public boolean equals(Type type) {
        return type instanceof BoolType;
    }
}
