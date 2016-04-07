// University of São Paulo - IME USP
//
// Object Oriented Programming Laboratory
// Assigment 5 - 03/17/2016
//
// Prof. Marcelo Finger
// Fellipe Souto Sampaio - 7990422

package class5.interfaceexercise;

public class Circulo implements Figura2D {
	
	private double raio;
	private String cor;
	
	public Circulo(double raio, String cor) {
		this.raio 	= raio;
		this.cor 	= cor;
	}
	@Override
	public double calculaArea() {		
		return ((this.raio * this.raio) * Math.PI);
	}

	@Override
	public double calculaPerimetro() {
		return (2 * Math.PI * this.raio);
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
