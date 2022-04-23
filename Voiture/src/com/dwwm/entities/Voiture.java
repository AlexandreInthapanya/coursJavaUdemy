package com.dwwm.entities;

public class Voiture {
		
		public int nbPortes=5;
		public boolean automatique; //false par defaut
		public String couleur; //null par defaut
//		public String couleur = new String ("Rouge");
//		char premiereLettrePlaque; //\u0000 par defaut	
		public int rapportCourant;
		
//		int vitesseCourante;
		public int vitesse;
		public Moteur moteur; //attribut (propriété) sous forme d'objet qu'on a encapsuler dans la classe moteur
//		public Moteur moteur = new Moteur(); //null par defaut
		//====================================Modifier attributs objet=======================================//
		
		public void klaxonner(){
			System.out.println("tutut!!!");
		}
		
		public int accelerer() {
			System.out.println("j'accelere");
			return 100;//s'affiche seulement quand on sysout dans le main avec .accelerer()
		}
		
//		public int accelerer(int vitesseEnPlus) {
//			System.out.println("j'accelere");
//			return vitesseCourante+vitesseEnPlus;
//		}//on peut ajouter plusieurs methodes du meme nom avec des parametres differentes qu'on appelle surcharge de methode
		
//		public int passerRapport(boolean augmenter) {
//			if (augmenter) {
//				rapportCourant++;
//			}else {
//				rapportCourant--;
//			}//EO if
//			return rapportCourant;
//		}
		
		//====================================Methodes=============================================//
		
//		public void tourner(boolean droite, int angle) {
//			String droiteOuGauche=null;
//			if(droite) {
//				droiteOuGauche="droite";
//			}else {
//				droiteOuGauche="gauche";
//			}
//			System.out.println("la voiture va tourner à "+droiteOuGauche+"d'un angle de "+angle);
//		}
		
//		public void tourner(String droiteOuGauche, int angle) {
//
//			System.out.println("la voiture va tourner à "+droiteOuGauche+"d'un angle de "+angle);
//		}
		// on peut proposer ces 2 (ou plusieurs) fonctions aux developpeurs (methode tourner boolean ou String)
		
		//===========================================This===============================================//
		
		public int accelerer(int vitesse) {
			System.out.println("j'accelere");
			this.vitesse = this.vitesse+vitesse;
			return this.vitesse;
		}
		
		public Ville transporter(Passager passager, Ville villeDeDepart) {
			System.out.println("Je transporte un passager qui s'appelle "+passager.prenom+" "+passager.nom);
			System.out.println("Le passager est parti de la ville de "+villeDeDepart.nom);
			
			Ville villeDeDestination = new Ville();
			villeDeDestination.nom="Wellington";
			
			return villeDeDestination;
		}
		
}//EOC
