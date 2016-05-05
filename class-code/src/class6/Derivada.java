// University of São Paulo - IME USP
//
// Object Oriented Programming Laboratory
// Assigment 6 - 04/07/2016
//
// Prof. Marcelo Finger
// Fellipe Souto Sampaio - 7990422
//
// Exercise 1
//

package class6;

class Base {
	private int num;
	
	Base(int num) {
		this.num = num;
		System.out.println("Constrói Base");
	}
}

public class Derivada extends Base {
	Derivada () {
		super(42);
		System.out.println("Constrói Derivada");
	}
	
	public static void main(String []argc){
		Derivada obj = new Derivada();
	}
}
