package br.edu.figurasPlanas;

public class Quadrado extends Planas {
	
	private double comprimento = 2;
	private double altura = comprimento;
	
	public double CalcArea() {
		return Math.pow(comprimento, 2);
	}
	
	public double CalcComprimento() {
		return comprimento*4;
	}
	
	public double CalcAltura() {
		System.out.println(altura);
		return comprimento;
	}

}
