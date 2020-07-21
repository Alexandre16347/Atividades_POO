package FolhaDePagamento;

public class Gerente extends Empregado{
	Gerente(String nome){
		super.nome = nome;
		super.salario = 4000.0;
		super.cargo = "Gerente";
	}
}