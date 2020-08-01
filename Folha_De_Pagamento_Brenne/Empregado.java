package Folha_De_Pagamento_Brenne;



public abstract class Empregado {
	/*
	 * O software deve cadastrar, remover e atualizar e recuperar (CRUD) os
	 * funcionários da empresa e as gratificações concedidas a cada um deles. Os
	 * funcionários podem ser de dois tipos: Gerente e Funcionário. O primeiro tem
	 * salário base de exatos $4000,00 dinheiros, enquanto o segundo, $2500,00. As
	 * Gratificações podem ser também de dois tipos: Desempenho e Hora Extra. A
	 * primeira, adiciona 5% do salário base ao vencimento mensal. A segunda,
	 * adiciona 0,1% do salário base a cada hora extra trabalhada ao vencimento
	 * mensal. O software deve permitir exibir a folha de pagamento composta pelo
	 * nome do funcionário, cargo, salário base, total de gratificações, valor das
	 * gratificações e vencimento mensal de cada funcionário como na tabela à
	 * seguir:
	 * 
	 */

	protected String nome;
	protected String cargo;
	protected double salarioBase;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "----- PERFIL DO FUNCIONÁRIO -----\nNome: " + getNome() +"\nCargo: " + getCargo() + "\nSalário Base: " + getSalarioBase() + "\n";
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	

}
