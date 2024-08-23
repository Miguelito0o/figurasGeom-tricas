package br.edu.principal;

import br.edu.figurasPlanas.*;

public class Principal {

	public static void main(String[] args) {
		
		 Planas q1 = CriarFigPlana("Quadrado");
		 
		 q1.CalAltura();
		 
	}

	
	
	
	
	
	
	
	
	
	private static Planas CriarFigPlana(String tipo) {
		if(tipo==null) {
			System.out.println("--");
		}
		else if(tipo.equals("Quadrado")) {
			System.out.println("Quadrado criado");
			return new Quadrado();
		}
		else if(tipo.equals("Retângulo")) {
			System.out.println("Retângulo criado");
			return new Retângulo();
		}
		else if(tipo.equals("Trapézio")) {
			System.out.println("Trapézio criado");
			return new Trapézio();
		}
		else if(tipo.equals("Losango")) {
			System.out.println("Losango criado");
			return new Losango();
		}
		return null;
	}

}
