package br.usp.ime.p2.ex2;

public class Esfera {
	
	private static final double PI = Math.PI;
	private double raio;

	public Esfera(double r) {
		this.raio = r;
	}
	
	public static void main(String[] args) {
		double raio = 5.5;
		Esfera sphere = new Esfera(raio);
		System.out.println("Área da esfera = " + sphere.area());
		System.out.println("Volume da esfera = " + sphere.volume());
	}
	
	public double area() {
		if(this.raio <= 0) {
			return 0.0;
		} else {
			return (4 * Math.pow(this.raio, 2) * PI);
		}
	}
	
	public double volume() {
		if(this.raio <= 0) {
			return 0.0;
		} else {
			return (4 * Math.pow(this.raio, 3) * PI)/3;
		}
	}
	
	
}
