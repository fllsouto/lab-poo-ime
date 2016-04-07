// University of São Paulo - IME USP
//
// Object Oriented Programming Laboratory
// Assigment 5 - 03/17/2016
//
// Prof. Marcelo Finger
// Fellipe Souto Sampaio - 7990422

package class5.fibonaccijunit;

public class Fibonacci {
	public static void main(String[] args) {
		System.out.println("Valor do fibonacci : " + fibonacci(5));
	}
	
	public static int fibonacci(int n) {
		if (n <= 0) {
			return -1;
		} else if(n == 1 || n == 2) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
		
	}
}
