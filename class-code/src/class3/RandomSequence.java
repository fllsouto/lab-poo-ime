package class3;

public class RandomSequence {
	public static void main(String[] args) {
		int listLength = 0;
		
		if(args.length < 1) {
			System.err.println("Usage : java n \nWhere n is the Sequence length, default value is n = 20\n");
			listLength = 20;
		} else {
			listLength = Integer.parseInt(args[0]);
		}
		printRandomSequence(listLength);

	}
	
	public static void printRandomSequence(int length) {
		System.out.println("Printing " + length + " random numbers");
		for(int i = 1; i <= length; i++)
			System.out.println("[" + i + "] : " + Math.random());
	}
}
