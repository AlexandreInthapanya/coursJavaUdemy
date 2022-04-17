package com.dwwm.main;

public class SwitchCase {

	public static void main(String[] args) {
		String mois = "Mai";
		
		switch (mois) {
		case "Janvier" : 
		case "Fevrier" :
		case "Mars" :
			System.out.println("c'est l'hiver");
			break;
		case "Avril" :
		case "Mai" :
		case "Juin" :
			System.out.println("c'est le printemps");
			break;
		
			
		}//EO switch

	}//EOF main

}//EOC
