package Folha_De_Pagamento_Brenne;

import java.util.Scanner;

public class IU {

	private static Scanner ler;

	private static String nome;

	private static void menuPrincipal() {
		System.out.println("------ MENU DE PRINCIPAL ------");
		System.out.println("[1] Menu de empregados");
		System.out.println("[2] Folha de pagamento");
		System.out.println("[0] SAIR");
		System.out.print("Digite sua opção: ");
	}

	private static void menuDeFuncionario() {

		System.out.println("------ MENU DE EMPREGADO ------");
		System.out.println("[1] Recupera lista de empregados");
		System.out.println("[2] Acessar Empregado");
		System.out.println("[3] Cadastrar Novo Empregado");
		System.out.println("[0] Voltar ao menu anterior\n");

		System.out.print("Digite sua opção: ");

	}

	/*
	 * "SubMenu Funcionario e Gratificacao"
	 * 
	 * + Recupera Dados + Atualiza Dados + Mostra Lista de Gratificacao + Adiciona
	 * Gratificacao = Hora Extra = Desemprenho + Remove Gratificacao // passa o
	 * indice da gratificacao + Atualiza Gratificacao + Voltar
	 */

	private static void subMenuDeFuncionario(Empregado e) {

		System.out.println("------ MENU DO EMPREGADO " + e.getNome() + " ------");
		System.out.println("[1] Recupera Dados");
		System.out.println("[2] Atualiza Dados");
		System.out.println("[3] Mostrar Lista de Gratificao");
		System.out.println("[4] Adicionar Gratificacao");
		System.out.println("[5] Excluir Gratificacao");
		System.out.println("[6] Excluir Empregado");
		System.out.println("[7] Atualizar Gratificacao");
		System.out.println("[0] Voltar ao menu anterior\n");

		System.out.print("Digite sua opção: ");

	}

	@SuppressWarnings("unused")
	private static void menuDeGratificacao() {
		System.out.println("------ MENU DE GRATIFICAÇÃO ------");
		System.out.println("[1] Cadastrar Nova Gratificacao");
		System.out.println("[2] Atualiza Gratificao");
		System.out.println("[3] Recupera Lista de um Empregado");
		System.out.println("[3] Recupera Lista Completa");
		System.out.println("[0] Voltar ao menu anterior\n");
		System.out.print("Digite sua opção: ");
	}

	@SuppressWarnings("unused")
	private static void menuAtualizaGratificacao(int index_empregado, int index_gratificacao) {

		Gratificacao g = ListaDeGratificacoes.recuperaGratificacao(index_empregado, index_gratificacao);

		if (g.getTipo().equals(TipoGratificacao.Desempenho)) {
			System.out.println("------ MENU DE ATUALIZAÇÃO ------");
			System.out.println("[1] Atualiza data e hora trabalhada");
			System.out.println("[3] Atualiza data trabalhada");
			System.out.println("[3] Atualiza hora trabalhada");
			System.out.println("[0] Voltar ao menu anterior\n");
			System.out.print("Digite sua opção: ");
		} else {
			System.out.println("------ MENU DE ATUALIZAÇÃO ------");
			System.out.println("[1] Atualiza data trabalhada");
			System.out.println("[0] Voltar ao menu anterior\n");
			System.out.print("Digite sua opção: ");
		}

	}

	@SuppressWarnings("unused")
	private static void menuAtualizaFuncionario() {

		System.out.println("------ MENU DE ATUALIZAÇÃO ------");
		System.out.println("[1] Atualiza nome e salário");
		System.out.println("[2] Atualiza nome");
		System.out.println("[3] Atualiza salário");
		System.out.println("[0] Voltar ao menu anterior\n");
		System.out.print("Digite sua opção: ");
	}

	public static void IUPrincipal() {
		int op;
		ler = new Scanner(System.in);
		do {
			menuPrincipal();
			op = ler.nextInt();
			switch (op) {
			case 1:
				IUdeFuncionario();
				break;
			case 2:
				ListaDeGratificacoes.mostraFolhaDePagamento();
				break;
			case 0:
				System.out.println("Saindo .....");
				break;
			default:
				System.out.println("Opcao invalida, digite novamente.");
				break;
			}
		} while (op != 0);
	}

