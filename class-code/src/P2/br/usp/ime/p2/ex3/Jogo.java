package br.usp.ime.p2.ex3;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.Stack;

public class Jogo {
	
	public static final int WIN = 1;
	public static final int LOSE = -1;
	public static final int DRAW = 0;
	
	private static Stack<Integer> results = new Stack<Integer>();
	
	private Mao mao1;
	private Mao mao2;
	private static final Set<Integer> VALID_POWERS;
	static {
		VALID_POWERS = new HashSet<Integer>();
		VALID_POWERS.add(Jo.POWER);
		VALID_POWERS.add(Kem.POWER);
		VALID_POWERS.add(Po.POWER);
	}
	
	public static void main(String[] args) {
		Jogo jogo = new Jogo();
		try {
			jogo.adicionaMaoDoJogador1(new Jo());
			jogo.adicionaMaoDoJogador2(new Kem());
			jogo.escreveResultado();
			jogo.adicionaMaoDoJogador1(new Kem());
			jogo.adicionaMaoDoJogador2(new Po());
			jogo.escreveResultado();
			jogo.adicionaMaoDoJogador1(new Po());
			jogo.adicionaMaoDoJogador2(new Jo());
			jogo.escreveResultado();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void adicionaMaoDoJogador1(Mao mao) throws MaoInvalida {
		insereMao(mao, 1);
	}
	
	public void adicionaMaoDoJogador2(Mao mao) throws MaoInvalida {
		insereMao(mao, 2);
		try {
			results.push(mao1.win(mao2));
		} catch (PartidaInvalida e) {
			e.printStackTrace();
		}
	
	}

	public void escreveResultado() {
		Iterator<Integer> iter = results.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		results = new Stack<Integer>();
	}
	
	private void insereMao(Mao mao, int jogada) throws MaoInvalida {
		if(VALID_POWERS.contains(mao.getPower())) {
			switch(jogada) {
				case 1:
					mao1 = mao;
					break;
				case 2:
					mao2 = mao;
					break;
				default:
					throw new MaoInvalida("Mão inválida!.\nMão usada : " + mao.getClass());
			}
		} else {
			throw new MaoInvalida("Mão inválida!.\nMão usada : " + mao.getClass());
		}
	}
}
