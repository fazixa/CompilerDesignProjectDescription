package compiler.symbolTable.symbolTableItem;

public abstract class SymbolTableItem {

    protected String name;
    public  int lineNumber;
    public int column ;
    public abstract String getKey();
    public void setLine_column(int line, int column){
        this.lineNumber = line;
        this.column = column;
    }
    public String getLocation(){
        return lineNumber + ":" + column;
    }
    public String getName()
    {
        return name;
    }
    public void setName( String name )
    {
        this.name = name;
    }
}
