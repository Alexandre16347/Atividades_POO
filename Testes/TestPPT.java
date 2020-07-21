package Testes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.jupiter.api.Test;

public class TestPPT {

	@Before
	public void testEntradaCerta(){
		
		//Dado que ...
		PPT jogo = new PPT();
		
		//Quando eu ....
		String jogada = "PeDra";
		jogo.jogar(jogada);
		boolean resultado = jogada.matches("(?i)pedra");
		
		//Espero que ...
		assertTrue(resultado);
	}
	
	@Test
	public void testEntradaErradaComNumero(){
		
		//Dado que ...
		PPT jogo = new PPT();
		
		//Quando eu ....
		String jogada = "PeDra01";
		jogo.jogar(jogada);
		boolean resultado = (jogo.jogadaDaPessoa).equals("");
		
		//Espero que ...
		assertTrue(resultado);
	}
	
	@Test
	public void testEntradaErradaComOutraPalavra(){
		
		//Dado que ...
		PPT jogo = new PPT();
		
		//Quando eu ....
		String jogada = "Banana";
		jogo.jogar(jogada);
		boolean resultado = (jogo.jogadaDaPessoa).equals("");
		
		//Espero que ...
		assertTrue(resultado);
	}
	
	@Test
	public void testEntradaErradaComEspaco(){
		
		//Dado que ...
		PPT jogo = new PPT();
		
		//Quando eu ....
		String jogada = "PeDra ";
		jogo.jogar(jogada);
		boolean resultado = (jogo.jogadaDaPessoa).equals("");
		
		//Espero que ...
		assertTrue(resultado);
	}
	
	@Test
	public void testSorteio(){
		
		//Dado que ...
		PPT jogo = new PPT();
		
		//Quando eu ....
		boolean resultado = jogo.sortear();
		
		//Espero que ...
		assertTrue(resultado);
	}
	
	@Test
	public void testVencedorPedra(){
		
		//Dado que ...
		PPT jogo = new PPT();
		String jogadaPessoa = "Pedra";
		String jogadaPC = "Tesoura";
		
		jogo.jogadaDaPessoa = jogadaPessoa;
		jogo.jogadaDoPC = jogadaPC; 
		
		//Quando eu ....
		String resultado = jogo.decisao();
		
		//Espero que ...
		assertTrue("Venceu".equals(resultado));
	}
	
	@Test
	public void testVencedorPapel(){
		
		//Dado que ...
		PPT jogo = new PPT();
		String jogadaPessoa = "Papel";
		String jogadaPC = "Pedra";
		
		jogo.jogadaDaPessoa = jogadaPessoa;
		jogo.jogadaDoPC = jogadaPC; 
		
		//Quando eu ....
		String resultado = jogo.decisao();
		
		//Espero que ...
		assertTrue("Venceu".equals(resultado));
	}
	
	@Test
	public void testVencedorTesoura(){
		
		//Dado que ...
		PPT jogo = new PPT();
		String jogadaPessoa = "Tesoura";
		String jogadaPC = "Papel";
		
		jogo.jogadaDaPessoa = jogadaPessoa;
		jogo.jogadaDoPC = jogadaPC; 
		
		//Quando eu ....
		String resultado = jogo.decisao();
		
		//Espero que ...
		assertTrue("Venceu".equals(resultado));
	}
	
	@Test
	public void testPerdedorPedra(){
		
		//Dado que ...
		PPT jogo = new PPT();
		String jogadaPessoa = "Pedra";
		String jogadaPC = "Papel";
		
		jogo.jogadaDaPessoa = jogadaPessoa;
		jogo.jogadaDoPC = jogadaPC; 
		
		//Quando eu ....
		String resultado = jogo.decisao();
		
		//Espero que ...
		assertTrue("Perdeu".equals(resultado));
	}
	
	@Test
	public void testPerdedorPapel(){
		
		//Dado que ...
		PPT jogo = new PPT();
		String jogadaPessoa = "Papel";
		String jogadaPC = "Tesoura";
		
		jogo.jogadaDaPessoa = jogadaPessoa;
		jogo.jogadaDoPC = jogadaPC; 
		
		//Quando eu ....
		String resultado = jogo.decisao();
		
		//Espero que ...
		assertTrue("Perdeu".equals(resultado));
	}
	
	@Test
	public void testPerdedorTesoura(){
		
		//Dado que ...
		PPT jogo = new PPT();
		String jogadaPessoa = "Tesoura";
		String jogadaPC = "Pedra";
		
		jogo.jogadaDaPessoa = jogadaPessoa;
		jogo.jogadaDoPC = jogadaPC; 
		
		//Quando eu ....
		String resultado = jogo.decisao();
		
		//Espero que ...
		assertTrue("Perdeu".equals(resultado));
	}
	
	@Test
	public void testEmpateTesoura(){
		
		//Dado que ...
		PPT jogo = new PPT();
		String jogadaPessoa = "Tesoura";
		String jogadaPC = "Tesoura";
		
		jogo.jogadaDaPessoa = jogadaPessoa;
		jogo.jogadaDoPC = jogadaPC; 
		
		//Quando eu ....
		String resultado = jogo.decisao();
		
		//Espero que ...
		assertTrue("Empate".equals(resultado));
	}
	
	@Test
	public void testEmpatePedra(){
		
		//Dado que ...
		PPT jogo = new PPT();
		String jogadaPessoa = "Pedra";
		String jogadaPC = "Pedra";
		
		jogo.jogadaDaPessoa = jogadaPessoa;
		jogo.jogadaDoPC = jogadaPC; 
		
		//Quando eu ....
		String resultado = jogo.decisao();
		
		//Espero que ...
		assertTrue("Empate".equals(resultado));
	}
	
	@Test
	public void testEmpatePapel(){
		
		//Dado que ...
		PPT jogo = new PPT();
		String jogadaPessoa = "Papel";
		String jogadaPC = "Papel";
		
		jogo.jogadaDaPessoa = jogadaPessoa;
		jogo.jogadaDoPC = jogadaPC; 
		
		//Quando eu ....
		String resultado = jogo.decisao();
		
		//Espero que ...
		assertTrue("Empate".equals(resultado));
	}
}
