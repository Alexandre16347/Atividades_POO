package Exercicio_3;

public class Quadrado {

	private double lado;
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public Quadrado(double novoLado) {
		this.lado = novoLado;
	}
	
	public double area() {
		double area;
		area = lado * lado;
		return area;
	}
	
	public double perimetro() {
		double perimetro;
		perimetro = 4 * lado;
		return perimetro;
	}

}
