package JogoDaVelha2;

public class Jogador {

	Character simbolo;
	int vitorias=0;

	public void representa(Character simbolo) {
		this.simbolo = simbolo;
	}
	
	public void vencedor() {
		++vitorias;
	}
	
}
