package JogoDaVelha2;

import java.util.Scanner;

public class Jogo {

	static Jogador jogador1 = new Jogador();
	static Jogador jogador2 = new Jogador();
	static int empate = 0;
	
	static boolean jogada = true;
	
	int opcao = 1, rodada = 0;
	
	Scanner ler = new Scanner(System.in);
	
	Jogo(Character j1, Character j2){
		Jogo.jogador1.representa(j1);
		Jogo.jogador2.representa(j2);
		jogada = true;
	}
	
	public void iniciar() {
		
		do {
			if (opcao == 1) {
				Rodada.partida();
				Ranking.ranking();
				++rodada;
			}
			
			System.out.println("\n1- Jogar novamente\n2- Sair\n\nopcao: ");
			opcao = Integer.valueOf(ler.nextLine());
			
			switch(opcao) {
			case 1:
				Tabuleiro.zerar();
				System.out.println("Tenham um bom jogo.");
				break;
			case 2:
				System.out.println("Obrigado por jogar.");
				break;
			default:
				System.err.println("Opcao nao aceita, digite novamente.");
				break;
			}
				
		}while(opcao != 2);
	}

	static Jogador getJogador1() {
		return jogador1;
	}

	public static void setJogador1(Jogador jogador1) {
		Jogo.jogador1 = jogador1;
	}

	static Jogador getJogador2() {
		return jogador2;
	}

	public static void setJogador2(Jogador jogador2) {
		Jogo.jogador2 = jogador2;
	}

	public static void setJogadores(Character j1, Character j2) {
		Jogo.jogador1.representa(j1);
		Jogo.jogador2.representa(j2);
		jogada = true;
	}
}
