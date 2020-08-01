package FolhaDePagamento;

public class Gratificacao {
	
	private double valorDaGratificacao = 0;
	private String tipo, dataTrabalhada;
	
	public boolean equals(Gratificacao g, Gratificacao gg) {
		if(g.getValor() == gg.getValor() && gg.getTipo().equals(gg.getTipo())) {
			return true;
		}
		return false;
	}

	public double adicionarGratificacaoHoraExtra(double salario, int horaTrabalhada, String dataTrabalhada) {
		double gratificacao;
		this.dataTrabalhada = dataTrabalhada;
		
		gratificacao = (salario * 0.001) * horaTrabalhada;
		valorDaGratificacao += gratificacao;
		
		return gratificacao;
	}
	
	public double adicionarGratificacaoDesempenho(double salario, String dataTrabalhada) {
		double gratificacao;
		this.dataTrabalhada = dataTrabalhada;
		
		gratificacao = salario * 0.05;
		valorDaGratificacao += gratificacao;
		
		return gratificacao;
	}
	
	
	public String getTipo() {
		return tipo;
	}
	public String getDataTrabalhada() {
		return dataTrabalhada;
	}
	public void setValor(double valor) {
		this.valorDaGratificacao = valor;
	}
	
	public void setDataTrabalhada(String dataTrabalhada) {
		this.dataTrabalhada = dataTrabalhada;
	}
	
	public String toString() {
		return "Tipo da gratificacao: "+tipo+
				"\nValor: "+ valorDaGratificacao;
	}
	
	public double getValor() {
		return valorDaGratificacao;
	}

}
