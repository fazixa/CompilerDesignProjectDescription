package compiler.types.arrayType;

import compiler.types.Type;
import compiler.types.singleType.SingleType;

public class ArrayType extends Type {
    private SingleType singleType;

    public ArrayType(SingleType s) {
        this.singleType = s;
    }

    public SingleType getSingleType() {
        return singleType;
    }

    public void setSingleType(SingleType singleType) {
        this.singleType = singleType;
    }

    @Override
    public String toString() {
        return "array of " + singleType.toString();
    }

    @Override
    public boolean equals(Type type) {
        if( type instanceof ArrayType)
            return ((ArrayType) type).getSingleType().equals(singleType);
        else
            return false;
    }
}
