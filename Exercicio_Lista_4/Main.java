package Exercicio_Lista_4;

public class Main {

	public static void main(String[] args) {
		Tarefa t = new Tarefa("fazer a Folha de Pagamento", "26/07");
		ListaDeTarefa.adicionar(t);
		Tarefa t1 = new Tarefa("Lavar a louca", "21/07");
		ListaDeTarefa.adicionar(t1);
		Tarefa t2 = new Tarefa("Varrer a casa", "22/07");
		ListaDeTarefa.adicionar(t2);
		Tarefa t3 = new Tarefa("Dormir", "20/07");
		ListaDeTarefa.adicionar(t3);
		
		Tarefa t4 = new Tarefa("Varrer a casa", "22/07");
		ListaDeTarefa.adicionar(t4);
		
		//t4.get
		
		ListaDeTarefa.listarTarefas();
		
	}

}
