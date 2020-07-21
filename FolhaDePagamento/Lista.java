package FolhaDePagamento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public abstract class Lista {

	static Scanner ler = new Scanner(System.in);

	static ArrayList<Empregado> ListaDeEmpregado = new ArrayList<Empregado>();
	// static ArrayList<Gratificacao> ListaDeGratificacao = new
	// ArrayList<Gratificacao>();
	static Map<Empregado, Gratificacao> dataBase = new HashMap<>();

	static void adicionarGratificacao(Empregado e, Gratificacao g) {
		dataBase.put(e, g);
	}
	
	static void adicionarGratificacao(Empregado e, String dataTrabalhada) {
		Gratificacao g = new Gratificacao();
		g.adicionarGratificacaoDesempenho(e.getSalario(), dataTrabalhada);
		dataBase.put(e, g);
	}
	
	static void adicionarGratificacao(Empregado e, int horaTrabalhada, String dataTrabalhada) {
		Gratificacao g = new Gratificacao();
		g.adicionarGratificacaoHoraExtra(e.getSalario(), horaTrabalhada, dataTrabalhada);
		dataBase.put(e, g);
	}

	static void adicionarEmpregado(Empregado e) {
		ListaDeEmpregado.add(e);
	}

	static void adicionarEmpregado(String nome, String cargo) {
		switch (cargo) {
		case "Funcionario":
			Empregado f = new Funcionario(nome);
			ListaDeEmpregado.add(f);
			break;
		case "Gerente":
			Empregado g = new Funcionario(nome);
			ListaDeEmpregado.add(g);
			break;
		default:
			System.err.println("Cargo Invalido");
		}
	}

	public static void recuperarGratificacao() {
		
	}

}
