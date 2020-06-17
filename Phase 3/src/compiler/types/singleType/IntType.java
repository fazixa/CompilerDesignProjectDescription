package compiler.types.singleType;


import compiler.types.Type;

public class IntType extends SingleType {
    @Override
    public String toString() {
        return "int";
    }

    @Override
    public boolean equals(Type type) {
        return type instanceof IntType;
    }
}
