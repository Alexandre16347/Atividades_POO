package Folha_De_Pagamento_Brenne;

import java.util.Scanner;

public class IU {

	static protected void menuDeFuncionario() {

		System.out.println("------ MENU DE FUNCIONÁRIO ------");
		System.out.println("[1] Recupera lista de funcionários");
		System.out.println("[2] Cadastra");
		System.out.println("[3] Atualiza");
		System.out.println("[4] Remove");
		System.out.println("[5] Recupera funcionário");
		System.out.println("[0] Sair do Menu");

		System.out.print("Digite sua opção: ");

	}

	static protected void menuAtualizaFuncionario() {

		System.out.println("------ MENU DE ATUALIZAÇÃO ------");
		System.out.println("[1] Atualiza nome e salário");
		System.out.println("[2] Atualiza nome");
		System.out.println("[3] Atualiza salário");
		System.out.println("[0] Voltar ao menu anterior\n");
		System.out.print("Digite sua opção: ");
	}

	static String nome;
	static double salario;
	static int id;

	static public void IUdeFuncionario() {
		Scanner ler = new Scanner(System.in);

		menuDeFuncionario();

		int op = ler.nextInt();

		switch (op) {

		case 1:
			try {
				ListaDeFuncionario.recuperaListaDeEmpregados();
			} catch (Exception e) {
				System.err.println("\nErro! Não existe lista de funcionários");
				System.out.println("Cadastre um funcionário\n");
				IUdeFuncionario();
			}
			IUdeFuncionario();
			break;

		case 2:
			System.out.println("------ MENU DE CADASTRO ------");
			System.out.print("Nome: ");
			String nome = ler.next();
			// TODO consertar o erro de leitura do teclado
			System.out.print("Cargo: ");
			String cargo = ler.next();
			ListaDeFuncionario.cadastraEmpregado(nome, cargo);
			IUdeFuncionario();
			break;

		case 3:

			try {
				ListaDeFuncionario.recuperaListaDeEmpregados();
			} catch (Exception e) {
				System.err.println("\nErro! Não existe lista de funcionários");
				System.out.println("Cadastre um funcionário\n");
				IUdeFuncionario();
			}
			
			menuAtualizaFuncionario();
			op = ler.nextInt();
			switch (op) {
			case 1: // Atualiza nome e salário
				System.out.print("Id do funcionário: ");
				id = ler.nextInt();
				System.out.print("Novo nome: ");
				nome = ler.next();
				System.out.print("Novo salário: ");
				salario = ler.nextDouble();
				ListaDeFuncionario.atualizaEmpregado(id, nome, salario);
				IUdeFuncionario();
				break;
			case 2: // Atualiza nome
				System.out.print("Id de funcionário: ");
				id = ler.nextInt();
				System.out.print("Novo nome: ");
				nome = ler.next();
				ListaDeFuncionario.atualizaEmpregadoNome(id, nome);
				System.out.println("\nFuncionário atualizado com sucesso...\n");
				IUdeFuncionario();
				break;
			case 3: //Atualiza salário
				System.out.print("Id de funcionário: ");
				id = ler.nextInt();
				System.out.print("Novo salário: ");
				salario = ler.nextDouble();
				ListaDeFuncionario.atualizaEmpregado(id, salario);
				System.out.println("\nFuncionário atualizado com sucesso...\n");
				IUdeFuncionario();
				break;
			case 0:
				IUdeFuncionario();
				break;
			default:
				System.out.println("Erro! Opção inválida");
				break;
			}
			
			break;
		case 4: //remove um funcionário
			ListaDeFuncionario.recuperaListaDeEmpregados();
			System.out.print("Id do funcionário: ");
			id = ler.nextInt();
			ListaDeFuncionario.removeEmpregado(id);
			IUdeFuncionario();
			break;
		case 5:
			System.out.print("Id do funcionário: ");
			id = ler.nextInt();
			System.out.println(ListaDeFuncionario.recuperaEmpregado(id));
			IUdeFuncionario();
			break;
		case 0:
			System.err.println("Saindo...");
			break;
		default:
			break;
		}

		ler.close();

	}

}
