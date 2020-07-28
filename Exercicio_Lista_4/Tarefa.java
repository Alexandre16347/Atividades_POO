package Exercicio_Lista_4;

public class Tarefa {
	
	/*
	 * Cada Tarefa deve ter uma descrição, uma data limite para realização e
	 * o status para dizer se a tarefa foi realizada ou não.
	 */

	private String descricao;
	private Data dataLimite;
	private Status status;
	
	@Override
	public String toString() {
		return "Descricao:   "+getDescricao()+
				"\nData limite: "+getDataLimite()+
				"\nStatus:      "+getStatus();
	}
	
	public String getDescricao() {
		return descricao;
	}

	public String getDataLimite() {
		return dataLimite.toString();
	}

	public Status getStatus() {
		return status;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setDataLimite(String dataLimite) {
		this.dataLimite.setData(dataLimite);;
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
		this.dataLimite = new Data(dataLimite);
		setDescricao(descricao);
		setStatus(Status.A_fazer);
	}
}
