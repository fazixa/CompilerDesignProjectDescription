package compiler.error;

public class Error{
    public int type;
    public int line;
    public int column;
    String text;

    public Error(int type, int line, int column, String text){
        this.column = column;
        this.line = line;
        this.text = text;
        this.type = type;
    }

    public String toString(){
        return "Error" + type + " : in line " + line + ":" + column + " , " + text;
    }

}


