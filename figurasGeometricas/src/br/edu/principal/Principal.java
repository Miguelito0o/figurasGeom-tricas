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
		else if(tipo.equals("Ret�ngulo")) {
			System.out.println("Ret�ngulo criado");
			return new Ret�ngulo();
		}
		else if(tipo.equals("Trap�zio")) {
			System.out.println("Trap�zio criado");
			return new Trap�zio();
		}
		else if(tipo.equals("Losango")) {
			System.out.println("Losango criado");
			return new Losango();
		}
		return null;
	}

}
