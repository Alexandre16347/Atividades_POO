package JogoDaVelha2;

public class Ranking {

	static void ranking() {

		//Printa em ordem de vitorias
		
		if (Jogo.getJogador1().getVitorias() > Jogo.getJogador2().getVitorias()) {
			
			System.out.println("Foram " + Jogo.getRodada() + " Jogo(s)\n\nEm 1º - Jogador 1 com "
					+ Jogo.getJogador1().getVitorias() + " vitoria(s)\nEm 2º - Jogador 2 com "
					+ Jogo.getJogador2().getVitorias() + " vitoria(s)\nEmpates: " + Jogo.getEmpate());
			
		} else if (Jogo.getJogador2().getVitorias() > Jogo.getJogador1().getVitorias()) {
			
			System.out.println("Foram " + Jogo.getRodada() + " Jogo(s)\n\nEm 1º - Jogador 2 com "
					+ Jogo.getJogador2().getVitorias() + " vitoria(s)\nEm 2º - Jogador 1 com "
					+ Jogo.getJogador1().getVitorias() + " vitoria(s)\nEmpates: " + Jogo.getEmpate());
			
		} else {
			
			System.out.println("Foram " + Jogo.getRodada() + " Jogo(s)\n\nEm 1º - Jogador 1 com "
					+ Jogo.getJogador1().getVitorias() + " vitoria(s)\nEm 2º - Jogador 2 com "
					+ Jogo.getJogador2().getVitorias() + " vitoria(s)\nEmpates: " + Jogo.getEmpate());
			
		}
	}

}
