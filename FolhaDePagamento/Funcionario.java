package FolhaDePagamento;

public class Funcionario extends Empregado{
	
	Funcionario(String nome){
		super.nome = nome;
		super.salario = 2500.0;
		super.cargo = "Funcionario";
		Lista.adicionarEmpregado(nome, super.cargo);
	}
	
	
	
}
