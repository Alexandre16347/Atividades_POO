package Folha_De_Pagamento_Brenne;

public class GratDesempenho extends Gratificacao{
	
	public GratDesempenho(double salario, String data_trabalhada) {
		super.porcentagem = 0.05;
		super.dataTrabalhada = new Data(data_trabalhada);
		super.setTipo(TipoGratificacao.Desempenho);
		super.calculaGratificacao(salario);
	}
}
