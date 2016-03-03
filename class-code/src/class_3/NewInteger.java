package class_3;



public class NewInteger {
	
	private int number;
	
	public void readNumber(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public int numberPowerTwo() {
		return this.number*this.number;
	}
	
	public int numberFactorial() {
		int fac = 1;
		
		for(int indx = this.getNumber(); indx >= 1; indx--)
			fac = fac*indx;
		
		return fac;
	}
	
	public static void main(String[] args) {
		if(NewInteger.testNewInteger()) {
			System.out.println("All test passed");
		} else {
			System.out.println("Some test  not passed");
		}
	}
		
	public static Boolean testNewInteger() {
		Boolean testFlag = true;
		int attCase;
		int powCase;
		int facCase;
		
		NewInteger integerTest = new NewInteger();
		
		
		attCase = 2;
		powCase = 4;
		facCase = 2;
		integerTest.readNumber(attCase);
		if(integerTest.getNumber() == attCase && integerTest.numberPowerTwo() == powCase && integerTest.numberFactorial() == facCase) {
			System.out.println("Case " + attCase +  " passed!");
		} else {
			System.out.println("Case " + attCase +  " not passed!");
			testFlag = false;
		}
		
		attCase = 4;
		powCase = 16;
		facCase = 24;
		integerTest.readNumber(attCase);
		if(integerTest.getNumber() == attCase && integerTest.numberPowerTwo() == powCase && integerTest.numberFactorial() == facCase) {
			System.out.println("Case " + attCase +  " passed!");
		} else {
			System.out.println("Case " + attCase +  " not passed!");
			testFlag = false;
		}

		attCase = 6;
		powCase = 36;
		facCase = 720;
		integerTest.readNumber(attCase);
		if(integerTest.getNumber() == attCase && integerTest.numberPowerTwo() == powCase && integerTest.numberFactorial() == facCase) {
			System.out.println("Case " + attCase +  " passed!");
		} else {
			System.out.println("Case " + attCase +  " not passed!");
			testFlag = false;
		}

		attCase = 10;
		powCase = 100;
		facCase = 3628800;
		integerTest.readNumber(attCase);
		if(integerTest.getNumber() == attCase && integerTest.numberPowerTwo() == powCase && integerTest.numberFactorial() == facCase) {
			System.out.println("Case " + attCase +  " passed!");
		} else {
			System.out.println("Case " + attCase +  " not passed!");
			testFlag = false;
		}
		return testFlag;
	} 
	
}
