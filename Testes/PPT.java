package Testes;

import java.util.Random;

public class PPT {


	public String jogadaDaPessoa;
	public String jogadaDoPC;
	public String[] possibilidade = {"Pedra","Papel","Tesoura"};

	public void jogar(String jogada) {
		if(jogada.matches("(?i)pedra"))
			this.jogadaDaPessoa = "Pedra";
		
		else if(jogada.matches("(?i)Papel"))
			this.jogadaDaPessoa = "Papel";
		
		else if(jogada.matches("(?i)Tesoura"))
			this.jogadaDaPessoa = "Tesoura";
		
		else
			this.jogadaDaPessoa = "";
		
	}

	public boolean sortear() {
		Random rand = new Random();
		this.jogadaDoPC = this.possibilidade[rand.nextInt(3)];
		System.out.println(this.jogadaDoPC);
		return true;
	}

	public String decisao() {
		if(this.jogadaDaPessoa.equals(this.jogadaDoPC))
			return "Empate";
		else if(this.jogadaDaPessoa.matches("Pedra") && this.jogadaDoPC.matches("Tesoura"))
			return "Venceu";
		else if(this.jogadaDaPessoa.matches("Papel") && this.jogadaDoPC.matches("Pedra"))
			return "Venceu";
		else if(this.jogadaDaPessoa.matches("Tesoura") && this.jogadaDoPC.matches("Papel"))
			return "Venceu";
		else if(this.jogadaDaPessoa.matches("Pedra") && this.jogadaDoPC.matches("Papel"))
			return "Perdeu";
		else if(this.jogadaDaPessoa.matches("Papel") && this.jogadaDoPC.matches("Tesoura"))
			return "Perdeu";
		else if(this.jogadaDaPessoa.matches("Tesoura") && this.jogadaDoPC.matches("Pedra"))
			return "Perdeu";
		else
			return "Nao sei dizer";
	}

}
