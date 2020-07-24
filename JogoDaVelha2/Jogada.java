package JogoDaVelha2;

public class Jogada {
	
	public static String jogar(int linha, int coluna) {
		
		//Teste da posicao existente
		
		if(linha >= 3 || linha < 0 || coluna >= 3 || coluna < 0) {
			System.err.println("\nNao existe essa posicao");
			Tabuleiro.getTabuleiro();
			return "Nao existe essa posicao";
		}else {
			
			//Testa se pode fazer a jogada
			
			if((Tabuleiro.getPosicaoTabuleiro(linha,coluna)).equals(' ')) {
				
				//Verifica de quem é a vez de jogar
				
				if(Jogo.isJogada()) { 
					
					//vez jogador 1
					
					Tabuleiro.setPosicaoTabuleiro(linha, coluna, Jogo.getJogador1().getSimbolo());
					Jogo.setJogada(false); 
					Tabuleiro.getTabuleiro();
				}else { 
					
					//vez do jogador 2
					
					Tabuleiro.setPosicaoTabuleiro(linha, coluna, Jogo.getJogador2().getSimbolo());
					Jogo.setJogada(true); 
					Tabuleiro.getTabuleiro();
				}
				return "Jogada feita";
			}else {
				
				//Informa que nao pode fazer a jogada
				
				Tabuleiro.getTabuleiro();
				System.err.println("\nNao pode jogar ai");
				return "Nao pode jogar ai";
			}
		}
	}
	
	
}
