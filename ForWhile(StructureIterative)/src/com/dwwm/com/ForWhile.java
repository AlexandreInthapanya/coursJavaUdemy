package com.dwwm.com;

public class ForWhile {
	public static void main(String[] args) {
//		int nb = 0;
//		for(  ;nb < 3; nb++ ) {
//			System.out.println("Hello World");
//		}//EO for
//		System.out.println(nb);
		
		
		
//		boolean jeContinue = false;
//		do {
//			System.out.println("Hello World");
//			jeContinue = true;
//		}//EO for
//		while( jeContinue );
		
		
//		boolean jeContinue = true;
//		while(jeContinue) {
//			System.out.println("Hello World");
//			break;
//		}
		
		
		boolean jeContinue = true;
		int nb = 0;
		while(jeContinue) {
			System.out.println("Hello World");
			nb++;
			if (nb == 5) {
				continue;//va stopper l'iteration courante
			}//EO if
			System.out.println("Nb ne vaut pas 5");
			if (nb == 10) {
				jeContinue = false;
			}
		}//EO while
	}//EOF main
}//EOC
