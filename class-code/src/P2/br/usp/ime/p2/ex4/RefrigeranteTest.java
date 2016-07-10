package br.usp.ime.p2.ex4;

import static org.junit.Assert.assertEquals;

public class RefrigeranteTest {
	
	@Test
	public void testaRefrigerante() {
		String coca = "CocaCola";
		FactoryRefrigerante coca = new FactoryRefrigerante(coca);
		assertEquals("Abra a felicidade", coca.slogan);
	}

}
