package FolhaDePagamento;

public abstract class Empregado {

	protected String nome, cargo;
	protected double salario;

	public String toString() {
		return "Nome: " + getNome() + "\nCargo: " + getCargo() + "\nSalario: " + getSalario();
	}

	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
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
