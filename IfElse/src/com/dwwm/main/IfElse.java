package com.dwwm.main;

public class IfElse {

	public static void main(String[] args) {
		int age =23;
		System.out.printf("mon age est %d ans. ", age);
		if (age >= 30) {
			System.out.println("oui , je fais plus jeune");
		} else if (age < 10) {
				System.out.println("Bravo à toi de commencer si jeune!");
		}
		else if ( age == 25) {
			System.out.println("25 ans vous devez etre en pleine forme");
		}
		else {
			System.out.println("et je suis fier de mon âge");
		}
		
	}//EOF
	
}//EOC
