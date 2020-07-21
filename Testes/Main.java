package Testes;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);	
		PPT jogo = new PPT();
		
		jogo.jogar(ler.nextLine());
		jogo.sortear();
		System.out.println(jogo.decisao());
		
	}
}
