package Exercicio_Lista_4;

public class Tarefa {
	
	/*
	 * Cada Tarefa deve ter uma descri��o, uma data limite para realiza��o e
	 * o status para dizer se a tarefa foi realizada ou n�o.
	 */

	private String descricao, dataLimite;
	private Status status;
	
	public String toString() {
		return "Descricao:   "+getDescricao()+
				"\nData limite: "+getDataLimite()+
				"\nStatus:      "+getStatus();
	}
	
	public String getDescricao() {
		return descricao;
	}

	public String getDataLimite() {
		return dataLimite;
	}

	public Status getStatus() {
		return status;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setDataLimite(String dataLimite) {
		this.dataLimite = dataLimite;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;

		Tarefa tmp;
		if (o instanceof Tarefa)
			tmp = (Tarefa) o;
		else
			return false;

		if (this.descricao.equals(tmp.descricao) && this.dataLimite.equals(tmp.dataLimite) && this.status == tmp.status)
			return true;
		return false;
	}

	public Tarefa(String descricao, String dataLimite) {
		setDescricao(descricao);
		setDataLimite(dataLimite);
		setStatus(Status.A_fazer);
	}
}
