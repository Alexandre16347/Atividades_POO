package JogoDaVelha2;

public class Vencedor {
	
	//Casos de vitoria e de empate
	
	public static String situacao() {
		
		//Testa se tem alguma sequencia de simbolos nas linhas
		
		for (int i = 0; i < 3; i++) {
			if((Tabuleiro.getPosicaoTabuleiro(i,0)).equals(Tabuleiro.getPosicaoTabuleiro(i,1)) && (Tabuleiro.getPosicaoTabuleiro(i,0)).equals(Tabuleiro.getPosicaoTabuleiro(i,2))) {
				
				if((Tabuleiro.getPosicaoTabuleiro(i,0)).equals(Jogo.getJogador1().getSimbolo())) {
					Jogo.getJogador1().vencedor();
					return "Jogador1 ganhou";
				}
				else if((Tabuleiro.getPosicaoTabuleiro(i,0)).equals(Jogo.getJogador2().getSimbolo())){
					Jogo.getJogador2().vencedor();
					return "Jogador2 ganhou";
				}
			}
		}
		
		//Testa se tem alguma sequencia de simbolos nas colunas
		
		for (int i = 0; i < 3; i++) {
			if((Tabuleiro.getPosicaoTabuleiro(0,i)).equals(Tabuleiro.getPosicaoTabuleiro(1,i)) && (Tabuleiro.getPosicaoTabuleiro(0,i)).equals(Tabuleiro.getPosicaoTabuleiro(2,i))) {
				if((Tabuleiro.getPosicaoTabuleiro(0,i)).equals(Jogo.getJogador1().getSimbolo())) {
					Jogo.getJogador1().vencedor();
					return "Jogador1 ganhou";
				}
				else if((Tabuleiro.getPosicaoTabuleiro(0,i)).equals(Jogo.getJogador2().getSimbolo())){
					Jogo.getJogador2().vencedor();
					return "Jogador2 ganhou";
				}
			}
		}
		
		//Testa se tem alguma sequencia de simbolos na diagonal pricipal
		
		if((Tabuleiro.getPosicaoTabuleiro(0,0)).equals(Tabuleiro.getPosicaoTabuleiro(1,1)) && (Tabuleiro.getPosicaoTabuleiro(0,0)).equals(Tabuleiro.getPosicaoTabuleiro(2,2))) {
			if((Tabuleiro.getPosicaoTabuleiro(0,0)).equals(Jogo.getJogador1().getSimbolo())) {
				Jogo.getJogador1().vencedor();
				return "Jogador1 ganhou";
			}
			else if((Tabuleiro.getPosicaoTabuleiro(0,0)).equals(Jogo.getJogador2().getSimbolo())){
				Jogo.getJogador2().vencedor();
				return "Jogador2 ganhou";
			}
		}
		
		//Testa se tem alguma sequencia de simbolos na diagonal secundaria
		
		if((Tabuleiro.getPosicaoTabuleiro(2,0)).equals(Tabuleiro.getPosicaoTabuleiro(1,1)) && (Tabuleiro.getPosicaoTabuleiro(2,0)).equals(Tabuleiro.getPosicaoTabuleiro(0,2))) {
			if((Tabuleiro.getPosicaoTabuleiro(2,0)).equals(Jogo.getJogador1().getSimbolo())) {
				Jogo.getJogador1().vencedor();
				return "Jogador1 ganhou";
			}
			else if((Tabuleiro.getPosicaoTabuleiro(2,0)).equals(Jogo.getJogador2().getSimbolo())){
				Jogo.getJogador2().vencedor();
				return "Jogador2 ganhou";
			}
		}
		
		//Teste de Velha/Empate
		
		int aux = 0; //Variavel de para contar se ja fizeram todas as jogadas
		
		//Percorre todo o tabuleiro para ver se fizeram todas as jogadas
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if((Tabuleiro.getPosicaoTabuleiro(i,j)).equals(Jogo.getJogador1().getSimbolo()) || (Tabuleiro.getPosicaoTabuleiro(i,j)).equals(Jogo.getJogador2().getSimbolo())) {
					++aux;
				}else {
					break; //Se ainda tiver posicao vasia ele encerra a contagem
				}
			}
		}
		
		//Se todas as posicoes ja tiverem sido jogadas
		
		if(aux == 9) {
			Jogo.setEmpate(Jogo.getEmpate() + 1);
			return "Velha";
		}else {
			return "Sem vencedor, continuem"; //Se ainda tiver posicao vasia ele continua o jogo
		}
	}

}
