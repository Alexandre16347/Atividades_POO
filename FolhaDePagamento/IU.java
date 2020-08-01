package FolhaDePagamento;

import java.util.Scanner;

public class IU {

	private static int opcao;
	private static Scanner ler = new Scanner(System.in);
	
	public IU() {
		menuGeral();
	}
	
	public static void menuGeral() {
		System.out.println("\n******** Menu *********\n");
		System.out.println("[1] - Menu Empregado");
		System.out.println("[2] - Menu Gratificacao");
		System.out.println("[3] - Folha de Pagamento");
		System.out.println("[4] - Encerrar Programa\n");
		System.out.println("Opcao: ");
		setOpcao(Integer.valueOf(ler.nextLine()));
	}

	public static int getOpcao() {
		return opcao;
	}

	public static void setOpcao(int opcao) {
		IU.opcao = opcao;
	}
	

}
