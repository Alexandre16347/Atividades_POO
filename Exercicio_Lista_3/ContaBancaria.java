package Exercicio_Lista_3;

public class ContaBancaria {

	private String nomeDoTitular, agencia,  dataDeAbertura;
	private int n�mero;
	private double saldo;
	
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public double calculaRendimento() {
		return this.saldo*0.1;
	}
	
	public String recuperaDadosParaImpressao() {
		StringBuilder dados = new StringBuilder();
		dados.append("Nome do Titular: "+ this.nomeDoTitular);
		dados.append("\nAgencia: "+ this.agencia);
		dados.append("\nNumero: "+ this.n�mero);
		dados.append("\nData de Abertura: "+ this.dataDeAbertura);
		dados.append("\nSaldo: "+ this.saldo );
		return String.valueOf(dados);
	}
	
	public ContaBancaria(String nomeDoTitular, String agencia, String dataDeAbertura, int n�mero, double saldo) {
		this.nomeDoTitular = nomeDoTitular;
		this.agencia = agencia;
		this.dataDeAbertura = dataDeAbertura;
		this.n�mero = n�mero;
		this.saldo = saldo;
	}
}
