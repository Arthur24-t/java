// TP en binome 
// Wandolski Pauline 
// Trusgnach Arthur


package TP.TP3

/**
 * La classe Chevalet permet de représenter le chevalet au scrabble qui comporte les 7 lettres à utiliser pour
 * former un mot puis le placer sur le plateau de jeu.
 * 
 * @author Thierry Delot
 *
 */
public class Chevalet {
	
	
	

	private char[] lettres; 	
	
	public Chevalet (char a, char b, char c, char d, char e, char f, char g) {
		lettres = new char[7];
		lettres[0] = a;
		lettres[1] = b;
		lettres[2] = c;
		lettres[3] = d;
		lettres[4] = e;
		lettres[5] = f;
		lettres[6] = g;
	}
	
	public char[] getLettres() {
		return this.lettres;
	}
	
}
