package Exercicio_Lista_4;

import java.util.List;
import java.util.ArrayList;

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
			System.err.println("Tarefa '"+t.getDescricao()+"' ja existente\n\n");
			return false;
		}
		return listaDeTarefa.add(t);
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

	public static void listarTarefas() {
		for (Tarefa tarefa : listaDeTarefa) {
			System.out.println(tarefa.toString() + "\n");
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
}
