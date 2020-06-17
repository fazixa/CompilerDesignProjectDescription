package compiler.symbolTable;
import compiler.symbolTable.symbolTableItem.SymbolTableItem;
import compiler.symbolTable.symbolTableItem.varItems.FieldSymbolTableItem;
import compiler.symbolTable.symbolTableItem.varItems.LocalVariableSymbolTableItem;

import java.util.*;

public class SymbolTable {
    private SymbolTable pre;
    private Map<String, SymbolTableItem> items;
    private static Map<String, SymbolTable> symbolTables = new HashMap<>();
    public int line;
    public int column;
    public String name;
    private static SymbolTable top;
    private static Stack<SymbolTable> stack = new Stack<>();
    private static Queue<SymbolTable> queue = new LinkedList<>();

    public SymbolTable(int line, int column, String name, SymbolTable pre) {
        this.line = line;
        this.name = name;
        this.column = column;
        this.pre = pre;
        this.items = new HashMap<>();
    }

    public static void push(SymbolTable symbolTable) {
        if (top != null)
            stack.push(top);
        top = symbolTable;
        queue.offer(symbolTable);
        symbolTables.put(symbolTable.name + "_" + symbolTable.line + "_" + symbolTable.column, symbolTable);
    }

    public static SymbolTable getSymbolTableByKey(String key) {
        return symbolTables.get(key);
    }

    public boolean put(SymbolTableItem item) {
        if (isAlreadyExists(item)) {
            return true;
        }
        items.put(item.getKey(), item);
        return false;
    }

    public boolean isAlreadyExists(SymbolTableItem item) {
        SymbolTable pre = this;
        while (pre != null) {
            if (pre.items.containsKey(item.getKey())) {
                if (item instanceof FieldSymbolTableItem ) {
                    if (!(pre.items.get(item.getKey()) instanceof FieldSymbolTableItem)) {
                        return false;
                    }
                }
                if(item instanceof LocalVariableSymbolTableItem) {
                    if (!(pre.items.get(item.getKey()) instanceof LocalVariableSymbolTableItem)) {
                        return false;
                    }
                }
                return true;
            }
            pre = pre.pre;
        }
        return false;
    }

    public SymbolTableItem get(String key){
        // TODO !!!!!!
        return items.get(key);
    }

    public SymbolTable getPreSymbolTable() {
        return pre;
    }

    @Override
    public String toString() {
        return "-------------  " + name + " : " + line + "  -------------\n" +
                printItems() +
                "-----------------------------------------\n";
    }

    public String printItems() {
        String itemsStr = "";
        for (Map.Entry<String, SymbolTableItem> entry : items.entrySet()) {
            SymbolTableItem symbolTableItem = entry.getValue();
            itemsStr += "Key = " + entry.getKey() + "  | Value = " + symbolTableItem + "\n";
        }
        return itemsStr;
    }

    public static void printAll() {
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
