package com.dwwm.main;

public class ExerciceSwitchCase {
	public static void main(String[] args) {
		int nbPlanetes=15;
		
		switch (nbPlanetes) {
		case 7 : 
			System.out.println("On sait qu'au 16 eme siecle , seules 7 ....");
			break;
		case 8 : 
			System.out.println("suite...");
			break;
		case 9 : 
			System.out.println("pharse specifique");
			break;
			default:
			System.out.printf("le programme ne peut pas fournir de résultat pour %d,",nbPlanetes);
		}
		
			
		
	}//EOF main
}//EOC
