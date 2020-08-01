package Folha_De_Pagamento_Brenne;

public class GratHoraExtra extends Gratificacao {
	
	public GratHoraExtra(Double salario, String data_trabalhada, int hora_trabalhada) {
		super.porcentagem = 0.001;
		super.dataTrabalhada = new Data(data_trabalhada);
		super.setTipo(TipoGratificacao.Hora_extra);
		super.calculaGratificacao(salario, hora_trabalhada);
	}

}
