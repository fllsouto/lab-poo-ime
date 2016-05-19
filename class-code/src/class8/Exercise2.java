package class8;

import java.util.Random;
import java.util.Vector;

/**
 * Created by fsouto on 05/05/16.
 */
public class Exercise2 {
    public static void main(String[] args) {
        int indx = 10;
        int factor = 0;
        RnVector newRn = new RnVector(10);
        newRn.getRandomRnPoint();
//        newRn.showVector();
//        System.out.println("Element " + indx + " = " + newRn.getCoordenate(indx));
        System.out.println("Element " + indx + " multiply by factor " + factor + " equals to = " + newRn.divideCoordenate(indx, factor));

    }
}

class RnVector {

    private int[] vector;
    private int n;
    public RnVector(int n) {
        this.n = n;
        this.vector = new int[n];
    }

    public void showVector() {
        for(int i = 0; i < this.vector.length; i++) {
            System.out.println("[" + i + "] = " + this.vector[i]);
        }
    }

    public void getRandomRnPoint() {
        Random rand = new Random(System.currentTimeMillis());
        for(int i = 0; i < this.vector.length; i++) {
            this.vector[i] = rand.nextInt();
        }
    }

    public int getCoordenate(int indx) {
        return this.vector[indx];
    }

    public int divideCoordenate(int indx, int factor) {
        try {
            return getCoordenate(indx) / factor;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error type: " + e.toString());
        } catch (ArithmeticException e) {
            System.out.println("Error type: " + e.toString());
        }
        return 0;
    }
}
