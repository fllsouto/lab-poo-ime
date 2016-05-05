package class6;

class Animal2 {
    void nasce() {
        System.out.println("Nasceu um animal");
    }
    void cresce() {
        System.out.println("Cresceu um animal");
    }
}
class Mamifero2 extends Animal2 {
	void nasce(int x) { // coloque um parametro aqui por exemplo...
	    System.out.println("Nasceu um mamifero: " + x);
	}
	public void cresce() {
	    System.out.println("Cresceu um mamifero");
	}
	public String cresce() {
	    return "Cresceu um mamifero";
	}
}

public class Homem extends Mamifero2 {
	    void nasce() {
	        System.out.println("Nasceu um homem");
	    }
	    void cresce() {
	        System.out.println("Cresceu um homem");
	    }
	    public static void main(String []argc) {
	        Animal2 x = new Animal2();
	        x.nasce();
	        Homem h = new Homem();
	        h.nasce();
	        h.nasce(1);
			x = h; // OK, pois Homem deriva de Animal
			x.nasce();
	}
}