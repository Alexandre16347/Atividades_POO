package Exercicio_Lista_4;

import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;

public class ListaDeTarefa {

	/*
	 * Crie um projeto de uma lista de Tarefas. O programa deve permitir as
	 * operações CRUD (adicionar, remover, consultar e alterar) de uma nova Tarefa à
	 * fazer.
	 */

	private static List<Tarefa> listaDeTarefa;

	public static boolean adicionar(Tarefa t) {
		if (listaDeTarefa == null) {
			listaDeTarefa = new ArrayList<Tarefa>();
		}
		if (verSeExiste(t)) {
			System.err.println("Tarefa '" + t.getDescricao() + "' ja existente\n\n");
			return false;
		}
		return listaDeTarefa.add(t);
	}
	
	public static String getTarefa(int i) {
		Tarefa t = listaDeTarefa.get(i);
		return t.toString();
	}
	
	public static String getTarefa(Tarefa t) {
		int id = listaDeTarefa.indexOf(t);
		Tarefa recuperado = listaDeTarefa.get(id);
		return recuperado.toString();
	}

	public static void mudarTarefa(int i, String descricao, String dataLimite) {
		Tarefa t = listaDeTarefa.get(i);
		t.setDataLimite(dataLimite);
		t.setDescricao(descricao);
	}

	public static void mudarTarefa(Tarefa t, String descricao, String dataLimite) {
		for (Tarefa tarefa : listaDeTarefa) {
			if (tarefa.equals(t)) {
				t.setDataLimite(dataLimite);
				t.setDescricao(descricao);
			}
		}
	}

	public static boolean finalizar(Tarefa t) {
		if (!listaDeTarefa.contains(t))
			return false;
		int id = listaDeTarefa.indexOf(t);
		Tarefa recuperado = listaDeTarefa.get(id);
		if (recuperado.getStatus() == Status.Feita) {
			return false;
		} else {
			recuperado.setStatus(Status.Feita);
		}
		return true;
	}

	public static void excluirTarefa(int i) {
		listaDeTarefa.remove(i);
	}

	public static void excluirTarefa(Tarefa t) {
		listaDeTarefa.remove(t);
	}

	public static void listarTarefas() {
		if (listaDeTarefa == null) {
			System.out.println("Lista Vasia");
		} else {
			for (Tarefa tarefa : listaDeTarefa) {
				System.out.println(tarefa + "\n" + "Indice: " + listaDeTarefa.indexOf(tarefa) + "\n");
			}
		}
	}

	public static boolean verSeExiste(Tarefa t) {
		int i = 0, j = 0;
		for (Tarefa tarefa : listaDeTarefa) {
			i++;
			if (!tarefa.equals(t)) {
				j++;
			}
		}
		
		return (i != j) ? true : false;
	}

	public static void limparListaDeTarefa() {
		listaDeTarefa = null;
	}
}
