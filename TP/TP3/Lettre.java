package TP.TP3;

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

}
