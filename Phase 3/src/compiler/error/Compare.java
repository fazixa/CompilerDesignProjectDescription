package compiler.error;

import java.util.Comparator;

public class Compare implements Comparator<Error> {
    @Override
    public int compare(Error x, Error y) {
        if (x.line == y.line) {
            if (x.column > y.column) {
                return 1;
            } else {
                return -1;
            }
        }
        if(x.line > y.line) {
            return 1;
        }else {
            return -1;
        }
    }
}

