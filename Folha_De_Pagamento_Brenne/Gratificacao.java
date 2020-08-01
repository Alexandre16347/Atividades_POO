package Folha_De_Pagamento_Brenne;

public abstract class Gratificacao {

	protected double porcentagem;
	protected TipoGratificacao tipo;
	protected Data dataTrabalhada;
	protected double valorDaGraftificacao;
	


	@Override
	public String toString() {
		
		return "Tipo gratificação: " + getTipo() + "\nValor da gratificação: " + getValorDaGraftificacao() + 
				"\nData trabalhada: " + getDataTrabalhada(); 
	}
	public double getValorDaGraftificacao() {
		return valorDaGraftificacao;
	}

	public void setValorDaGraftificacao(double valorDaGraftificacao) {
		this.valorDaGraftificacao = valorDaGraftificacao;
	}

	public Data getDataTrabalhada() {
		return dataTrabalhada;
	}

	public void setDataTrabalhada(String dataTrabalhada) {
		this.dataTrabalhada.setdata(dataTrabalhada);
	}

	public TipoGratificacao getTipo() {
		return tipo;
	}

	public void setTipo(TipoGratificacao tipo) {
		this.tipo = tipo;
	}

	public double getPoecentagem() {
		return porcentagem;
	}

	public void setPoecentagem(double porcentagem) {
		this.porcentagem = porcentagem;
	}

	public double calculaGratificacao(double salario) {
		this.valorDaGraftificacao = salario * this.porcentagem;

		return this.valorDaGraftificacao;
	}
	
	public double calculaGratificacao(double salario, int hora_trabalhada) {
		this.valorDaGraftificacao = salario * this.porcentagem * hora_trabalhada;

		return this.valorDaGraftificacao;
	}
	
	

}
