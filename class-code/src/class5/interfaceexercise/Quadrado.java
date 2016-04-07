// University of São Paulo - IME USP
//
// Object Oriented Programming Laboratory
// Assigment 5 - 03/17/2016
//
// Prof. Marcelo Finger
// Fellipe Souto Sampaio - 7990422

package class5.interfaceexercise;

public class Quadrado implements Figura2D {
	
	private double lado;
	private String cor;
	
	public Quadrado(double lado, String cor) {
		this.lado 	= lado;
		this.cor 	= cor;
	}
	@Override
	public double calculaArea() {		
		return (this.lado * this.lado);
	}

	@Override
	public double calculaPerimetro() {
		return (4 * this.lado);
	}

	@Override
	public void mudaCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String pegaCor() {
		return this.cor;
	}
	
}
