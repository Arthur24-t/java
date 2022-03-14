package TP.TP3;

import java.util.Scanner;

/**
 * La classe Scrabble permet d'initialiser et de gérer une partie 
 * 
 * @author Thierry Delot
 *
 */
public class Scrabble implements InterfaceScrabble {
	
	private Dictionnaire dico;
	private Plateau plateau;
	
	public Scrabble() {
		
		// Initialisation du plateau de jeu
		plateau = new Plateau();
		
		// Chargement du dictionnaire
		
		try {
			dico = Dictionnaire.readFile("Dictionnaire.ser");
		}
		catch (Exception e) {
			//System.out.println(e);
			dico = new Dictionnaire();
			System.out.println("lecture dictionnaire...");
			Dictionnaire.saveFile(dico, "Dictionnaire.ser");
			System.out.println("dictionnaire enregistré...");
		}
		
		dico.afficherContenu();
		
		// Génération d'un chevalet
		Chevalet c1 = new Chevalet('b', 'o', 'n', 'j', 'o', 'u', 'r');
		
		// Exemple de génération et de placement d'un mot
		try {
			String mot = this.formerMot(c1);
			plateau.placerMot(mot);
		}
		catch (PasDeSolution e) {
		}

		// A VOUS DE JOUER POUR LA SUITE !
		
	}

	public static void main(String args[]) {
		new Scrabble(); 
		


	}


	public int nombrePoints(String mot) {
	char lettre;
	int total=0;
	int position=0; 
		for (int i =0; i< mot.length();i++){
			lettre = mot.charAt(i);

			for(int j=0; j < lettres.length;j++){
				if(lettre == lettres[j]){
					position = j;
				}
			}
			total += pointsLettres[position];
		}

		return total;
	}

	
	public String formerMot(Chevalet lettres) throws PasDeSolution {
		Scanner scanner = new Scanner(System.in);
		boolean contient = false;
		boolean contientLettre = true;
		int compteur = 0;
		int occurence = 0;
		int occurenceMot = 0;
		int cpmt=0;
		int cpmtO=0;
		System.out.println("voici les lettres du chevalet :");
		char[] lettre = lettres.getLettres();
		for(int i=0; i< 7; i++){
			System.out.print("-"+ lettre[i]+"-");
		}

		System.out.println("entrer un mot");
		String mot = scanner.nextLine();

		//chercher l'occurence
		for(int j=0; j< 7; j++){
	char l = lettre[j];
			for(int k=0; k< 7; k++){
				
				
			if(l == lettre[k]){
				cpmt++;
			}	
		}
		}
		if (cpmt != 7){

			occurence = cpmt - 7;
		}
		

		for(int j=0; j< mot.length(); j++){
			char l = mot.charAt(j);
					for(int k=0; k< mot.length(); k++){
						
						
					if(l == mot.charAt(k)){
						cpmtO++;
					}	
				}
				}

				if (cpmtO != mot.length()){

					occurenceMot = cpmtO - mot.length();
				}

				
		System.out.println(occurenceMot);

		for(int j=0; j< mot.length(); j++){

			for(int k=0; k< 7; k++){
				char truc = lettre[k];
				truc = Character.toUpperCase(truc);
				System.out.println(truc);

			if(mot.charAt(j) == truc){
				compteur++;
			}	
		}
		}

		
		
		compteur =  compteur - occurence;
		int longueurMot = mot.length();
		longueurMot -= occurenceMot;
		System.out.println(longueurMot);
		System.out.println(compteur);
		if(compteur != longueurMot){
			contientLettre = false;
			System.out.println("vous n'avez pas utiliser les lettres du chevaler");
		}


		contient = dico.contientMot(mot);
		System.out.println(contient);
		return mot;
	}

	@Override
	public String formerMot(Chevalet lettres, char lettrePivot) throws PasDeSolution {
		// TODO Auto-generated method stub

		
		return null;
	}

}
