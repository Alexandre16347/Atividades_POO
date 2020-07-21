package TesteDaLista3;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import Exercicio_Lista_3.ContaBancaria;

public class TesteContaBancaria {

	//Testes da ContaCancaria 
	
	@Before
	void testeRecuperaDadosParaImpressao() {
		ContaBancaria cb = new ContaBancaria("Alexandre", "0000", "21/03/2008", 7685, 200.5);
		String resultado = cb.recuperaDadosParaImpressao();
		assertEquals(resultado, "Nome do Titular: Alexandre\nAgencia: 0000\nNumero: 7685\nData de Abertura: 21/03/2008\nSaldo: 200.5");
	}

	@Test
	void testeSacar() {
		ContaBancaria cb = new ContaBancaria("Alexandre", "0000", "21/03/2008", 7685, 200.5);
		cb.sacar(36.0);
		String resultado = cb.recuperaDadosParaImpressao();
		assertEquals(resultado,"Nome do Titular: Alexandre\nAgencia: 0000\nNumero: 7685\nData de Abertura: 21/03/2008\nSaldo: 164.5");
	}
	
	@Test
	void testeDepositar() {
		ContaBancaria cb = new ContaBancaria("Alexandre", "0000", "21/03/2008", 7685, 200.5);
		cb.depositar(36.5);
		String resultado = cb.recuperaDadosParaImpressao();
		assertEquals(resultado,"Nome do Titular: Alexandre\nAgencia: 0000\nNumero: 7685\nData de Abertura: 21/03/2008\nSaldo: 237.0");
	}
	
	@Test
	void testeCauculaRendimento() {
		ContaBancaria cb = new ContaBancaria("Alexandre", "0000", "21/03/2008", 7685, 200.5);
		String resultado = String.valueOf(cb.calculaRendimento());
		assertEquals("20.05", resultado);
	}
}
