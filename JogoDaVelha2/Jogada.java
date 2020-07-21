package JogoDaVelha2;

public class Jogada {

	public static String jogar(int linha, int coluna) {
		
		if(linha >= 3 || linha < 0 || coluna >= 3 || coluna < 0) {
			System.err.println("\nNao existe essa posicao");
			Tabuleiro.getTabuleiro();
			return "Nao existe essa posicao";
		}else {
			if((Tabuleiro.getPosicaoTabuleiro(linha,coluna)).equals(' ')) {
				if(Jogo.jogada) {
					Tabuleiro.setPosicaoTabuleiro(linha, coluna, Jogo.getJogador1().simbolo);
					Jogo.jogada = false; 
					Tabuleiro.getTabuleiro();
				}else {
					Tabuleiro.setPosicaoTabuleiro(linha, coluna, Jogo.getJogador2().simbolo);
					Jogo.jogada = true; 
					Tabuleiro.getTabuleiro();
				}
				return "Jogada feita";
			}else {
				Tabuleiro.getTabuleiro();
				System.err.println("\nNao pode jogar ai");
				return "Nao pode jogar ai";
			}
		}
	}
	
	
}
