package JogoDaVelha2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TesteJogo {

	@BeforeEach
	void setup() {
		Jogo.setJogadores('X', 'O');
	}
	
	@Test
	void testPosicaoJaUsada() {
		
		Jogada.jogar(2,2);
		
		String resultado = Jogada.jogar(2,2);
		
		assertEquals(resultado,("Nao pode jogar ai"));
		Tabuleiro.zerar();
	}
	
	@Test
	void testPosicaoInexistente() {
		
		String resultado = Jogada.jogar(2,4);
		
		assertEquals(resultado,("Nao existe essa posicao"));
		Tabuleiro.zerar();
	}
	
	@Test
	void testPosicaoCerta() {
		
		String resultado = Jogada.jogar(2,1);
		
		assertEquals(resultado,("Jogada feita"));
		Tabuleiro.zerar();
	}
	
	@Test
	void testSitua�aoJogador1VenceNaLinha() {

		Jogada.jogar(0, 0);
		Jogada.jogar(1, 0);
		
		Jogada.jogar(0, 1);
		Jogada.jogar(1, 2);
		
		Jogada.jogar(0, 2);
		
		String resultado = Vencedor.situacao();
		
		assertEquals(resultado,("Jogador1 ganhou"));
		Tabuleiro.zerar();
	}
	
	@Test
	void testSitua�aoJogador2VenceNaLinha() {
		
		Jogada.jogar(0, 0);
		Jogada.jogar(1, 0);
		
		Jogada.jogar(0, 1);
		Jogada.jogar(1, 1);
		
		Jogada.jogar(2, 2);
		Jogada.jogar(1, 2);
		
		String resultado = Vencedor.situacao();
		
		assertEquals(resultado,("Jogador2 ganhou"));
		Tabuleiro.zerar();
	}
	
	@Test
	void testSitua�aoJogador1VenceNaColuna() {
		
		Jogada.jogar(0, 0);
		Jogada.jogar(0, 1);
		
		Jogada.jogar(1, 0);
		Jogada.jogar(1, 2);
		
		Jogada.jogar(2, 0);
		
		String resultado = Vencedor.situacao();
		
		assertEquals(resultado,("Jogador1 ganhou"));
		Tabuleiro.zerar();
	}
	
	@Test
	void testSitua�aoJogador2VenceNaLColuna() {
		
		Jogada.jogar(0, 2);
		Jogada.jogar(1, 0);
		
		Jogada.jogar(0, 1);
		Jogada.jogar(2, 0);
		
		Jogada.jogar(2, 2);
		Jogada.jogar(0, 0);
		
		String resultado = Vencedor.situacao();
		
		assertEquals(resultado,("Jogador2 ganhou"));
		Tabuleiro.zerar();
	}
	
	@Test
	void testSitua�aoJogador1VenceNaDiagonal() {
		
		Jogada.jogar(0, 0);
		Jogada.jogar(1, 0);
		
		Jogada.jogar(1, 1);
		Jogada.jogar(2, 0);
		
		Jogada.jogar(2, 2);
		
		String resultado = Vencedor.situacao();
		
		assertEquals(resultado,"Jogador1 ganhou");
		Tabuleiro.zerar();
	}
	
	@Test
	void testSitua�aoJogador2VenceNaDiagonal() {
		
		Jogada.jogar(1, 0);
		Jogada.jogar(0, 0);
		
		Jogada.jogar(2, 0);
		Jogada.jogar(1, 1);
		
		Jogada.jogar(0, 2);
		Jogada.jogar(2, 2);
		
		String resultado = Vencedor.situacao();
		
		assertEquals(resultado,"Jogador2 ganhou");
		Tabuleiro.zerar();
	}
	
	@Test
	void testSitua�aoJogador1VenceNaDiagonalSecundaria() {
		
		Jogada.jogar(0, 2);
		Jogada.jogar(2, 2);
		
		Jogada.jogar(1, 1);
		Jogada.jogar(2, 1);
		
		Jogada.jogar(2, 0);
		
		String resultado = Vencedor.situacao();
		
		assertEquals(resultado,"Jogador1 ganhou");
		Tabuleiro.zerar();
	}
	
	@Test
	void testSitua�aoJogador2VenceNaDiagonalSecundaria() {
		
		Jogada.jogar(2, 2);
		Jogada.jogar(0, 2);

		Jogada.jogar(2, 1);
		Jogada.jogar(1, 1);
		
		Jogada.jogar(1, 2);
		Jogada.jogar(2, 0);
		
		String resultado = Vencedor.situacao();
		
		assertEquals(resultado,"Jogador2 ganhou");
		Tabuleiro.zerar();
	}
	
	@Test
	void testSituacaoVelha() {
		
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
		
		assertEquals(resultado,"Velha");
		Tabuleiro.zerar();
	}
	
	@Test
	void testSituacaoInacabado() {
		
		Jogada.jogar(0, 0);
		Jogada.jogar(0, 1);

		Jogada.jogar(0, 2);
		Jogada.jogar(1, 2);
		
		Jogada.jogar(1, 1);
		Jogada.jogar(2, 2);
		
		Jogada.jogar(2, 1);
		
		String resultado = Vencedor.situacao();
		
		assertEquals(resultado, "Sem vencedor, continuem");
		Tabuleiro.zerar();
	}
}