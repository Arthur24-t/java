// TP en binome 
// Wandolski Pauline 
// Trusgnach Arthur


package TP.TP3

import java.util.*;

/**
 * La classe Scrabble permet d'initialiser et de gérer une partie 
 * 
 * @author Thierry Delot
 *
 */
public class Scrabble implements InterfaceScrabble {
	
	private Dictionnaire dico;
	private Plateau plateau;
	private ArrayList <String> alpha = new ArrayList <String>();
	
	public Scrabble() throws PasDeSolution {
		
		
		for (int i=0; i<26; i++) {
			String x = String.valueOf(this.alphabet[i]);
			int y = this.pointsLettres[i];
			this.alpha.add(x);
		}
		
		
		
		plateau = new Plateau();
		
		
		
		try {
			dico = Dictionnaire.readFile("../Dictionnaire.ser");
		}
		catch (Exception e) {
			
			dico = new Dictionnaire();
			System.out.println("lecture dictionnaire...");
			Dictionnaire.saveFile(dico, "Dictionnaire.ser");
			System.out.println("dictionnaire enregistré...");
		}
		
		Chevalet c1 = new Chevalet('b', 'o', 'n', 'j', 'o', 'u', 'r');
		Chevalet c2 = new Chevalet('j', 'g', 'n', 'a', 'r', 'o', 'd');
		Chevalet c3 = new Chevalet('k', 'p', 'a', 'r', 'q', 'u', 'f');
		Chevalet c4 = new Chevalet('r', 'z', 'h', 'k', 'x', 'u', 'g');
		
		System.out.println("Le meilleur mot qu'on peut former avec les lettres du chevalet est : '" + formerMot(c1) + "' et il rapporte " + nombrePoints(formerMot(c1)) + " points.");
		
	
		try {
			String mot = this.formerMot(c1);
			plateau.placerMot(mot);
		}
		catch (PasDeSolution e) {
			e.getMessage();
		}
		
);
		plateau.LettresSurPlateau(plateau);
		
			plateau.afficher();
	
		try
		{
		    Thread.sleep(1000);
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
		
		
		try {
			Lettre lettre1 = new Lettre('B', 0, 0);
			String mot = this.formerMot(c2, 'B');
			plateau.placerMot(mot, lettre1);
		}
		catch (PlacementImpossible e) {
			e.getMessage();
		}
		plateau.afficher();
		
	
		try
		{
		    Thread.sleep(1000);
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
		
		//Mot 2
		try {
			Lettre lettre2 = new Lettre('A', 0, 0);
			String mot = this.formerMot(c3, 'A');
			plateau.placerMot(mot, lettre2);
		}
		catch (PlacementImpossible e) {
			e.getMessage();
		}
		plateau.afficher();
		
	
		try
		{
		    Thread.sleep(1000);
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
		
		//Mot 3
		try {
			Lettre lettre3 = new Lettre('R', 0, 0);
			String mot = this.formerMot(c4, 'R');
			plateau.placerMot(mot, lettre3);
		}
		catch (PlacementImpossible e) {
			e.getMessage();
		}
		plateau.afficher();
	}
	
	
	
	
	public int nombrePoints(String mot) {
		int total = 0;
		for (int i=0; i<mot.length(); i++) {
			String lettre = String.valueOf(mot.charAt(i));
			lettre = lettre.toLowerCase();
			int indice = this.alpha.indexOf(lettre);
			int point = this.pointsLettres[indice];
			total += point;
		}
		return total;
	}


	public String formerMot(Chevalet lettres) throws PasDeSolution {
		n
		int pointsMeilleur = 0;
		
		ArrayList <String> mots_possibles = motsPossibles(lettres);
		
		char [] lettres_chevalet = lettres.getLettres();
		
		
		String meilleur = null;
		
		
		for (int index = 0 ; index < mots_possibles.size() ; index++) {
			if (nombrePoints(mots_possibles.get(index)) > pointsMeilleur) {
				pointsMeilleur = nombrePoints(mots_possibles.get(index));
				meilleur = mots_possibles.get(index);
			}
		}
		return meilleur;
	}

	public ArrayList<String> motsPossibles (Chevalet ch) {
		

		ArrayList <String> mots_possibles = new ArrayList <String>();
		char [] lettres_chevalet = ch.getLettres();
		String nvMot;
		nvMot = String.valueOf(lettres_chevalet).toUpperCase();
		
		if (this.dico.contientMot(nvMot) && !mots_possibles.contains(nvMot)) {
			mots_possibles.add(nvMot);
		}
		
		for (int i=0; i<7; i++) {
			for (int j=0; j<6; j++) {
				String motVerif;
				int c = 5;
				while (c>=0) {
					for (int x=0; x<=c; x++) {
						char [] lettres_temp = Arrays.copyOfRange(lettres_chevalet, x, x+(6-c));
						motVerif = String.valueOf(lettres_temp);
						motVerif = motVerif.toUpperCase();
						
						if (this.dico.contientMot(motVerif)  && !mots_possibles.contains(motVerif)) {
							
								mots_possibles.add(motVerif);
							
						}
					}
					c--;
				}
				
				char temp = nvMot.charAt(j+1);
				if (j>=1) {
					nvMot = nvMot.substring(0,j) + String.valueOf(temp) + nvMot.charAt(j) + nvMot.substring(j+2);
				}
				else {
					nvMot = String.valueOf(temp) + nvMot.charAt(j) + nvMot.substring(j+2);
				}
				
				lettres_chevalet = nvMot.toCharArray();
			}
		}

		return mots_possibles;
	}
	

	public String formerMot(Chevalet lettres, char lettrePivot) throws PasDeSolution {
		int pointsMeilleur = 0;
		String pivot = String.valueOf(lettrePivot).toUpperCase();
		
		ArrayList <String> mots_possibles = motsPossibles(lettres);
		
		char [] lettres_chevalet = lettres.getLettres();
		
		
		String meilleur = null;
		
		
		for (int index = 0 ; index < mots_possibles.size() ; index++) {
			String temp = mots_possibles.get(index);
			if (nombrePoints(temp) > pointsMeilleur && temp.contains(pivot)) {
				pointsMeilleur = nombrePoints(temp);
				meilleur = temp;
			}
		}
		return meilleur;
	}
	
	
	

	public static void main(String args[]) throws PasDeSolution {
		
		new Scrabble(); 
	}


}
