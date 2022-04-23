package com.dwwm.entities;

public class Planete {
	
	public String nom;
	public String matiere;
	public long diametre;
	
	public int nbTotalHumains;
	
	public Atmosphere atmosphere;
	
	public Vaisseau vaisseauActuellementAcoste;
	
	
	
//	public void revolution() {
//		System.out.println("je suis la planete"+nom+"et je tourne autour de mon étoile.");
//	}
//	public void rotation() {
//		System.out.println("je suis la planete"+nom+"et je tourne sur moi-meme.");
//	}
	
	public int revolution(int angle) {
		return angle/360;
	}
	public int rotation(int angle) {
		return angle/360;
	}
	
	//==============================Surcharge de methode equals ================================//
	
//	public void accueillirVaisseau(int nbHumains) {
//		nbTotalHumains= nbTotalHumains + nbHumains;
//	}
//	public void accueillirVaisseau(String typeVaisseau) {
//		if (typeVaisseau.equals("CHASSEUR")) {
//			nbTotalHumains= nbTotalHumains +3;
//		}
//		else if (typeVaisseau.equals("FREGATE")) {
//			nbTotalHumains= nbTotalHumains +12;
//		}
//		else if (typeVaisseau.equals("CROISEUR")) {
//			nbTotalHumains= nbTotalHumains +50;
//		}
//	}
	
	//======================================Propriété sous forme d'objet============================================//
	
	public Vaisseau accueillirVaisseau(Vaisseau vaisseau) {
		nbTotalHumains= nbTotalHumains + vaisseau.nbPassagers;
		if (vaisseauActuellementAcoste == null) {
			System.out.println("Aucun vaisseau ne s'en va.");
		}
		else {
			System.out.println("Un vaisseau de type "+vaisseauActuellementAcoste.type+" doit s'en aller");
		}
		Vaisseau vaisseauPrecedent = vaisseauActuellementAcoste;
		vaisseauActuellementAcoste=vaisseau;
		return vaisseauPrecedent;
		
	}
}//EOC
