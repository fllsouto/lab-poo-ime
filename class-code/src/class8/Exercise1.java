package class8;

/**
 * Created by fsouto on 05/05/16.
 */
public class Exercise1 {
    public static void main(String[] args) {
        int[] numberList = {0,1,2,3};
        for(int i = 0; i < numberList.length; i++)
            System.out.println("[" + i + "] = " + numberList[i]);

        try {
            System.out.println("[" + numberList.length + "] = " + numberList[numberList.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error type: " + e.toString());
            System.out.println("Tryed to acess position [" + e.getMessage() + "] of Array with length " + numberList.length);
        }
    }
}
