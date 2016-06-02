// University of São Paulo - IME USP
//
// Object Oriented Programming Laboratory
// Assigment 6 - 04/07/2016
//
// Prof. Marcelo Finger
// Fellipe Souto Sampaio - 7990422
//
// Exercise 2
//


package class6;

class Parent {
	public static final int finalConstant = 42;
	public final String name;
	
	public Parent(String name) {
		this.name = name;
	}
	
	public final String getName() {
		return "My Parent name";
	}
	
//	public static void changeFinal(int num) {
//		Parent.finalConstant = num;
//	}
	
}

class Child extends Parent {
	public static final int finalConstant = 43;
	public Child(String name) {
		super(name);
	}
	
//	public void changeName(String name) {
//		this.name = name;
//	}


//	public String getName() {
//		return "Parent name:" + this.name;
//	}
//	
}

public class ExercicioFinal {
	public static void main(String[] args) {
		Child new_child = new Child("João");
		System.out.println(new_child.getName());
//		Parent.changeFinal(43);
		System.out.println("Constant is :" + Parent.finalConstant);
//		new_child.changeName("Carlos");
//		System.out.println(new_child.getName());
	}
}


