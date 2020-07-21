package JogoDaVelha2;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;


class TesteJogo {

	@Test
	void testPosicaoJaUsada() {
		Jogo jogo = new Jogo('X', 'O');
		Jogada.jogar(2,2);
		
		String resultado = Jogada.jogar(2,2);
		
		assertTrue(resultado.equals("Nao pode jogar ai"));
		Tabuleiro.zerar();
	}
	
	@Test
	void testPosicaoInexistente() {
		Jogo jogo = new Jogo('X', 'O');
		
		String resultado = Jogada.jogar(2,4);
		
		assertTrue(resultado.equals("Nao existe essa posicao"));
		Tabuleiro.zerar();
	}
	
	@Test
	void testPosicaoCerta() {
		Jogo jogo = new Jogo('X', 'O');
		
		String resultado = Jogada.jogar(2,1);
		
		assertTrue(resultado.equals("Jogada feita"));
		Tabuleiro.zerar();
	}
	
	@Test
	void testSituaçaoJogador1VenceNaLinha() {
		Jogo jogo = new Jogo('X', 'O');
		Jogada.jogar(0, 0);
		Jogada.jogar(1, 0);
		
		Jogada.jogar(0, 1);
		Jogada.jogar(1, 2);
		
		Jogada.jogar(0, 2);
		
		String resultado = Vencedor.situacao();
		
		assertTrue(resultado.equals("Jogador1 ganhou"));
		Tabuleiro.zerar();
	}
	
	@Test
	void testSituaçaoJogador2VenceNaLinha() {
		Jogo jogo = new Jogo('X', 'O');
		Jogada.jogar(0, 0);
		Jogada.jogar(1, 0);
		
		Jogada.jogar(0, 1);
		Jogada.jogar(1, 1);
		
		Jogada.jogar(2, 2);
		Jogada.jogar(1, 2);
		
		String resultado = Vencedor.situacao();
		
		assertTrue(resultado.equals("Jogador2 ganhou"));
		Tabuleiro.zerar();
	}
	
	@Test
	void testSituaçaoJogador1VenceNaColuna() {
		Jogo jogo = new Jogo('X', 'O');
		Jogada.jogar(0, 0);
		Jogada.jogar(0, 1);
		
		Jogada.jogar(1, 0);
		Jogada.jogar(1, 2);
		
		Jogada.jogar(2, 0);
		
		String resultado = Vencedor.situacao();
		
		assertTrue(resultado.equals("Jogador1 ganhou"));
		Tabuleiro.zerar();
	}
	
	@Test
	void testSituaçaoJogador2VenceNaLColuna() {
		Jogo jogo = new Jogo('X', 'O');
		Jogada.jogar(0, 2);
		Jogada.jogar(1, 0);
		
		Jogada.jogar(0, 1);
		Jogada.jogar(2, 0);
		
		Jogada.jogar(2, 2);
		Jogada.jogar(0, 0);
		
		String resultado = Vencedor.situacao();
		
		assertTrue(resultado.equals("Jogador2 ganhou"));
		Tabuleiro.zerar();
	}
	
	@Test
	void testSituaçaoJogador1VenceNaDiagonal() {
		Jogo jogo = new Jogo('X', 'O');
		Jogada.jogar(0, 0);
		Jogada.jogar(1, 0);
		
		Jogada.jogar(1, 1);
		Jogada.jogar(2, 0);
		
		Jogada.jogar(2, 2);
		
		String resultado = Vencedor.situacao();
		
		assertTrue(resultado.equals("Jogador1 ganhou"));
		Tabuleiro.zerar();
	}
	
	@Test
	void testSituaçaoJogador2VenceNaDiagonal() {
		Jogo jogo = new Jogo('X', 'O');
		
		Jogada.jogar(1, 0);
		Jogada.jogar(0, 0);
		
		Jogada.jogar(2, 0);
		Jogada.jogar(1, 1);
		
		Jogada.jogar(0, 2);
		Jogada.jogar(2, 2);
		
		String resultado = Vencedor.situacao();
		
		assertTrue(resultado.equals("Jogador2 ganhou"));
		Tabuleiro.zerar();
	}
	
	@Test
	void testSituaçaoJogador1VenceNaDiagonalSecundaria() {
		Jogo jogo = new Jogo('X', 'O');
		Jogada.jogar(0, 2);
		Jogada.jogar(2, 2);
		
		Jogada.jogar(1, 1);
		Jogada.jogar(2, 1);
		
		Jogada.jogar(2, 0);
		
		String resultado = Vencedor.situacao();
		
		assertTrue(resultado.equals("Jogador1 ganhou"));
		Tabuleiro.zerar();
	}
	
	@Test
	void testSituaçaoJogador2VenceNaDiagonalSecundaria() {
		Jogo jogo = new Jogo('X', 'O');
		
		Jogada.jogar(2, 2);
		Jogada.jogar(0, 2);

		Jogada.jogar(2, 1);
		Jogada.jogar(1, 1);
		
		Jogada.jogar(1, 2);
		Jogada.jogar(2, 0);
		
		String resultado = Vencedor.situacao();
		
		assertTrue(resultado.equals("Jogador2 ganhou"));
		Tabuleiro.zerar();
	}
	
	@Test
	void testSituacaoVelha() {
		Jogo jogo = new Jogo('X', 'O');
		
		Jogada.jogar(0, 0);
		Jogada.jogar(0, 1);

		Jogada.jogar(0, 2);
		Jogada.jogar(1, 2);
		
		Jogada.jogar(1, 1);
		Jogada.jogar(2, 2);
		
		Jogada.jogar(2, 1);
		Jogada.jogar(2, 0);
		
		Jogada.jogar(1, 0);
		
		String resultado = Vencedor.situacao();
		
		assertTrue(resultado.equals("Velha"));
		Tabuleiro.zerar();
	}
	
	@Test
	void testSituacaoInacabado() {
		Jogo jogo = new Jogo('X', 'O');
		
		Jogada.jogar(0, 0);
		Jogada.jogar(0, 1);

		Jogada.jogar(0, 2);
		Jogada.jogar(1, 2);
		
		Jogada.jogar(1, 1);
		Jogada.jogar(2, 2);
		
		Jogada.jogar(2, 1);
		
		String resultado = Vencedor.situacao();
		
		assertTrue(resultado.equals("Sem vencedor, continuem"));
		Tabuleiro.zerar();
	}
}