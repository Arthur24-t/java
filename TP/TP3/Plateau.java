// TP en binome 
// Wandolski Pauline 
// Trusgnach Arthur



package TP.TP3
import java.util.*;

/**
 * La classe Plateau permet de représenter un plateau de jeu de Scrabble
 * Cette classe est à implémenter
 * @author Thierry Delot
 *
 */
public class Plateau implements InterfacePlateau {
	
	/**
	 * Le tableau à deux dimensions grille, contient des caractères et est utilisé pour représenter le plateau de jeu.
	 * Ce tableau peut contenir un '.' si la case est vide ou une lettre si celle-ci a été placée sur la case correspondante.
	 */
	private char[][] grille;
	
	/**
	 * Initialisation du plateau
	 */
	public Plateau() {
		grille = new char[15][15];		
		for (int i=0;i<15; i++)
			for (int j=0; j<15; j++)
				grille[i][j]='.';
	}

	
	public void placerMot(String mot) {
		System.out.println("Le mot : " + mot);
		char[] lettres = mot.toCharArray();
		char choix = this.Direction(mot);
		int c = 0;
		
		for (int i=7; i<(7+mot.length()); i++) {
			if (choix == 'H') {
				this.grille[7][i] = lettres[c];
				c++;
			}
			else {
				this.grille[i][7] = lettres[c];
				c++;
			}
		}
		System.out.println("Plac� avec succ�s ! Bonne partie !");
		
	}


	public void placerMot(String mot, Lettre lettre) throws PlacementImpossible {
		System.out.println("Votre mot est : " + mot);
		Lettre [] liste = this.LettresSurPlateau(this);
		for (Lettre L : liste) {
			if (L.getValeur() == lettre.getValeur()) {
				lettre.setX(L.getX());
				lettre.setY(L.getY());
				System.out.printf("Lettre sur le plateau '%s' | Coordonn�es (%d,%d)\n", lettre.getValeur(),lettre.getX(), lettre.getY());
				continue;
			}
		}
		
		String val = String.valueOf(lettre.getValeur());
		
		char[] lettres = mot.toCharArray();
		
		if (!mot.contains(val)) {

			throw new PlacementImpossible();
		}
		else {
				char choix = this.Direction(mot);
			int index_lettre = mot.indexOf(val);
			int X = lettre.getX();
			int Y = lettre.getY();
			
				if (choix == 'H') {
				
				for (int i=0; i<mot.length(); i++) {
					grille[X][Y+i-index_lettre] = lettres[i];
				}
			}
			else {
			
				for (int i=0; i<mot.length(); i++) {
					grille[X+i-index_lettre][Y] = lettres[i];
				}
			}
			
		}
		
	}

	public Lettre[] premieresLettres() {
	
		Lettre[] liste = new Lettre[225];
		int nb = 0;
		for (int i=0; i<15; i++) {
			for (int j=0; j<15; j++) {
				
				if (this.grille[i][j] != '.') {
					char value = this.grille[i][j];
					Lettre result = new Lettre(value, i, j);
					liste[nb] = result;
					nb++;
				}
			}
		}
		return liste;
	}


	public void afficher() {
		System.out.println(this);
	}

	public String toString() {
		System.out.println("\nImpression de la grille.\n{");
		for (int i=0; i<15; i++) {
			for (int j=0; j<15; j++) {
				System.out.printf("[%s] ; ", this.grille[i][j]);
			}
			System.out.println();
		}
		return "}";
	}

	public char Direction(String mot) {		
		
		char choix = ' ';
		
		while (choix != 'H' && choix != 'V') {
			Scanner sc = new Scanner(System.in);
			System.out.println("Voulez-vous placer le premier mot horizontalement (gauche vers droite) ou veticalement (haut vers bas) ? (h/v)");
			choix = sc.next().charAt(0);
			choix = Character.toUpperCase(choix);
			
		}
		
		return choix;
	}
	
	public Lettre[] LettresSurPlateau (Plateau p) {
		
		Lettre[] e = p.premieresLettres();
		int nbLettres = 0;
		int cpt = 0;
		
		for (Lettre L : e) {
			if (L != null) {
				nbLettres++;
			}
		}
		
		Lettre [] liste = new Lettre[nbLettres];
		System.out.printf("Il y a %d lettres pr�sentes sur le plateau.\nCes lettres sont les suivantes : \n", nbLettres);
		
		for (Lettre L : e) {
			if (L != null) {
				System.out.printf("Lettre : %c ; Coordonn�es : (%d,%d)\n", L.getValeur(), L.getX(), L.getY());
				liste[cpt] = L;
				cpt++;
			}
		}
		
		return liste;
	}
}
