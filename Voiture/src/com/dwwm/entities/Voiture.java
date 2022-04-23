package com.dwwm.entities;

public class Voiture {
		
		public int nbPortes=5; //attribut d'instance ....
		public boolean automatique; //false par defaut
		public String couleur; //null par defaut
//		public String couleur = new String ("Rouge");
//		char premiereLettrePlaque; //\u0000 par defaut	
		public int rapportCourant;
		
//		int vitesseCourante;
		public int vitesse;
		public Moteur moteur; //attribut (propriété) sous forme d'objet qu'on a encapsuler dans la classe moteur
//		public Moteur moteur = new Moteur(); //null par defaut
		static public int nbRoues=4; //attribut static
		
		//======================================Constructeur==================================//
		public Voiture(){
			System.out.println("Une voiture est construite sans parametre");
		}
		
		public Voiture(String couleur){
			this.couleur = couleur;
			System.out.println("Une voiture est construite avec la couleur");
		}
		
		public Voiture (int nbPortes) {
			this.nbPortes = nbPortes;
			System.out.println("Une voiture est construite avec le nombre de portes");
		}
		
//		public Voiture(String couleur, int nbPortes){
//			this.couleur = couleur;
//			this.nbPortes = nbPortes;
//			System.out.println("Une voiture est construite avec la couleur et le nombre de portes");
//		}
		
		public Voiture (Moteur moteur) {
			this.moteur = moteur;
			System.out.println("Une voiture est construite le moteur");
		}
		
		public Voiture (String carburation, int nbCylindres) {
			Moteur moteur = new Moteur();
			moteur.carburation = carburation;
			moteur.nbCylindres = nbCylindres;
			this.moteur = moteur;
		}
		//====================================Modifier attributs objet=======================================//
		
		public static void klaxonner(){
			System.out.println("tutut!!!");
		}//methode static garde meme valeur
		
		public static void tourner(boolean droite, int angle) {
			String droiteOuGauche=null;
			if(droite) {
				droiteOuGauche="droite";
			}else {
				droiteOuGauche="gauche";
			}
			System.out.println("les"+nbRoues+" roues de la voiture tournent à "+droiteOuGauche+"d'un angle de "+angle);
		}//methode static 
		
		public int accelerer() {
			System.out.println("j'accelere");
			return 100;//s'affiche seulement quand on sysout dans le main avec .accelerer()
		}
		
//		public int accelerer(int vitesseEnPlus) {
//			System.out.println("j'accelere");
//			return vitesseCourante+vitesseEnPlus;
//		}//on peut ajouter plusieurs methodes du meme nom avec des parametres differentes qu'on appelle surcharge de methode
		
		public int passerRapport(boolean augmenter) {
			if (augmenter) {
				rapportCourant++;
			}else {
				rapportCourant--;
			}//EO if
			return rapportCourant;
		}
		
		//====================================Methodes d'instance=============================================//
		
		
		
		public void tourner(String droiteOuGauche, int angle) {

			System.out.println("la voiture va tourner à "+droiteOuGauche+"d'un angle de "+angle);
		}
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
