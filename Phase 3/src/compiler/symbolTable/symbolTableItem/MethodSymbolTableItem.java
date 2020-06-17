package compiler.symbolTable.symbolTableItem;

import compiler.accessModifier.AccessModifier;
import compiler.types.Type;

import java.util.LinkedList;
import java.util.List;

public class MethodSymbolTableItem extends SymbolTableItem {
    public static final String methodModifier = "method_";
    private Type returnType;
    public List<Type> argumentsTypes;
    private AccessModifier accessModifier;

    public MethodSymbolTableItem(String name, Type returnType, AccessModifier accessModifier) {
        this.returnType = returnType;
        this.name = name;
        argumentsTypes = new LinkedList<>();
        this.accessModifier = accessModifier;
    }

    public void addParameter(Type type){
        argumentsTypes.add(type);
    }

    @Override
    public String toString(){
        String method = "Method: " +  "(name: " + name + ") (returnType: " + returnType + ") (accessModifier: "
                + accessModifier + ")";
        if (argumentsTypes.size() == 0){
            return method;
        }
        String types = " (parametersType:";
        for (int i=0; i<argumentsTypes.size(); i++){
            types += " [" +argumentsTypes.get(i) + " , index: " + (i+1) + "] ";
        }

        return  method + types + ")";
    }

    @Override
    public String getKey() {
        return MethodSymbolTableItem.methodModifier + name;
    }

    public List<Type> getArgumentsTypes() {
        return argumentsTypes;
    }

    public Type getReturnType() {
        return returnType;
    }

    public AccessModifier getAccessModifier() {
        return accessModifier;
    }

    public void setAccessModifier(AccessModifier accessModifier) {
        this.accessModifier = accessModifier;
    }
}
