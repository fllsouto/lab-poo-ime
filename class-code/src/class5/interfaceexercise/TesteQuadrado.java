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

public class TesteQuadrado {
	Figura2D quadrado;
	public double DELTA = 0.0000001;

	@Before
	public void criaQuadrado() {
		quadrado = new Quadrado(5, "azul");
	}
	
	@Test
	public void testaArea() {
		assertEquals(quadrado.calculaArea(), 25, DELTA);
	}
	
	@Test
	public void testaPerimetro() {
		assertEquals(quadrado.calculaPerimetro(), 20, DELTA);
	}
	
	@Test
	public void testaPegaCor() {
		assertEquals(quadrado.pegaCor(),"azul");
	}

	@Test
	public void testaMudaCor() {
		String novaCor = "amarelo";
		quadrado.mudaCor(novaCor);
		assertEquals(quadrado.pegaCor(),novaCor);
	}
}
