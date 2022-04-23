package com.dwwm.main;

public class HelloWorld {
	
	public static void main(String[] args) {
		boolean jeContinue=true;
		int nb=0;
		while (jeContinue) {
			System.out.println("Hello World");
			nb++;
			if (nb==5) {
				continue;
			}//EO if
			System.out.println("NB ne vaut pas 5");
			if (nb==10) {
				jeContinue=false;
			}//EO if
		}//EO while

	}//EOF

}//EOC
