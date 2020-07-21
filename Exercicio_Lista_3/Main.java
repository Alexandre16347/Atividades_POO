package Exercicio_Lista_3;

public class Main {
	public static void main(String[] args) {
		mainUsaEstoque();
	}

	static void mainLampada() {
		Lampada lampa1 = new Lampada(), lampa2 = new Lampada();

		lampa1.ligar();
		lampa2.desligar();

		System.out.println(lampa1.observa());
		System.out.println(lampa2.observa());
	}
	
	static void mainUsaQuadrado() {
		UsaQuadrado quadrado = new UsaQuadrado();
		System.out.println("Quadrado 1/n"+"Area: "+quadrado.q1.area()+"/nPerimetro: "+quadrado.q1.perimetro());
		System.out.println("Quadrado 1/n"+"Area: "+quadrado.q2.area()+"/nPerimetro: "+quadrado.q2.perimetro());
		System.out.println("Quadrado 1/n"+"Area: "+quadrado.q3.area()+"/nPerimetro: "+quadrado.q3.perimetro());

	}
	
	static void mainEstoque() {
		Estoque e = new Estoque("Arroz", -5, -2);
		System.out.println(e.mostra());
		e.repor(3);
		e.mudarQtdMinima(-4);
		e.mudarNome("Feijao Preto");
		System.out.println(e.mostra());
	}
	
	static void mainUsaEstoque() {
		UsaEstoque ue = new UsaEstoque();
		
		ue.estoque1.darBaixa(5);
		ue.estoque2.repor(7);
		ue.estoque3.darBaixa(4);
		
		System.out.print(ue.estoque1.precisaRepor()+"\n\n"
				+ue.estoque2.precisaRepor()+"\n\n"
				+ue.estoque3.precisaRepor()+"\n\n");
		
		System.out.print(ue.estoque1.mostra()+"\n\n"
				+ue.estoque2.mostra()+"\n\n"
				+ue.estoque3.mostra()+"\n\n");
	}
}