	public static void IUdeFuncionario() {
		ler = new Scanner(System.in);
		int opf;

		do {
			menuDeFuncionario();
			opf = ler.nextInt();

			switch (opf) {

			case 1:
				try {
					ListaDeFuncionario.recuperaListaDeEmpregados();
				} catch (Exception e) {
					System.err.println("\nErro! Não existe lista de funcionários\n");
					System.out.println("Cadastre um funcionário\n");
					IUdeFuncionario();
				}
				break;

			case 2:

				System.out.print("Digite o indice do empregado a ser acessado: ");
				int ep = ler.nextInt();
				IUSubFuncionario(ep);
				break;

			case 3:

				String cargo = "";
				int f = 1;

				while (true) {
					System.out.println("------ MENU DE CADASTRO ------");
					System.out.println("[1] Funcionario");
					System.out.println("[2] Gerente");
					System.out.print("Cargo: ");
					int c = ler.nextInt();
					switch (c) {
					case 1:
						cargo = "Funcionário";
						f = 0;
						break;
					case 2:
						cargo = "Gerente";
						f = 0;
						break;
					default:
						System.out.println("Opcao invalida");
						break;
					}
					if (f == 0)
						break;
				}
				while (true) {
					try {
						System.out.print("\n\nNome: ");
						nome = ler.next();
						for (int i = 0; i < nome.length(); i++) {
							Character caractere = nome.charAt(i);
							if (Character.isDigit(caractere)) {
								throw new Exception();
							}
						}
						ListaDeFuncionario.cadastraEmpregado(nome, cargo);
						System.out.println("EMPREGADO CADASTRADO");
						break;
					} catch (Exception e) {
						System.err.println(
								"\nErro!!\n Verifique se o nome esta correto (Sem numeros)\nVerifique se o cargo existe");
					}
				}

				break;

			case 0:
				break;
			default:
				System.out.println("Opcao invalida, digite novamente.");
				break;

			}
		} while (opf != 0);
	}

	private static void IUSubFuncionario(int ep) {
		Empregado e = ListaDeFuncionario.recuperaEmpregado(ep);
		if (e != null) {

			ler = new Scanner(System.in);
			int ops;
			do {
				subMenuDeFuncionario(e);
				ops = ler.nextInt();

				switch (ops) {
				case 1:
					System.out.println(e);
					break;
				case 2:
					IUAtualizaFuncionario(e);
					break;

				case 3:
					ListaDeGratificacoes.mostraLista(ep);
					break;
				case 4:
					int opg;
					boolean f = true;
					while (f) {
						System.out.println("[1] Hora Extra");
						System.out.println("[2] Desempenho");
						System.out.print("Opcao: ");
						opg = ler.nextInt();
						switch (opg) {
						case 1:
							System.out.println("------ MENU DE CADASTRO GRATIFICACAO ------");

							System.out.print("Qunatidade de horas trabalhada: ");
							int hora = ler.nextInt();

							System.out.print("Data Trabalhada: ");
							String data = ler.next();

							ListaDeGratificacoes.adicionaGratificacao(ep, data, hora);
							System.out.println("GRATIFICACAO ADICIONADA");
							f = false;
							break;
						case 2:
							System.out.println("------ MENU DE CADASTRO ------");

							System.out.print("Data Trabalhada: ");
							String data1 = ler.next();

							ListaDeGratificacoes.adicionaGratificacao(ep, data1);
							System.out.println("GRATIFICACAO ADICIONADA");
							f = false;
							break;
						default:
							System.out.println("Opcao invalida ...");
							break;
						}
					}
					break;
				case 5:

					System.out.println("Qual o indice da gratificacao: ");
					int opg1 = ler.nextInt();
					ListaDeGratificacoes.removeGratificacao(ep, opg1);
					
					break;
				case 6:
					ListaDeFuncionario.removeEmpregado(ep);
					System.out.println("Usuario Excluido");
					ops = 0;
				case 0:
					break;
				case 7:
					System.out.println("Qual o indice da gratificacao: ");
					int opg2 = ler.nextInt();
					IUAtualizaGratificacao(ep, opg2);
					break;
				default:
					System.out.println("Opcao invalida, digite novamente.");
					break;
				}

			} while (ops != 0);
		}

	}

	private static void IUAtualizaGratificacao(int ep, int opg2) {
		Gratificacao g = ListaDeGratificacoes.recuperaGratificacao(ep, opg2);
		
		
	}

	private static void IUAtualizaFuncionario(Empregado e) {
		int opsf;
		do {
			menuAtualizaFuncionario();
			opsf = ler.nextInt();
			switch (opsf) {

			case 1:
				System.out.print("Novo Nome: ");
				String nome = ler.next();
				e.setNome(nome);
				System.out.print("Novo Salario: ");
				Double salario = ler.nextDouble();
				e.setSalarioBase(salario);
				break;
			case 2:
				System.out.print("Novo Nome: ");
				String nome1 = ler.next();
				e.setNome(nome1);
				break;
			case 3:
				System.out.print("Novo Salario: ");
				Double salario1 = ler.nextDouble();
				e.setSalarioBase(salario1);
				break;
			case 0:
				break;
			default:
				System.out.println("Opcao invalida");
				break;
			}
		} while (opsf != 0);

	}
}
