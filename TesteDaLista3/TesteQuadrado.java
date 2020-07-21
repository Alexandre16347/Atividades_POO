package TesteLista3;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import Exercicio_3.Quadrado;

public class TesteQuadrado {

	@Test
	void testeArea() {
		Quadrado q = new Quadrado(2);
		double resultado = q.area();
		assertTrue(resultado == 4);
	}
	
	@Test
	void testePerimetro() {
		Quadrado q = new Quadrado(2);
		double resultado = q.perimetro();
		assertTrue(resultado == 8);
	}
	
	@Test
	void testSetLado() {
		Quadrado q = new Quadrado(2);
		q.setLado(6);
		double resultado = q.getLado();
		assertTrue(resultado == 6);
	}

}
