package Folha_De_Pagamento_Brenne;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ListaDeGratificacoes {

	private static Map<Empregado, Vencimento> listaDeGratificacoes;

	public static boolean adicionaGratificacao(int index_funcionario, String data_trabalhada) {
		Vencimento v;
		Empregado e = ListaDeFuncionario.recuperaEmpregado(index_funcionario);

		if (listaDeGratificacoes == null) {
			listaDeGratificacoes = new HashMap<>();
		}

		if (!listaDeGratificacoes.containsKey(index_funcionario)) {
			v = new Vencimento();
			v.adicionaNaLista(new GratDesempenho(e.getSalarioBase(), data_trabalhada));
			// System.out.println("Aqulio:" + v.adicionaNaLista(new
			// GratDesempenho(e.getSalarioBase(), data_trabalhada)));
			//listaDeGratificacoes.put(e, v);
			listaDeGratificacoes.put(e, v);

		} else {
			v = ListaDeGratificacoes.recuperaVencimento(index_funcionario);
			v.adicionaNaLista(new GratDesempenho(e.getSalarioBase(), data_trabalhada));
			// System.out.println("Aquilo: " + v.adicionaNaLista(new
			// GratDesempenho(e.getSalarioBase(), data_trabalhada)));
		}
		
		return true;

	}

	public static boolean adicionaGratificacao(int index_funcionario, String data_trabalhada, int horas_trabalhadas) {
		Vencimento v;
		Empregado e = ListaDeFuncionario.recuperaEmpregado(index_funcionario);

		if (listaDeGratificacoes == null) {
			listaDeGratificacoes = new HashMap<>();
		}

		if (!listaDeGratificacoes.containsKey(index_funcionario)) {
			v = new Vencimento();
			v.adicionaNaLista(new GratHoraExtra(e.getSalarioBase(), data_trabalhada, horas_trabalhadas));
//			System.out.println("Aquilo:"
//					+ v.adicionaNaLista(new GratHoraExtra(e.getSalarioBase(), data_trabalhada, horas_trabalhadas)));
			//listaDeGratificacoes.put(e, v);
			listaDeGratificacoes.put(e, v);

		} else {
			v = ListaDeGratificacoes.recuperaVencimento(index_funcionario);
			v.adicionaNaLista(new GratHoraExtra(e.getSalarioBase(), data_trabalhada, horas_trabalhadas));
			//listaDeGratificacoes.replace(e,v);
//			System.out.println("Aquilo: "
//					+ v.adicionaNaLista(new GratHoraExtra(e.getSalarioBase(), data_trabalhada, horas_trabalhadas)));
		}
		
		return true;

	}

	public static void removeGratificacao(int index_funcionario, int index_gratificacao) {
		listaDeGratificacoes.remove(index_funcionario, index_gratificacao);
	}

	public static Vencimento recuperaVencimento(int index_funcionario) {
		Empregado e = ListaDeFuncionario.recuperaEmpregado(index_funcionario);

		return listaDeGratificacoes.get(e);
	}

	public static ArrayList<Gratificacao> recuperaLista(int index_funcionario) {
		Empregado e = ListaDeFuncionario.recuperaEmpregado(index_funcionario);
		return listaDeGratificacoes.get(e).recuperaListaCompleta();
	}

	public static Gratificacao recuperaGratificacao(int index_funcionario, int index_gratificacao) {
		Vencimento v = recuperaVencimento(index_funcionario);
		// v.recuperaListaDeGratificacao();
		return v.recuperaDaLista(index_gratificacao);
	}
	
	public static void mostraLista(int index_funcionario) {
		Vencimento v = recuperaVencimento(index_funcionario);
		v.recuperaListaDeGratificacao();
	}

}
