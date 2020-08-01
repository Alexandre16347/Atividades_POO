package Folha_De_Pagamento_Brenne;



public abstract class Empregado {
	/*
	 * O software deve cadastrar, remover e atualizar e recuperar (CRUD) os
	 * funcion�rios da empresa e as gratifica��es concedidas a cada um deles. Os
	 * funcion�rios podem ser de dois tipos: Gerente e Funcion�rio. O primeiro tem
	 * sal�rio base de exatos $4000,00 dinheiros, enquanto o segundo, $2500,00. As
	 * Gratifica��es podem ser tamb�m de dois tipos: Desempenho e Hora Extra. A
	 * primeira, adiciona 5% do sal�rio base ao vencimento mensal. A segunda,
	 * adiciona 0,1% do sal�rio base a cada hora extra trabalhada ao vencimento
	 * mensal. O software deve permitir exibir a folha de pagamento composta pelo
	 * nome do funcion�rio, cargo, sal�rio base, total de gratifica��es, valor das
	 * gratifica��es e vencimento mensal de cada funcion�rio como na tabela �
	 * seguir:
	 * 
	 */

	protected String nome;
	protected String cargo;
	protected double salarioBase;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "----- PERFIL DO FUNCION�RIO -----\nNome: " + getNome() +"\nCargo: " + getCargo() + "\nSal�rio Base: " + getSalarioBase() + "\n";
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
