package com.dwwm.main;

public class ExerciceIfElse {
	public static void main(String[] args) {
		String phraseIntroduction = " En %d, les planetes du systeme solaire etaient au nombre de : %d";
		int nbPlanetes=0;
		short annee = 2120;
		if (annee<1600 || annee>2020) {
			System.out.printf("le programme ne peut pas fournir de r�sultat pour %d,",annee);
		}
		else {
			if (annee < 1700) {
				nbPlanetes=7;
			}
			else if (annee<1800) {
				nbPlanetes=8;
			}	
			else if (annee < 2006) {
				nbPlanetes=9;
			}
			else  {
				nbPlanetes=8;
			}
			System.out.printf(phraseIntroduction,annee,nbPlanetes);
		}
		
		
	}//EOF main
}//EOC
