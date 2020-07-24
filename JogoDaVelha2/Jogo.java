package JogoDaVelha2;

import java.util.Scanner;

public class Jogo {

	//Declaração das variaveis do Jogo
	
	private static Jogador jogador1 = new Jogador(); //Instancia Jogador 1
	private static Jogador jogador2 = new Jogador(); //Instancia Jogador 2
	private static int empate = 0; //Contador de jogos empatados
	
	private static boolean jogada = true; //Variavel de alternancia de vez na partida
	
	private int opcao = 1; //variavel de respostas
	private static int rodada = 0; //Contador de rodadas
	
	private Scanner ler = new Scanner(System.in);
	
	//Construtor do jogo
	
	Jogo(Character j1, Character j2){
		Jogo.jogador1.representa(j1);
		Jogo.jogador2.representa(j2);
		jogada = true;
	}
	
	//Metodo de inicio de jogo
	
	public void iniciar() {
		
		//Inicia uma partida e enquanto o usuario desejar ele pode jogar novamente
		
		do {
			if (opcao == 1) {
				Rodada.partida();
				Jogo.setRodada(getRodada() + 1);
				Ranking.ranking();
				setRodada(getRodada() + 1);
			}
			
			System.out.print("\n1- Jogar novamente\n2- Sair\n\nopcao: ");
			opcao = Integer.valueOf(ler.nextLine());
			
			//Selecao das respostas
			
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
				
		}while(opcao != 2); //Se o usuario reponder "2" o programa encerra
	}
	
	//Geters e Seters
	
	public static void setJogadores(Character j1, Character j2) {
		Jogo.jogador1.representa(j1);
		Jogo.jogador2.representa(j2);
		jogada = true;
	}

	static Jogador getJogador1() {
		return jogador1;
	}

	static Jogador getJogador2() {
		return jogador2;
	}
	
	public static boolean isJogada() {
		return jogada;
	}
	
	public static void setJogada(boolean jogada) {
		Jogo.jogada = jogada;
	}

	public static int getRodada() {
		return rodada;
	}

	public static void setRodada(int rodada) {
		Jogo.rodada = rodada;
	}

	public static int getEmpate() {
		return empate;
	}

	public static void setEmpate(int empate) {
		Jogo.empate = empate;
	}
}
