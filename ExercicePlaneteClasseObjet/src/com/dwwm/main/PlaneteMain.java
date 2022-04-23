package com.dwwm.main;

import com.dwwm.entities.Atmosphere;
import com.dwwm.entities.Planete;
import com.dwwm.entities.Vaisseau;

public class PlaneteMain {

	public static void main(String[] args) {
		Planete mercure = new Planete("Mercure");
//		mercure.nom="Mercure";
		mercure.matiere="Tellurique";
		mercure.diametre=4880;
		
		Planete venus = new Planete("Venus");
//		venus.nom="Venus";
		venus.matiere="Tellurique";
		venus.diametre=12100;
		
		Planete terre = new Planete("Terre");
//		terre.nom="Terre";
		terre.matiere="Tellurique";
		terre.diametre=12756;
		
		Planete mars = new Planete("Mars");
//		mars.nom="Mars";
		mars.matiere="Tellurique";
		mars.diametre=6792;
		
		Planete jupiter = new Planete("Jupiter");
//		jupiter.nom="Jupiter";
		jupiter.matiere="Gazeuse";
		jupiter.diametre=142984;
		
		Planete saturne = new Planete("Saturne");
//		saturne.nom="Saturne";
		saturne.matiere="Gazeuse";
		saturne.diametre=120536;
		
		Planete uranus = new Planete("Uranus");
//		uranus.nom="Uranus";
		uranus.matiere="Gazeuse";
		uranus.diametre=5118;
		
		Atmosphere atmosphereUranus = new Atmosphere();
		atmosphereUranus.tauxHydrogene=83f;
		atmosphereUranus.tauxHelium=15f;
		atmosphereUranus.tauxMethane=2.5f;
		
		uranus.atmosphere=atmosphereUranus;
		
		Planete neptune = new Planete("Neptune");
//		neptune.nom="Neptune";
		neptune.matiere="Gazeuse";
		neptune.diametre=49532;
		
		
		System.out.println(jupiter.nom+" est une planete "+jupiter.matiere+" avec un diamètre de"+jupiter.diametre+" kilometres.");
		
//		Planete planeteX = new Planete();
//		System.out.println(planeteX.nom+"est une planete"+planeteX.matiere+"avec un diametre de"+planeteX.diametre+"kilometres.");
		
//		neptune.revolution();
//		mars.rotation();
//		System.out.println("Neptune a effectue "+neptune.revolution(-3542)+" tours autour de son etoile");
//		System.out.println("Mars a effectue "+mars.rotation(-684)+" tours sur elle-meme");
//		System.out.println("Venus a effectue "+venus.rotation(1250)+" tours sur elle-meme");
		
		//=========================================================================//
		
		Vaisseau nouveauVaisseau = new Vaisseau();
		nouveauVaisseau.type="FREGATE";
		nouveauVaisseau.nbPassagers=9;
		mars.accueillirVaisseau(nouveauVaisseau);
		Vaisseau autreVaisseau = new Vaisseau();
		autreVaisseau.type="CROISEUR";
		autreVaisseau.nbPassagers=42;
		mars.accueillirVaisseau(autreVaisseau);
		
		System.out.println("Le nombre d'humains ayant deja sejourne sur Mars est actuellement de "+mars.nbTotalHumains);
		
		System.out.println("L'atmosphere de Uranus est composée :");
		System.out.println("A " +atmosphereUranus.tauxHydrogene+ " % d'hydrogene");
		System.out.println("A " +atmosphereUranus.tauxArgon+ " % d'argon");
		System.out.println("A " +atmosphereUranus.tauxAzote+ " % d'azote");
		System.out.println("A " +atmosphereUranus.tauxDioxydeDeCarbone+ " % de Dioxyde de carbone");
		System.out.println("A " +atmosphereUranus.tauxHelium+ " % d'helium");
		System.out.println("A " +atmosphereUranus.tauxMethane+ " % de methane");
		System.out.println("A " +atmosphereUranus.tauxSodium+ " % de sodium");
		
		//========================================Attribut static=====================================//
		
//		System.out.println("La forme d'une planete est "+Planete.forme);
//		System.out.println("La forme de Uranus est "+uranus.forme);
		
//		System.out.println(Planete.expansion(10.5));
//		System.out.println(Planete.expansion(14.2));
		
		//=========================================Constructeur=====================================//
		
		System.out.println("Le nombre de planetes découvertes est actuellement de "+Planete.nbPlanetesDecouvertes);
		
	}//EOF

}//EOC
