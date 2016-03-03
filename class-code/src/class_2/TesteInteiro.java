// University of São Paulo - IME USP
//
// Object Oriented Programming Laboratory
// Assigment 2 - 02/25/2016
//
// Prof. Marcelo Finger
// Fellipe Souto Sampaio - 7990422

package class_2;

class Inteiro {
	private int i;
	
	public Inteiro(int j) {
		i = j;
	}
	
	public void setInt(int j) {
		i = j;
	}
	
	public int getInt() {
		return i;
	}
}

public class TesteInteiro {

// O método main não está definido, para que um programa Java seja executado é necessário que exista ao menos uma função main.
// Este problema está corrigido abaixo

// O construtor 'new Inteiro()' não está definido. Em java a assinatura dos métodos deve ser respeitada
// por isso que se o construtor definido pede um número inteiro como argumento este deve ser passado.
// A chamada correta está escrita abaixo

	public static void teste() {
		Inteiro obj;
//		obj = new Inteiro();
		obj = new Inteiro(42);
		System.out.println("O objeto contem: " + obj.getInt());
		obj.setInt(4);
		System.out.println("O objeto contem: " + obj.getInt());
	}
	
	public static void main(String[] args) {
		teste();
	}
	
}
