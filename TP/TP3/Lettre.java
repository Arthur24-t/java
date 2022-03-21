// TP en binome 
// Wandolski Pauline 
// Trusgnach Arthur


package TP.TP3

/**
 * La classe Lettre permet de représenter une lettre placée sur le plateau ainsi que ses coordonnées
 * @author Thierry Delot
 *
 */
public class Lettre {
	
	private char valeur;
	private int x;
	private int y;
	
	public Lettre(char valeur, int x, int y) {
		this.valeur = valeur;
		this.x = x;
		this.y = y;
	}

	//Getters & Setters
	public char getValeur() {
		return valeur;
	}

	public void setValeur(char valeur) {
		this.valeur = valeur;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
