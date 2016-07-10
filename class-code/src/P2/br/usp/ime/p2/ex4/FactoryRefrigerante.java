package br.usp.ime.p2.ex4;

public class FactoryRefrigerante {
	public Refrigerante getRefrigerante(String nome, Boolean diet) {
		switch(nome) {
		case "ColaCola":
			return new CocaCola();
		case "ColaColaZero":
			return new CocaColaZero();
		case "Pepsi":
			new Pepsi();
		case "PepsiZero":
			return new PepsiZero();
		default:
			return null;
		}
	}
}
