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
		if (listaDeEmpregados == null) {
			listaDeEmpregados = new ArrayList<Empregado>();
		}

		switch (cargo) {
		case "Funcionário":
			Empregado funcionario = new Funcionario(nome);
			listaDeEmpregados.add(funcionario);
			break;
		case "Gerente":
			Empregado gerente = new Gerente(nome);
			listaDeEmpregados.add(gerente);
			break;
		default:
			System.out.println("Opção inválida!");
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
		return listaDeEmpregados.get(index);
	}

	public static void recuperaListaDeEmpregados() {
		System.out.println("\n-LISTA-DE-FUNCIONÁRIOS-\n");
		for (Empregado empregado : listaDeEmpregados) {
			System.out.println("Nome: " + empregado.getNome() + "\nCargo: " + empregado.getCargo() + "\nSalário: "
					+ empregado.getSalarioBase() + "\nId: " + listaDeEmpregados.indexOf(empregado) + "\n---------------\n");
		}

	}

}
