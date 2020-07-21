package JogoDaVelha;

import java.util.Scanner;

public class Tabuleiro {

	Jogadores jogador1 = new Jogadores();
	Jogadores jogador2 = new Jogadores();
	
	boolean jogada = true;
	
	String[][] tabuleiro = {{" "," "," "},{" "," "," "},{" "," "," "}};
	
	Scanner ler = new Scanner(System.in);
	
	public void iniciar() {
		int linha, coluna, sair = 0;
		aparencia();
		while(sair == 0) {
			if(jogada) {
				System.out.print("Digite suas posicoes jogador1 (linha, coluna): ");
			}
			else {
				System.out.print("Digite suas posicoes jogador2 (linha, coluna): ");
			}
			
			linha = ler.nextInt();
			coluna = ler.nextInt();
			jogar(linha, coluna);
			
			if(((situacao()).equals("Velha")) || ((situacao()).equals("Jogador1 ganhou")) || ((situacao()).equals("Jogador2 ganhou"))) {
				sair = 1;
			}
			
			System.out.println(situacao()+"\n");
		}
		ler.close();
	}
	
	public String jogar(int linha, int coluna) {
		
		if(linha >= 3 || linha < 0 || coluna >= 3 || coluna < 0) {
			System.err.println("\nNao existe essa posicao");
			aparencia();
			return "Nao existe essa posicao";
		}else {
			if((tabuleiro[linha][coluna]).equals(" ")) {
				if(jogada) {
					tabuleiro[linha][coluna] = jogador1.simbolo;
					this.jogada = false; 
					aparencia();
				}else {
					tabuleiro[linha][coluna] = jogador2.simbolo;
					this.jogada = true; 
					aparencia();
				}
				return "Jogada feita";
			}else {
				aparencia();
				System.err.println("\nNao pode jogar ai");
				return "Nao pode jogar ai";
			}
		}
	}
	
	public String situacao() {
		for (int i = 0; i < 3; i++) {
			if((tabuleiro[i][0]).equals(tabuleiro[i][1]) && (tabuleiro[i][0]).equals(tabuleiro[i][2])) {
				if((tabuleiro[i][0]).equals(jogador1.simbolo)) {
					return "Jogador1 ganhou";
				}
				else if((tabuleiro[i][0]).equals(jogador2.simbolo)){
					return "Jogador2 ganhou";
				}
			}
		}
		
		for (int i = 0; i < 3; i++) {
			if((tabuleiro[0][i]).equals(tabuleiro[1][i]) && (tabuleiro[0][i]).equals(tabuleiro[2][i])) {
				if((tabuleiro[0][i]).equals(jogador1.simbolo)) {
					return "Jogador1 ganhou";
				}
				else if((tabuleiro[0][i]).equals(jogador2.simbolo)){
					return "Jogador2 ganhou";
				}
			}
		}
		
		if((tabuleiro[0][0]).equals(tabuleiro[1][1]) && (tabuleiro[0][0]).equals(tabuleiro[2][2])) {
			if((tabuleiro[0][0]).equals(jogador1.simbolo)) {
				return "Jogador1 ganhou";
			}
			else if((tabuleiro[0][0]).equals(jogador2.simbolo)){
				return "Jogador2 ganhou";
			}
		}
		
		if((tabuleiro[2][0]).equals(tabuleiro[1][1]) && (tabuleiro[2][0]).equals(tabuleiro[0][2])) {
			if((tabuleiro[2][0]).equals(jogador1.simbolo)) {
				return "Jogador1 ganhou";
			}
			else if((tabuleiro[2][0]).equals(jogador2.simbolo)){
				return "Jogador2 ganhou";
			}
		}
		
		int aux = 0;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if((tabuleiro[i][j]).equals(jogador1.simbolo) || (tabuleiro[i][j]).equals(jogador2.simbolo)) {
					++aux;
				}else {
					break;
				}
			}
		}
		
		if(aux == 9) {
			return "Velha";
		}else {
			return "Sem vencedor, continuem";
		}
	}
	
	void aparencia() {
		System.out.println("\n   0 | 1 | 2 \n");
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "  "+tabuleiro[i][0]+" | "+tabuleiro[i][1]+" | "+tabuleiro[i][2]+" ");
		}
		System.out.println("");
	}
	
	public Tabuleiro(String j1, String j2){
		this.jogador1.representa(j1);
		this.jogador2.representa(j2);
	}
}