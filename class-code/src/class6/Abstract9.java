package class6;

abstract class AbstractWithoutMethods {
	abstract public void methodFoo();
}

class DerivatedAbstract extends AbstractWithoutMethods {
	public static void staticMethod(AbstractWithoutMethods p) {
//		((DerivatedAbstract) p).methodFoo();
		p.methodFoo();
	}
	
	public void methodFoo() {
		System.out.println("Method foo");
	}
}
public class Abstract9 {
	public static void main(String[] args) {
		DerivatedAbstract da = new DerivatedAbstract();
		DerivatedAbstract.staticMethod(da);
	}
}
