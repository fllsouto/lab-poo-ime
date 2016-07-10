package br.usp.ime.p2.ex3;

public class Po implements Mao {
	
	public static final int POWER = 2;
	
	public int getPower() {
		return POWER;
	}

	public int win(Mao m) throws PartidaInvalida{
		switch(m.getPower()) {
		case Jo.POWER:
			return Jogo.WIN;
		case Kem.POWER:
			return Jogo.LOSE;
		case Po.POWER:
			return Jogo.DRAW;
		default:
			throw new PartidaInvalida("Partida inválida.\nMão 1 : " + m.getClass() + "\nMão 2 : " + m.getClass());
		}
	}
}
