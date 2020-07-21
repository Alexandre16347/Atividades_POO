package JogoDaVelha2;

import java.util.Scanner;

public class Rodada {

	static Scanner ler = new Scanner(System.in);
	
	static void partida() {
		int linha, coluna, sair = 0;
		
		Tabuleiro.getTabuleiro();
		
		while(sair == 0) {
			if(Jogo.jogada) {
				System.out.print("Digite suas posicoes jogador1 (linha, coluna): ");
			}
			else {
				System.out.print("Digite suas posicoes jogador2 (linha, coluna): ");
			}
			
			String entrada = ler.nextLine();
			Jogada.jogar(Integer.valueOf(entrada.split(" ")[0]), Integer.valueOf(entrada.split(" ")[1]));
			
			String resultado = Vencedor.situacao();
			
			if(resultado.equals("Velha") || resultado.equals("Jogador1 ganhou") || resultado.equals("Jogador2 ganhou")) {
				sair = 1;
			}
			
			System.out.println(resultado+"\n");
		}
	}
	
}
