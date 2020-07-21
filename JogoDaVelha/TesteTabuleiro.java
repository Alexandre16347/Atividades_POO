package JogoDaVelha;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;


class TesteTabuleiro {

	@Test
	void testPosicaoJaUsada() {
		Tabuleiro jogo = new Tabuleiro("X","O");
		jogo.jogar(2,2);
		
		String resultado = jogo.jogar(2,2);
		
		assertTrue(resultado.equals("Nao pode jogar ai"));
	}
	
	@Test
	void testPosicaoInexistente() {
		Tabuleiro jogo = new Tabuleiro("X","O");
		
		String resultado = jogo.jogar(2,4);
		
		assertTrue(resultado.equals("Nao existe essa posicao"));
	}
	
	@Test
	void testPosicaoCerta() {
		Tabuleiro jogo = new Tabuleiro("X","O");
		
		String resultado = jogo.jogar(2,1);
		
		assertTrue(resultado.equals("Jogada feita"));
	}
	
	@Test
	void testSituaçaoJogador1VenceNaLinha() {
		Tabuleiro jogo = new Tabuleiro("X","O");
		jogo.jogar(0, 0);
		jogo.jogar(1, 0);
		
		jogo.jogar(0, 1);
		jogo.jogar(1, 2);
		
		jogo.jogar(0, 2);
		
		String resultado = jogo.situacao();
		
		assertTrue(resultado.equals("Jogador1 ganhou"));
	}
	
	@Test
	void testSituaçaoJogador2VenceNaLinha() {
		Tabuleiro jogo = new Tabuleiro("X","O");
		jogo.jogar(0, 0);
		jogo.jogar(1, 0);
		
		jogo.jogar(0, 1);
		jogo.jogar(1, 1);
		
		jogo.jogar(2, 2);
		jogo.jogar(1, 2);
		
		String resultado = jogo.situacao();
		
		assertTrue(resultado.equals("Jogador2 ganhou"));
	}
	
	@Test
	void testSituaçaoJogador1VenceNaColuna() {
		Tabuleiro jogo = new Tabuleiro("X","O");
		jogo.jogar(0, 0);
		jogo.jogar(0, 1);
		
		jogo.jogar(1, 0);
		jogo.jogar(1, 2);
		
		jogo.jogar(2, 0);
		
		String resultado = jogo.situacao();
		
		assertTrue(resultado.equals("Jogador1 ganhou"));
	}
	
	@Test
	void testSituaçaoJogador2VenceNaLColuna() {
		Tabuleiro jogo = new Tabuleiro("X","O");
		jogo.jogar(0, 2);
		jogo.jogar(1, 0);
		
		jogo.jogar(0, 1);
		jogo.jogar(2, 0);
		
		jogo.jogar(2, 2);
		jogo.jogar(0, 0);
		
		String resultado = jogo.situacao();
		
		assertTrue(resultado.equals("Jogador2 ganhou"));
	}
	
	@Test
	void testSituaçaoJogador1VenceNaDiagonal() {
		Tabuleiro jogo = new Tabuleiro("X","O");
		jogo.jogar(0, 0);
		jogo.jogar(1, 0);
		
		jogo.jogar(1, 1);
		jogo.jogar(2, 0);
		
		jogo.jogar(2, 2);
		
		String resultado = jogo.situacao();
		
		assertTrue(resultado.equals("Jogador1 ganhou"));
	}
	
	@Test
	void testSituaçaoJogador2VenceNaDiagonal() {
		Tabuleiro jogo = new Tabuleiro("X","O");
		
		jogo.jogar(1, 0);
		jogo.jogar(0, 0);
		
		jogo.jogar(2, 0);
		jogo.jogar(1, 1);
		
		jogo.jogar(0, 2);
		jogo.jogar(2, 2);
		
		String resultado = jogo.situacao();
		
		assertTrue(resultado.equals("Jogador2 ganhou"));
	}
	
	@Test
	void testSituaçaoJogador1VenceNaDiagonalSecundaria() {
		Tabuleiro jogo = new Tabuleiro("X","O");
		jogo.jogar(0, 2);
		jogo.jogar(2, 2);
		
		jogo.jogar(1, 1);
		jogo.jogar(2, 1);
		
		jogo.jogar(2, 0);
		
		String resultado = jogo.situacao();
		
		assertTrue(resultado.equals("Jogador1 ganhou"));
	}
	
	@Test
	void testSituaçaoJogador2VenceNaDiagonalSecundaria() {
		Tabuleiro jogo = new Tabuleiro("X","O");
		
		jogo.jogar(2, 2);
		jogo.jogar(0, 2);

		jogo.jogar(2, 1);
		jogo.jogar(1, 1);
		
		jogo.jogar(1, 2);
		jogo.jogar(2, 0);
		
		String resultado = jogo.situacao();
		
		assertTrue(resultado.equals("Jogador2 ganhou"));
	}
	
	@Test
	void testSituacaoVelha() {
		Tabuleiro jogo = new Tabuleiro("X","O");
		
		jogo.jogar(0, 0);
		jogo.jogar(0, 1);

		jogo.jogar(0, 2);
		jogo.jogar(1, 2);
		
		jogo.jogar(1, 1);
		jogo.jogar(2, 2);
		
		jogo.jogar(2, 1);
		jogo.jogar(2, 0);
		
		jogo.jogar(1, 0);
		
		String resultado = jogo.situacao();
		
		assertTrue(resultado.equals("Velha"));
	}
	
	@Test
	void testSituacaoInacabado() {
		Tabuleiro jogo = new Tabuleiro("X","O");
		
		jogo.jogar(0, 0);
		jogo.jogar(0, 1);

		jogo.jogar(0, 2);
		jogo.jogar(1, 2);
		
		jogo.jogar(1, 1);
		jogo.jogar(2, 2);
		
		jogo.jogar(2, 1);
		
		String resultado = jogo.situacao();
		
		assertTrue(resultado.equals("Sem vencedor, continuem"));
	}
}