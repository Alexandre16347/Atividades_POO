package TesteDaLista3;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import Exercicio_Lista_3.Lampada;

public class TestLampada {
	
	//Testes da Lampada
	
	@Test
	public void testeLigar() {
		Lampada l1 = new Lampada();
		l1.ligar();
		boolean resultado = l1.getLigada();
		assertTrue(resultado);
	}
	
	@Test
	public void testeDesligar() {
		Lampada l1 = new Lampada();
		l1.desligar();
		boolean resultado = l1.getLigada();
		assertFalse(resultado);
	}
	
	@Test
	public void testeObservaLigada() {
		Lampada l1 = new Lampada();
		l1.ligar();
		String resultado = l1.observa();
		//assertTrue(resultado.equals("ligada"));
		assertEquals(resultado,"ligada");
	}
	
	@Test
	public void testObservaDesligada() {
		Lampada l1 = new Lampada();
		l1.desligar();
		String resultado = l1.observa();
		//assertTrue(resultado.equals("desligada"));
		assertEquals(resultado,"desligada");
	}

}
