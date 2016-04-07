package class6;

class Animal {
	void nasce() {
		System.out.println("Nasceu um animal");
	}
	void cresce() {
	    System.out.println("Cresceu um animal");
	}
}
class Mamifero extends Animal {
	void nasce(int i) {
		System.out.println("Nasceu um mamifero: "+i);
	}
	void nasce() {
		System.out.println("Nasceu um mamifero");
	}
	void cresce() {
		System.out.println("Cresceu um mamifero");
	}
	void sangueQuente() {
		System.out.println("Mamifero de sangue quente");
	}
	public static void main(String []argc) {
		Animal x = new Animal();
		x.nasce();
		x.cresce();
		Mamifero m = new Mamifero();
		m.nasce(1);
		x = m; // OK, pois Mamifero deriva de Animal
		x.nasce();
		x.cresce();
		((Mamifero) x).sangueQuente();
		// x.nasce(1); e esta linha ?
	}
}