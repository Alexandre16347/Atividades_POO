package FolhaDePagamento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Exercicio_Lista_4.Tarefa;

public abstract class Lista {

	static Scanner ler = new Scanner(System.in);

	static ArrayList<Empregado> listaDeEmpregado;
	// static ArrayList<Gratificacao> ListaDeGratificacao = new
	// ArrayList<Gratificacao>();
	static Map<Empregado, Gratificacao> dataBase;

	
	
	
	
	
	
	static boolean adicionarGratificacao(Empregado e, Gratificacao g) {
		if (dataBase == null) {
			dataBase = new HashMap<>();
		}
		dataBase.put(e, g);
		return true;
	}

	static void adicionarGratificacao(Empregado e, String dataTrabalhada) {
		Gratificacao g = new Gratificacao();
		g.adicionarGratificacaoDesempenho(e.getSalario(), dataTrabalhada);
		dataBase.put(e, g);
	}

	public static void recuperarGratificacao() {

	}

	static void adicionarGratificacao(Empregado e, int horaTrabalhada, String dataTrabalhada) {
		Gratificacao g = new Gratificacao();
		g.adicionarGratificacaoHoraExtra(e.getSalario(), horaTrabalhada, dataTrabalhada);
		dataBase.put(e, g);
	}

	
	
	
	
	
	
	
	
	
	
	static void adicionarEmpregado(String nome, String cargo) {
		
		if (listaDeEmpregado == null) {
			listaDeEmpregado = new ArrayList<Empregado>();
		}
		
		switch (cargo) {
		case "Funcionario":
			Empregado f = new Funcionario(nome);
			listaDeEmpregado.add(f);
			break;
		case "Gerente":
			Empregado g = new Gerente(nome);
			listaDeEmpregado.add(g);
			break;
		default:
			System.err.println("Cargo Invalido");
		}
	}

	static Empregado recuperaEmpregado(int index) {

		return listaDeEmpregado.get(index);

	}

	static void mostraListaDeEmpregado() {
		for (Empregado empregado : listaDeEmpregado) {
			System.out.println(empregado+"\nIndice: "+listaDeEmpregado.indexOf(empregado)+"\n");
		}
	}

	public static void removerEmpregado(int index) {
		listaDeEmpregado.remove(index);
	}

	public static void alteraEmpregado(int index, String nome, double salario) {
		Empregado ep = recuperaEmpregado(index);
		
		ep.setNome(nome);
		ep.setSalario(salario);
	}
	
	public static void alteraEmpregado(int index, String nome) {
		Empregado ep = recuperaEmpregado(index);
		
		ep.setNome(nome);
	}
	
	public static void alteraEmpregado(int index, double salario) {
		Empregado ep = recuperaEmpregado(index);

		ep.setSalario(salario);
	}
}
