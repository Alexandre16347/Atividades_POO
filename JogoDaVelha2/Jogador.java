package JogoDaVelha2;

public class Jogador {

	//Declaração das variaveis de Jogador
	
	private Character simbolo;
	private int vitorias=0;
	
	//Adiciona ou muda o simbolo do jogador
	
	public void representa(Character simbolo) {
		this.simbolo = simbolo;
	}
	
	//Incrementa o numero de vitorias do jogador
	
	public void vencedor() {
		++vitorias;
	}
	
	//Geters
	
	public Character getSimbolo() {
		return simbolo;
	}

	public int getVitorias() {
		return vitorias;
	}
}
