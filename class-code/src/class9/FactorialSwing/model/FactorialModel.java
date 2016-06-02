package class9.FactorialSwing.model;

/**
 * Created by fsouto on 19/05/16.
 */

import class9.FactorialSwing.err.FactorialModelException;

import java.math.BigInteger;

public class FactorialModel {
    int nFat;
    BigInteger fat;

    public FactorialModel(int n) throws FactorialModelException {
        if(n < 0)
            throw new FactorialModelException("Error, the number must be greather than zero!");

        nFat = n;
        fat = BigInteger.valueOf(1);
    }

    public String getFat() {
        return calcFat().toString();
    }

    private BigInteger calcFat() {
        for(int i = 0; i < nFat; i++)
            fat = fat.multiply(BigInteger.valueOf(nFat - i));

        return fat;
    }
}

