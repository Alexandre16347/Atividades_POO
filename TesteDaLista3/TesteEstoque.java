package TesteLista3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import Exercicio_3.Estoque;

public class TesteEstoque {

	@Test
	void testConstrutorVasio() {
		Estoque e = new Estoque();
		String resultado = e.mostra();
		assertEquals(resultado, "Nome: \nQuantidade Atual: 0\nQuantidade Minima: 0");
	}
	
	@Test
	void testConstrutorComParametro() {
		Estoque e = new Estoque("Arroz", 19, 5);
		String resultado = e.mostra();
		assertEquals(resultado, "Nome: Arroz\nQuantidade Atual: 19\nQuantidade Minima: 5");
	}
	
	@Test
	void testDarBaixaComConstrutorVasio() {
		Estoque e = new Estoque();
		e.darBaixa(4);
		String resultado = e.mostra();
		assertEquals(resultado, "Nome: \nQuantidade Atual: 0\nQuantidade Minima: 0");
	}
	
	@Test
	void testDarBaixaComConstrutorComParametro() {
		Estoque e = new Estoque("Arroz", 19, 5);
		e.darBaixa(4);
		String resultado = e.mostra();
		assertEquals(resultado, "Nome: Arroz\nQuantidade Atual: 15\nQuantidade Minima: 5");
	}
	
	@Test
	void testReporComConstrutorVasio() {
		Estoque e = new Estoque();
		e.repor(4);
		String resultado = e.mostra();
		assertEquals(resultado, "Nome: \nQuantidade Atual: 4\nQuantidade Minima: 0");
	}
	
	@Test
	void testReporComConstrutorComParametro() {
		Estoque e = new Estoque("Arroz", 19, 5);
		e.repor(4);
		String resultado = e.mostra();
		assertEquals(resultado, "Nome: Arroz\nQuantidade Atual: 23\nQuantidade Minima: 5");
	}
	
	@Test
	void testReporNegativoComConstrutorComParametro() {
		Estoque e = new Estoque("Arroz", 19, 5);
		e.repor(-4);
		String resultado = e.mostra();
		assertEquals(resultado, "Nome: Arroz\nQuantidade Atual: 19\nQuantidade Minima: 5");
	}
	
	@Test
	void testMudarNomeComConstrutorVasio() {
		Estoque e = new Estoque();
		e.mudarNome("Feijao");
		String resultado = e.mostra();
		assertEquals(resultado, "Nome: Feijao\nQuantidade Atual: 0\nQuantidade Minima: 0");
	}
	
	@Test
	void testMudarNomeComConstrutorComParametro() {
		Estoque e = new Estoque("Arroz", 19, 5);
		e.mudarNome("Feijao");
		String resultado = e.mostra();
		assertEquals(resultado, "Nome: Feijao\nQuantidade Atual: 19\nQuantidade Minima: 5");
	}
	
	@Test
	void testMudarQtdMinimaComConstrutorVasio() {
		Estoque e = new Estoque();
		e.mudarQtdMinima(5);
		String resultado = e.mostra();
		assertEquals(resultado, "Nome: \nQuantidade Atual: 0\nQuantidade Minima: 5");
	}
	
	@Test
	void testMudarQtdMinimaComConstrutorComParametro() {
		Estoque e = new Estoque("Arroz", 19, 5);
		e.mudarQtdMinima(10);
		String resultado = e.mostra();
		assertEquals(resultado, "Nome: Arroz\nQuantidade Atual: 19\nQuantidade Minima: 10");
	}
	
	@Test
	void testMudarQtdMinimaNegativaComConstrutorComParametro() {
		Estoque e = new Estoque("Arroz", 19, 5);
		e.mudarQtdMinima(-10);
		String resultado = e.mostra();
		assertEquals(resultado, "Nome: Arroz\nQuantidade Atual: 19\nQuantidade Minima: 5");
	}
	
	@Test
	void testPrecisaReporComConstrutorVasio() {
		Estoque e = new Estoque();
		boolean resultado = e.precisaRepor();
		assertTrue(resultado);
	}
	
	@Test
	void testPrecisaReporaComConstrutorComParametro() {
		Estoque e = new Estoque("Arroz", 19, 5);
		boolean resultado = e.precisaRepor();
		assertFalse(resultado);
	}
	

	@Test
	void testGetNomeComConstrutorVasio() {
		Estoque e = new Estoque();
		String resultado = e.getNome();
		assertEquals(resultado, "");
	}
	
	@Test
	void testGetNomeComConstrutorComParametro() {
		Estoque e = new Estoque("Jato de Tinta", 8, 2);
		String resultado = e.getNome();
		assertEquals(resultado, "Jato de Tinta");
	}
	
	@Test
	void testGetQtdAtualComConstrutorVasio() {
		Estoque e = new Estoque();
		int resultado = e.getQtdAtual();
		assertTrue(resultado == 0);
	}
	
	@Test
	void testGetQtdAtualComConstrutorComParametro() {
		Estoque e = new Estoque("Jato de Tinta", 8, 2);
		int resultado = e.getQtdAtual();
		assertTrue(resultado == 8);
	}
	
	@Test
	void testGetQtdMinimaComConstrutorVasio() {
		Estoque e = new Estoque();
		int resultado = e.getQtdMinima();
		assertTrue(resultado == 0);
	}
	
	@Test
	void testGetQtdMinimaComConstrutorComParametro() {
		Estoque e = new Estoque("Jato de Tinta", 8, 2);
		int resultado = e.getQtdMinima();
		assertTrue(resultado == 2);
	}

}
