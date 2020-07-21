package Exercicio_3;

public class Estoque {

	private String nome = "";
	private int qtdAtual = 0, qtdMinima = 0;

	public int positivo(int algo) {
		return (algo < 0) ? 0 : algo;
	}

	public int positivo(int algo, int qtdMinimaAtual) {
		return (algo < 0) ? qtdMinimaAtual : algo;
	}

	public String getNome() {
		return nome;
	}

	public void mudarNome(String nome) {
		this.nome = nome;
	}

	public int getQtdAtual() {
		return qtdAtual;
	}

	public void repor(int qtd) {
		this.qtdAtual += positivo(qtd);
	}

	public void darBaixa(int qtd) {
		if(this.qtdAtual == 0 || qtd > this.qtdAtual)
			this.qtdAtual -= 0;
		else
			this.qtdAtual -= positivo(qtd);
	}

	public int getQtdMinima() {
		return qtdMinima;
	}

	public void mudarQtdMinima(int qtdMinima) {
		this.qtdMinima = positivo(qtdMinima, this.qtdMinima);
	}

	public Estoque(String nome, int qtdAtual, int qtdMinima) {
		this.nome = nome;
		this.qtdAtual = positivo(qtdAtual);
		this.qtdMinima = positivo(qtdMinima);
	}

	public Estoque() {
	};

	public String mostra() {
		StringBuilder texto = new StringBuilder();
		texto.append("Nome: " + getNome());
		texto.append("\nQuantidade Atual: " + getQtdAtual());
		texto.append("\nQuantidade Minima: " + getQtdMinima());

		return String.valueOf(texto);
	}

	public boolean precisaRepor() {
		if (this.qtdAtual <= this.qtdMinima)
			return true;
		return false;
	}
}
