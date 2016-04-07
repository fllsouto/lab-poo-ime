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

public class TesteRetangulo {
	Figura2D retangulo;
	public double DELTA = 0.0000001;

	@Before
	public void criaRetangulo() {
		retangulo = new Retangulo(5, 6, "azul");
	}
	
	@Test
	public void testaArea() {
		assertEquals(retangulo.calculaArea(), 30, DELTA);
	}
	
	@Test
	public void testaPerimetro() {
		assertEquals(retangulo.calculaPerimetro(), 22, DELTA);
	}
	
	@Test
	public void testaPegaCor() {
		assertEquals(retangulo.pegaCor(),"azul");
	}

	@Test
	public void testaMudaCor() {
		String novaCor = "amarelo";
		retangulo.mudaCor(novaCor);
		assertEquals(retangulo.pegaCor(),novaCor);
	}
}
