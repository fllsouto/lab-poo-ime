package class3;

class SinFunction {
	
	public static int max_iterations = 100;
	private int iterations;
	public static double min_error = 0.000000001;
	
	public SinFunction() {
		this.iterations = max_iterations;
	}
	
	public SinFunction(int iterations) {
		this.iterations = iterations; 
	}
	
	public double calculateSinByTaylorMethod(double x) {
		double xSum = 0;
		double new_iteration = 0;
		
		for(int n = 0; n < this.iterations; n++) {
			new_iteration = (Math.pow(-1, n)/calculateFactorial(2*n + 1))*(Math.pow(x, 2*n + 1));
			if(Math.abs(new_iteration) < min_error)
				break;
			xSum = xSum + new_iteration;
		}
		return xSum; 
	}
	
	private double calculateFactorial(double x) {
		double fac = 1;
		
		for(double indx = x; indx >= 1; indx--)
			fac = fac*indx;
		
		return fac;
	}
}

class AlternativeSinFunction {
	
	public static Boolean testSinFunction(){
		double caseTest = 0;
		
		Boolean testFlag = true;
		
		SinFunction sinTest1 = new SinFunction(100);
		SinFunction sinTest2 = new SinFunction();
		SinFunction sinTest3 = new SinFunction(50);
		SinFunction sinTest4 = new SinFunction();
		SinFunction sinTest5 = new SinFunction(150);
		
		caseTest = 1.0;
		if(Math.abs(sinTest1.calculateSinByTaylorMethod(caseTest) - Math.sin(caseTest)) < SinFunction.min_error) {
			System.out.println("Case #1 Passed, sin " + caseTest + " ~= " + sinTest1.calculateSinByTaylorMethod(caseTest));
		} else {
			System.out.println("Case #1 Not Passed, sin " + caseTest + " != " + sinTest1.calculateSinByTaylorMethod(caseTest));
			testFlag = false;
		}
		
		caseTest = Math.PI/2;
		if(Math.abs(sinTest2.calculateSinByTaylorMethod(caseTest) - Math.sin(caseTest)) < SinFunction.min_error) {
			System.out.println("Case #2 Passed, sin " + caseTest + " ~= " + sinTest2.calculateSinByTaylorMethod(caseTest));
		} else {
			System.out.println("Case #2 Not Passed, sin " + caseTest + " != " + sinTest2.calculateSinByTaylorMethod(caseTest));
			testFlag = false;
		}
		
		caseTest = Math.PI*2;
		if(Math.abs(sinTest3.calculateSinByTaylorMethod(caseTest) - Math.sin(caseTest)) < SinFunction.min_error) {
			System.out.println("Case #3 Passed, sin " + caseTest + " ~= " + sinTest3.calculateSinByTaylorMethod(caseTest));
		} else {
			System.out.println("Case #3 Not Passed, sin " + caseTest + " != " + sinTest3.calculateSinByTaylorMethod(caseTest));
			testFlag = false;
		}
		
		caseTest = 0;
		if(Math.abs(sinTest4.calculateSinByTaylorMethod(caseTest) - Math.sin(caseTest)) < SinFunction.min_error) {
			System.out.println("Case #4 Passed, sin " + caseTest + " ~= " + sinTest4.calculateSinByTaylorMethod(caseTest));
		} else {
			System.out.println("Case #4 Not Passed, sin " + caseTest + " != " + sinTest4.calculateSinByTaylorMethod(caseTest));
			testFlag = false;
		}
		
		caseTest = Math.E * Math.PI;
		if(Math.abs(sinTest5.calculateSinByTaylorMethod(caseTest) - Math.sin(caseTest)) < SinFunction.min_error) {
			System.out.println("Case #5 Passed, sin " + caseTest + " ~= " + sinTest5.calculateSinByTaylorMethod(caseTest));
		} else {
			System.out.println("Case #5 Not Passed, sin " + caseTest + " != " + sinTest5.calculateSinByTaylorMethod(caseTest));
			testFlag = false;
		}
		
		return testFlag;
	}
	
}


public class AlternativeTrigonometryFunction {

	public static void main(String[] args) {
		if(AlternativeSinFunction.testSinFunction()) {
			System.out.println("All test passed");
		} else {
			System.out.println("Some test  not passed");
		}
		

	}
	

}
