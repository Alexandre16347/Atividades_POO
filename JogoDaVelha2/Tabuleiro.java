package JogoDaVelha2;

public class Tabuleiro {

	static Character[][] tabuleiro = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
	
	static void getTabuleiro() {
		System.out.println("\n   0 | 1 | 2 \n");
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "  "+tabuleiro[i][0]+" | "+tabuleiro[i][1]+" | "+tabuleiro[i][2]+" ");
		}
		System.out.println("");
	}
	
	static Character getPosicaoTabuleiro(int linha, int coluna) {
		return tabuleiro[linha][coluna];
	}
	
	static void setPosicaoTabuleiro(int linha, int coluna, Character simbolo) {
		tabuleiro[linha][coluna] = simbolo;
	}
	
	static void zerar() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < tabuleiro.length; j++) {
				tabuleiro[i][j] = ' ';
			}
		}
	}
	
}
