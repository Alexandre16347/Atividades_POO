package Exercicio_Lista_4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class TesteDaLista4 {
	
	@Test
	void testAdicionarTarefa() {
		Tarefa t = new Tarefa("Trabalhar", "22/07");
		assertTrue(ListaDeTarefa.adicionar(t));
		ListaDeTarefa.limparListaDeTarefa();
	}
	
	@Test
	void testGetTarefaComObjeto() {
		Tarefa t = new Tarefa("Trabalhar", "22/07");
		ListaDeTarefa.adicionar(t);
		
		ListaDeTarefa.mudarTarefa(t, "Estudar", "21/07");
		String resultado = ListaDeTarefa.getTarefa(t);
		
		assertEquals(resultado, "Descricao:   Estudar\nData limite: 21/7\nStatus:      A_fazer");
		ListaDeTarefa.limparListaDeTarefa();
	}
	
	@Test
	void testGetTarefaComIndice() {
		Tarefa t = new Tarefa("Trabalhar", "22/07");
		ListaDeTarefa.adicionar(t);
		
		ListaDeTarefa.mudarTarefa(t, "Estudar", "21/07");
		String resultado = ListaDeTarefa.getTarefa(0);
		
		assertEquals(resultado, "Descricao:   Estudar\nData limite: 21/7\nStatus:      A_fazer");
		ListaDeTarefa.limparListaDeTarefa();
	}
	
	@Test
	void testMudarTarefaComObjeto() {
		Tarefa t = new Tarefa("Trabalhar", "22/07");
		ListaDeTarefa.adicionar(t);
		
		ListaDeTarefa.mudarTarefa(t, "Estudar", "21/07");
		String resultado = ListaDeTarefa.getTarefa(t);
		//System.out.println(resultado);
		
		assertEquals(resultado, "Descricao:   Estudar\nData limite: 21/7\nStatus:      A_fazer");
		ListaDeTarefa.limparListaDeTarefa();
	}
	
	@Test
	void testMudarTarefaComIndice() {
		Tarefa t = new Tarefa("Trabalhar", "22/07");
		ListaDeTarefa.adicionar(t);
		
		ListaDeTarefa.mudarTarefa(0, "Estudar", "21/07");
		String resultado = ListaDeTarefa.getTarefa(0);
		
		assertEquals(resultado, "Descricao:   Estudar\nData limite: 21/7\nStatus:      A_fazer");
		ListaDeTarefa.limparListaDeTarefa();
	}
	
	@Test
	void testFinalizarTarefa() {
		Tarefa t = new Tarefa("Trabalhar", "22/07");
		ListaDeTarefa.adicionar(t);
		boolean resultado = ListaDeTarefa.finalizar(t);
		assertTrue(resultado);
		ListaDeTarefa.limparListaDeTarefa();
	}

}
