package class8;

/**
 * Created by fsouto on 05/05/16.
 */
public class MatrizFactory {
    public static void main(String[] args) {
        String foo1 = "matriz 0-1 3 5";
        String foo2 = "matriz int 10 5";
        String foo3 = "matriz int 1 0";
        recebeCodigo(foo1);
        recebeCodigo(foo2);
        recebeCodigo(foo3);
    }

    public static void recebeCodigo(String codigo) {
        String[] conf = codigo.split(" ", 4);
        String type = conf[1];
        int rowNumber = Integer.parseInt(conf[2]);
        int columnNumber = Integer.parseInt(conf[3]);

        System.out.println("Type: " + type );
        System.out.println("Row: " + rowNumber);
        System.out.println("Column: " + columnNumber);
        System.out.println("\n");

        switch (type) {
            case "0-1":
                System.out.println("TYPE EQUALS 0-1");
                break;
            case "int":
                System.out.println("TYPE EQUALS INT");
                break;
            case "double":
                System.out.println("TYPE EQUALS DOUBLE");
                break;
            default:
                throw new MatrizTypeException("Matriz Type Error :" + type);
        }

        if(rowNumber > 0)
            System.out.println("Rows number = " + rowNumber);
        else {
            System.out.println("Rows number Error!");
            throw new ColumnNumberException("Rows number Error :" + rowNumber);
        }

        if(columnNumber> 0)
            System.out.println("Columns number = " + columnNumber);
        else {
            System.out.println("Columns number Error!");
            throw new ColumnNumberException("Columns number Error :" + columnNumber);
        }

    }
}

class MatrizTypeException extends RuntimeException{

    public MatrizTypeException(String errorMessage) {
        super(errorMessage);
    }
}

class RowNumberException extends RuntimeException{

    public RowNumberException(String errorMessage) {
        super(errorMessage);
    }
}

class ColumnNumberException extends RuntimeException{

    public ColumnNumberException(String errorMessage) {
        super(errorMessage);
    }
}