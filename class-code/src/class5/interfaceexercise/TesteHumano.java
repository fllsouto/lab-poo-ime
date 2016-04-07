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

public class TesteHumano {
	Humano humano;
	public double DELTA = 0.0000001;

	@Before
	public void criaHumano() {
		humano = new Humano();
	}

	@Test
	public void testaMama() {
		assertEquals(humano.mama(),"Os humanos mamam na infância");
	}

	@Test
	public void testeDaALuz() {
		assertEquals(humano.daALuz(),"Os humanos do sexo feminino dão a luz");
	}

	@Test
	public void testaCaminha() {
		assertEquals(humano.caminha(), "Os humanos caminham em duas pernas");
	}

	@Test
	public void testaRespira() {
		assertEquals(humano.respira(), "Os humanos precisam respirar O2 para sobreviver");
	}
}
