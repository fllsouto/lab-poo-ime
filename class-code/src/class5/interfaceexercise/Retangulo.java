// University of São Paulo - IME USP
//
// Object Oriented Programming Laboratory
// Assigment 5 - 03/17/2016
//
// Prof. Marcelo Finger
// Fellipe Souto Sampaio - 7990422

package class5.interfaceexercise;

public class Retangulo implements Figura2D {
	
	private double ladoA;
	private double ladoB;
	private String cor;
	
	public Retangulo(double ladoA, double ladoB, String cor) {
		this.ladoA 	= ladoA;
		this.ladoB 	= ladoB;
		this.cor 	= cor;
	}
	@Override
	public double calculaArea() {		
		return (this.ladoA * this.ladoB);
	}

	@Override
	public double calculaPerimetro() {
		return ((2 * this.ladoA) + (2 * this.ladoB));
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
