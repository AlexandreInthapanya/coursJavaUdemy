package com.dwwm.main;

import com.dwwm.entities.Moteur;
import com.dwwm.entities.Passager;
import com.dwwm.entities.Ville;
import com.dwwm.entities.Voiture;

public class HelloWorld {
	
	public static void main(String[] args) {
		
		Voiture voitureDeMichel = new Voiture();/* instancier une voiture (new voiture)
		new voiture va creer une objet dans la mémoire, cette objet aura des propriétés qui auront des valeurs par defaut*/
		voitureDeMichel.nbPortes=3;
		voitureDeMichel.automatique=true;
		voitureDeMichel.couleur="Vert";
		
		//==========================================Modifier atributs objet====================================//
		
//		System.out.println("la voiture est " +voitureDeMichel.couleur+" et elle dispose de "+voitureDeMichel.nbPortes+" portes");
	
//		voitureDeMichel.couleur="jaune";
//		System.out.println(voitureDeMichel.couleur);		
//		voitureDeMichel.klaxonner();		
//		System.out.println("La nouvelle vitesse de la voiture est : " + voitureDeMichel.accelerer()+"km/h");
//		int nouvelleVitesse=voitureDeMichel.accelerer();
//		System.out.println("Nouvelle vitesse :" +nouvelleVitesse);
		
		//====================================Methodes=============================================//
		
//		int nouveauRapport=voitureDeMichel.passerRapport(true);
//		
//		voitureDeMichel.passerRapport(true);
//		voitureDeMichel.passerRapport(true);
//		nouveauRapport=voitureDeMichel.passerRapport(false);
//		
//		System.out.println("le nouveau rapport est : "+nouveauRapport);
//		
//		voitureDeMichel.tourner(false, 45);
//		voitureDeMichel.tourner("gauche", 45);
		
		//====================================Equals==============================================//
		
//		Voiture voitureDeJerome = new Voiture();
//		
//		boolean egauxOuNon = voitureDeMichel == voitureDeJerome;
//		System.out.println(egauxOuNon);
		
//		String chaine1 = "leCielEstBleu";
//		String chaine2 = "leCielEstBleu";
//		
//		boolean egauxOuPas = chaine1 == chaine2;
//		System.out.println(egauxOuPas);
		
		String chaine1 = new String("leCielEstBleu");
		String chaine2 = new String("leCielEstBleU");
		
		boolean egauxOuPas = chaine1.equalsIgnoreCase(chaine2);
		System.out.println(egauxOuPas);
		
		//======================================================This===========================================//
		
		int nouvelleVitesse = voitureDeMichel.accelerer(50);
		System.out.println("la nouvelle vitesse est de "+nouvelleVitesse);
		
		//==========================Attribut sous forme objet============================//
		
		Voiture voitureDeJerome = new Voiture();
		voitureDeJerome.nbPortes = 5;
		Moteur moteur = new Moteur();
		moteur.carburation="Diesel";
		moteur.nbCylindres=6;
		voitureDeJerome.moteur=moteur;
		
		voitureDeMichel.moteur=moteur;
		
		moteur.nbCylindres=8;
		System.out.println("le nombre de cylindre de la voiture de jerome est " +voitureDeJerome.moteur.nbCylindres);
		System.out.println("le nombre de cylindre de la voiture de Michel est " +voitureDeJerome.moteur.nbCylindres);
		
		Passager passager = new Passager();
		passager.nom="Dupont";
		passager.prenom="Vincent";
		Ville auckland = new Ville();
		auckland.nom="Auckland";
		Ville destination = voitureDeMichel.transporter(passager, auckland);
		System.out.println("Le passager est arrivé dans la ville de "+destination.nom);
		
	}//EOF

}//EOC
