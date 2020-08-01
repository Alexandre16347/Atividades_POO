package Folha_De_Pagamento_Brenne;

public class Funcionario extends Empregado {

	Funcionario(String nome) {
		super.nome = nome;
		super.cargo = "Funcionário";
		super.salarioBase = 2500;
		
	}

}
