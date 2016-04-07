// University of São Paulo - IME USP
//
// Object Oriented Programming Laboratory
// Assigment 2 - 02/25/2016
//
// Prof. Marcelo Finger
// Fellipe Souto Sampaio - 7990422

package class2;

class Factorial {
	int nFat;
	int fat;
	
	public Factorial(int n) {
		nFat = n;
		fat = 1;
	}
	
	public Factorial calcFat() {
		for(int i = 0; i < nFat; i++)
			fat = fat*(nFat - i);
		return this;
	}
	
	public int getFat() {
		return fat;
	}
	
	public int nFat() {
		return nFat;
	}
}

public class SimpleFactorial {
	public static void main(String[] args) {
		if(testFactorial(3,6) && testFactorial(6,720) && testFactorial(9, 362880)) {
			System.out.println("All test passed!");
		} else {
			System.out.println("Someone test not passed!");
		}
	}
	
	public static Boolean testFactorial(int k, int expected) {
		Factorial fat = new Factorial(k);

		if(fat.calcFat().getFat() == expected) {
			System.out.println(fat.nFat() + "! == " + expected);
			return true;
		} else {
			System.out.println(fat.nFat() + "! != " + expected);
			return false;
		}
	}

}