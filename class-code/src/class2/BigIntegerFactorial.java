// University of São Paulo - IME USP
//
// Object Oriented Programming Laboratory
// Assigment 2 - 02/25/2016
//
// Prof. Marcelo Finger
// Fellipe Souto Sampaio - 7990422

package class2;

import java.math.BigInteger;

class BigIntFactorial {
	int nFat;
	BigInteger fat;
	
	public BigIntFactorial(int n) {
		nFat = n;
		fat = BigInteger.valueOf(1);
	}
	
	public BigIntFactorial calcFat() {
		for(int i = 0; i < nFat; i++)
			fat = fat.multiply(BigInteger.valueOf(nFat - i));
		
		return this;
	}
	
	public BigInteger getFat() {
		return fat;
	}
	
	public int nFat() {
		return nFat;
	}
}

public class BigIntegerFactorial {
	public static void main(String[] args) {
		if(testFactorial(3,BigInteger.valueOf(6)) && testFactorial(6,BigInteger.valueOf(720)) && testFactorial(9, BigInteger.valueOf(362880))) {
			System.out.println("All test passed!");
		} else {
			System.out.println("Someone test not passed!");
		}
	}
	
	public static Boolean testFactorial(int k, BigInteger expected) {
		BigIntFactorial fat = new BigIntFactorial(k);

		if(fat.calcFat().getFat().equals(expected)) {
			System.out.println(fat.nFat() + "! == " + expected);
			return true;
		} else {
			System.out.println(fat.nFat() + "! != " + expected);
			return false;
		}
	}
	

}