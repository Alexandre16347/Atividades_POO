package Folha_De_Pagamento_Brenne;

import java.util.ArrayList;

public class ListaDeFuncionario {

	private static ArrayList<Empregado> listaDeEmpregados;

	public static ArrayList<Empregado> getListaDeEmpregados() {
		return listaDeEmpregados;
	}

	public static int indexDoObjeto(String nome_do_funcionario) {
		int id = 0;
		for (Empregado empregado : listaDeEmpregados) {
			if (empregado.getNome().equals(nome_do_funcionario)) {
				id = empregado.getNome().indexOf(nome_do_funcionario);
			}
		}
		return id;
	}
	
	public static void cadastraEmpregado(String nome, String cargo) {
		Vencimento v;
		if (listaDeEmpregados == null) {
			listaDeEmpregados = new ArrayList<Empregado>();
		}

		switch (cargo) {
		case "Funcion�rio":
			Empregado funcionario = new Funcionario(nome);
			 v = new Vencimento();
			listaDeEmpregados.add(funcionario);
			ListaDeGratificacoes.criaEmpregado(funcionario, v);
			break;
		case "Gerente":
			Empregado gerente = new Gerente(nome);
			 v = new Vencimento();
			listaDeEmpregados.add(gerente);
			ListaDeGratificacoes.criaEmpregado(gerente, v);
			break;
		default:
			System.err.println("Erro!! Op��o de cargo inv�lida...");
			break;
		}

	}

	public static void removeEmpregado(int index) {
		listaDeEmpregados.remove(index);
	}

	public static void atualizaEmpregadoNome(int index, String novo_nome) {
		recuperaEmpregado(index).setNome(novo_nome);
	}

	public static void atualizaEmpregado(int index, double novo_salario) {
		recuperaEmpregado(index).setSalarioBase(novo_salario);
	}

	public static void atualizaEmpregado(int index, String novo_nome, Double novo_salario) {
		recuperaEmpregado(index).setNome(novo_nome);
		recuperaEmpregado(index).setSalarioBase(novo_salario);
	}

	public static Empregado recuperaEmpregado(int index) {
		for (Empregado empregado : listaDeEmpregados) {
			if(listaDeEmpregados.indexOf(empregado) == index)
				return empregado;
		}
		Empregado e = null;
		System.err.println("Empregado Inexistente");
		return e;
	}

	public static void recuperaListaDeEmpregados() {
		System.out.println("\n-LISTA-DE-FUNCION�RIOS-\n");
		for (Empregado empregado : listaDeEmpregados) {
			System.out.println("Nome: " + empregado.getNome() + "\nCargo: " + empregado.getCargo() + "\nSal�rio: "
					+ empregado.getSalarioBase() + "\nId: " + listaDeEmpregados.indexOf(empregado) + "\n---------------\n");
		}

	}

}
