package class11.refactoring;

/**
 * Created by fsouto on 16/06/16.
 */
public class Factorial {
    public static void main(String args[]) {
        double x = 10;
        double factorial_result = calculate_factorial_of(x);
        System.out.println("Factorial of f(" + x + ") = " + factorial_result);
    }

    public static double calculate_factorial_of(double x) {
        int i = 0;
        double factorial_acc = 1;
        for(; i < x; i++) {
            factorial_acc *= (x - i);
        }
        return factorial_acc;
    }
}
