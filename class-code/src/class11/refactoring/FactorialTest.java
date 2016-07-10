package class11.refactoring;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fsouto on 16/06/16.
 */
public class FactorialTest {
    public final double DELTA = 0.00001;

    @Test
    public void testCalculateFactorialOf() {
        double x1 = 0;
        double x2 = 5;
        double x3 = 10;
        double factorial_of_x1 = 1.0;
        double factorial_of_x2 = 120.0;
        double factorial_of_x3 = 3628800.0;
        Assert.assertEquals(factorial_of_x1, Factorial.calculate_factorial_of(x1), DELTA);
        Assert.assertEquals(factorial_of_x2, Factorial.calculate_factorial_of(x2), DELTA);
        Assert.assertEquals(factorial_of_x3, Factorial.calculate_factorial_of(x3), DELTA);
    }

}