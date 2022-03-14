package TP.TP3;

import java.util.ArrayList;
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
		Chevalet c1 = new Chevalet('B', 'O', 'N', 'J', 'O', 'U', 'R');
		
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
		
		System.out.println("voici les lettres du chevalet :");
		char[] lettre = lettres.getLettres();
		ArrayList<Integer> bon = new ArrayList<Integer>();
		for(int i=0; i< 7; i++){
			System.out.print("-"+ lettre[i]+"-");
		}

		System.out.println("entrer un mot");
		String mot = scanner.nextLine();
		

		for(int i=0; i< mot.length(); i++){
			
			bon.add(mot.indexOf(lettre[i]));

		System.out.println(mot.indexOf(lettre[i]));
		}

		for (int j=0; j< mot.length(); j++)
{
		//System.out.println(bon.get(j));
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
