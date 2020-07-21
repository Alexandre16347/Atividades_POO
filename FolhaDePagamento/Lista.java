package FolhaDePagamento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class Lista {

	static ArrayList<Empregado> ListaDeEmpregado = new ArrayList<>();
	static ArrayList<Gratificacao> ListaDeGratificacao = new ArrayList<>();
	
	static Map<Integer,ArrayList<Gratificacao>> dataBase = new HashMap<>();
	
	static void adicionarGratificacao(Gratificacao e) {
		ListaDeGratificacao.add(e);
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
