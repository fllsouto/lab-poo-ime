package br.usp.ime.p2.ex3;

public class Kem implements Mao {
	
	public static final int POWER = 5;
	
	public int getPower() {
		return POWER;
	}
	
	public int win(Mao m) throws PartidaInvalida{
		switch(m.getPower()) {
		case Jo.POWER:
			return Jogo.LOSE;
		case Kem.POWER:
			return Jogo.DRAW;
		case Po.POWER:
			return Jogo.WIN;
		default:
			throw new PartidaInvalida("Partida inválida.\nMão 1 : " + m.getClass() + "\nMão 2 : " + m.getClass());
		}
	}
}
