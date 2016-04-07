// University of São Paulo - IME USP
//
// Object Oriented Programming Laboratory
// Assigment 5 - 03/17/2016
//
// Prof. Marcelo Finger
// Fellipe Souto Sampaio - 7990422

package class5.interfaceexercise;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteCirculo {
	Figura2D circulo;
	public double DELTA = 0.0000001;

	@Before
	public void criaCirculo() {
		circulo = new Circulo(5, "azul");
	}

	@Test
	public void testaArea() {
		assertEquals(circulo.calculaArea(), (5 * 5) * Math.PI, DELTA);
	}

	@Test
	public void testaPerimetro() {
		assertEquals(circulo.calculaPerimetro(), 2 * Math.PI * 5, DELTA);
	}

	@Test
	public void testaPegaCor() {
		assertEquals(circulo.pegaCor(), "azul");
	}

	@Test
	public void testaMudaCor() {
		String novaCor = "amarelo";
		circulo.mudaCor(novaCor);
		assertEquals(circulo.pegaCor(), novaCor);
	}
}
