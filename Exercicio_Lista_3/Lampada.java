package Exercicio_Lista_3;

public class Lampada {
	
	private boolean ligada;
	
	public boolean getLigada() {
		return ligada;
	}
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	public void ligar() {
		this.ligada = true;
	}
	public void desligar() {
		this.ligada = false;
	}
	
	public String observa() {
		return ligada ? "ligada" : "desligada";
	}

}
