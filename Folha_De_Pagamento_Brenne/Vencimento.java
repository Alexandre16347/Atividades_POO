package Folha_De_Pagamento_Brenne;

import java.util.ArrayList;

public class Vencimento {
	
	protected static ArrayList<Gratificacao> lista;

	
	public Vencimento() {
		lista = new ArrayList<Gratificacao>();
	}
	
	public static ArrayList<Gratificacao> getLista() {
		return lista;
	}

	public static boolean adicionaNaLista(Gratificacao g) {
		
		return Vencimento.lista.add(g);
		
	}
	
	public static void removeDaLista(int index) {
		Vencimento.lista.remove(index);
	}
	
	public static Gratificacao recuperaDaLista(int index) {
		
		return lista.get(index);
	}
	
	public static void atualizaData(int index, String nova_data) {
		Gratificacao g = recuperaDaLista(index);
		g.setDataTrabalhada(nova_data);
		
	}
	
	public static void recuperaListaDeGratificacao() {
		System.out.println("\n-LISTA-DE-VENCIMENTOS-\n");
		for (Gratificacao g : lista) {
			System.out.println("\nGratificação: " + g);
		}

	}
	
	public static ArrayList<Gratificacao> recuperaListaCompleta() {
		return lista;
	}
	
	
	
	
	
	

}
