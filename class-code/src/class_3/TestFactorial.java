package class_3;

public class TestFactorial {
	
	public static void main(String[] args) {
		System.out.println("Fatorial de 5 = " + calculateFactorial(5) );
		System.out.println("Fatorial de 10 = " + calculateFactorial(10) );
		System.out.println("Fatorial de 6 = " + calculateFactorial(6) );
		System.out.println("Fatorial de 7 = " + calculateFactorial(7) );
	}
	
	public static double calculateFactorial(double x) {
		double fac = 1;
		
		for(double indx = x; indx >= 1; indx--)
			fac = fac*indx;
		
		return fac;
	}
}
