package com.dwwm.main;

public class ExerciceForWhile {

	public static void main(String[] args) {
		
//		for (int nbPlanetes=7;nbPlanetes < 10;nbPlanetes++) {
//		
//			switch (nbPlanetes) {
//			case 7 : 
//				System.out.println("On sait qu'au 16 eme siecle , seules 7 ....");
//				break;
//			case 8 : 
//				System.out.println("suite...");
//				break;
//			case 9 : 
//				System.out.println("pharse specifique");
//				break;
//				default:
//				System.out.printf("le programme ne peut pas fournir de résultat pour %d,",nbPlanetes);
		int nbPlanetes=7;
		while (nbPlanetes < 10) {
			
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
						
			}//EO switch
			nbPlanetes++;
		}//EO while
			
		
	}//EOF main
}//EOC
