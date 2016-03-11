// University of São Paulo - IME USP
//
// Object Oriented Programming Laboratory
// Assigment 4 - 03/10/2016
//
// Prof. Marcelo Finger
// Fellipe Souto Sampaio - 7990422

package class_4;

//São criados em média 37 mil objetos para um vetor de tamanho igual a 100, esse número diminui a medida que o vetor aumenta.
//A JVM tem uma configuração para seu valor máximo de heap e quando esse valor chega perto do limite o garbage collector pode entrar
//em ação para evitar o estouro da pilha

//Chamando explicitamente o garbage collector com a instrução System.gc() todas as referências perdidas são liberadas. Isso pode degradar muito
//a performance do programa pois a execução do gc é algo custoso. O ideal é cuidar das referências e ser econômico na hora de criar novos objetos.
public class AllocatedMemory {
	static int counter = 0;
	static Boolean finishedFlag = false;
	double a[] =  new double[100];
	
	public AllocatedMemory() {
		counter++;
	}
	
	@Override
	protected void finalize() throws Throwable{
		if (!finishedFlag) {
			System.out.println("Finished once after created " + counter + " objects");
			finishedFlag = true;
			super.finalize();
		}
	}
	
	public static void testWithNoGc() {
		AllocatedMemory.finishedFlag = false;
		AllocatedMemory.counter = 0;
		
		while (AllocatedMemory.finishedFlag == false)
			new AllocatedMemory();
	}
	
	public static void testWithGc() {
		AllocatedMemory.finishedFlag = false;
		AllocatedMemory.counter = 0;
		
		while (AllocatedMemory.finishedFlag == false){
			new AllocatedMemory();
			System.gc();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Starting the test: ");
		long maxBytes = Runtime.getRuntime().maxMemory();
		System.out.println("Max memory: " + maxBytes / 1024 / 1024 + "M");
		testWithNoGc();
		testWithGc();
	}
}
