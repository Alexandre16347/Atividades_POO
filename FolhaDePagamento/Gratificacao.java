package FolhaDePagamento;

public class Gratificacao {
	
	private double valor = 0;
	private String tipo, dataTrabalhada;
	
	public String getTipo() {
		return tipo;
	}
	public String getDataTrabalhada() {
		return dataTrabalhada;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void setDataTrabalhada(String dataTrabalhada) {
		this.dataTrabalhada = dataTrabalhada;
	}
	
	public String toString() {
		return "Tipo da gratificacao: "+tipo+
				"\nValor: "+ valor;
	}
	
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
		valor += gratificacao;
		
		return gratificacao;
	}
	
	public double adicionarGratificacaoDesempenho(double salario, String dataTrabalhada) {
		double gratificacao;
		this.dataTrabalhada = dataTrabalhada;
		
		gratificacao = salario * 0.05;
		valor += gratificacao;
		
		return gratificacao;
	}
	
	public double getValor() {
		return valor;
	}

}
