package FolhaDePagamento;

public class Gratificacao {
	
	double valor = 0;
	int horaExtra = 0, desempenho = 0;
	
	public String toString() {
		return valor+" "
				+horaExtra+" "
				+desempenho+" ";
	}

	public double adicionarGratificacaoHoraExtra(double salario, int horaTrabalhada) {
		double gratificacao;
		
		gratificacao = (salario * 0.001) * horaTrabalhada;
		valor += gratificacao;
		
		return gratificacao;
	}
	
	public double adicionarGratificacaoDesempenho(double salario) {
		double gratificacao;
		
		gratificacao = salario * 0.05;
		valor += gratificacao;
		
		return gratificacao;
	}
	
	public double getValor() {
		return valor;
	}

}
