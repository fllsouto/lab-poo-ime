package br.usp.ime.p2.ex3;

public class Jo implements Mao {
	
	public static final int POWER = 0;
	
	public int getPower() {
		return POWER;
	}

	public int win(Mao m) throws PartidaInvalida{
		switch(m.getPower()) {
		case Jo.POWER:
			return Jogo.DRAW;
		case Kem.POWER:
			return Jogo.WIN;
		case Po.POWER:
			return Jogo.LOSE;
		default:
			throw new PartidaInvalida("Partida inválida.\nMão 1 : " + m.getClass() + "\nMão 2 : " + m.getClass());
		}
		
	}
}
