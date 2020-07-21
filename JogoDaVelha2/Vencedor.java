package JogoDaVelha2;

public class Vencedor {
	public static String situacao() {
		for (int i = 0; i < 3; i++) {
			if((Tabuleiro.tabuleiro[i][0]).equals(Tabuleiro.tabuleiro[i][1]) && (Tabuleiro.tabuleiro[i][0]).equals(Tabuleiro.tabuleiro[i][2])) {
				if((Tabuleiro.tabuleiro[i][0]).equals(Jogo.jogador1.simbolo)) {
					Jogo.jogador1.vencedor();
					return "Jogador1 ganhou";
				}
				else if((Tabuleiro.tabuleiro[i][0]).equals(Jogo.jogador2.simbolo)){
					Jogo.jogador2.vencedor();
					return "Jogador2 ganhou";
				}
			}
		}
		
		for (int i = 0; i < 3; i++) {
			if((Tabuleiro.tabuleiro[0][i]).equals(Tabuleiro.tabuleiro[1][i]) && (Tabuleiro.tabuleiro[0][i]).equals(Tabuleiro.tabuleiro[2][i])) {
				if((Tabuleiro.tabuleiro[0][i]).equals(Jogo.jogador1.simbolo)) {
					Jogo.jogador1.vencedor();
					return "Jogador1 ganhou";
				}
				else if((Tabuleiro.tabuleiro[0][i]).equals(Jogo.jogador2.simbolo)){
					Jogo.jogador2.vencedor();
					return "Jogador2 ganhou";
				}
			}
		}
		
		if((Tabuleiro.tabuleiro[0][0]).equals(Tabuleiro.tabuleiro[1][1]) && (Tabuleiro.tabuleiro[0][0]).equals(Tabuleiro.tabuleiro[2][2])) {
			if((Tabuleiro.tabuleiro[0][0]).equals(Jogo.jogador1.simbolo)) {
				Jogo.jogador1.vencedor();
				return "Jogador1 ganhou";
			}
			else if((Tabuleiro.tabuleiro[0][0]).equals(Jogo.jogador2.simbolo)){
				Jogo.jogador2.vencedor();
				return "Jogador2 ganhou";
			}
		}
		
		if((Tabuleiro.tabuleiro[2][0]).equals(Tabuleiro.tabuleiro[1][1]) && (Tabuleiro.tabuleiro[2][0]).equals(Tabuleiro.tabuleiro[0][2])) {
			if((Tabuleiro.tabuleiro[2][0]).equals(Jogo.jogador1.simbolo)) {
				Jogo.jogador1.vencedor();
				return "Jogador1 ganhou";
			}
			else if((Tabuleiro.tabuleiro[2][0]).equals(Jogo.jogador2.simbolo)){
				Jogo.jogador2.vencedor();
				return "Jogador2 ganhou";
			}
		}
		
		int aux = 0;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if((Tabuleiro.tabuleiro[i][j]).equals(Jogo.jogador1.simbolo) || (Tabuleiro.tabuleiro[i][j]).equals(Jogo.jogador2.simbolo)) {
					++aux;
				}else {
					break;
				}
			}
		}
		
		if(aux == 9) {
			++Jogo.empate;
			return "Velha";
		}else {
			return "Sem vencedor, continuem";
		}
	}

}
