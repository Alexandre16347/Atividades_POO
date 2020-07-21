package FolhaDePagamento;

public abstract class Empregado{
	
	protected String nome, cargo;
	protected double salario;
	protected int qtdGratificacao = 0;
	
	Gratificacao gratificacao = new Gratificacao();
	
	void adiconarHoraExtra(int horaTrabalhada) {
		gratificacao.adicionarGratificacaoHoraExtra(salario, horaTrabalhada);
		Lista.adicionarGratificacao(gratificacao);
		qtdGratificacao++;
	}
	
	void adicionarDesempenho() {
		gratificacao.adicionarGratificacaoDesempenho(salario);
		Lista.adicionarGratificacao(gratificacao);
		qtdGratificacao++;
	}
	
	public String toString() {
		return getNome()+" "
				+getCargo()+" "
				+getSalario()+" "
				+getQtdGratificacao()+" "
				+gratificacao.getValor()+" "
				+valorMensal();
	}

	public String getCargo() {
		return cargo;
	}
	
	public int getQtdGratificacao() {
		return qtdGratificacao;
	}
	
	public double valorMensal() {
		return salario + gratificacao.getValor();
	}
	
  	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	void setSalario(double novoSalario) {
		this.salario = novoSalario;
	}
	
	double getSalario() {
		return salario;
	}
}
