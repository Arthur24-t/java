package TP.TP3;

/**
 * InterfaceScrabble contient les différentes méthodes que vous devez implémenter dans la classe Scrabble
 * Il contient également un tableau non modifiable avec les points associés aux lettres du jeu
 * 
 * @author Thierry Delot
 *
 */
public interface InterfaceScrabble {
		
	// Contient les points associés aux 26 lettres de l'alphabet (a vaut 1 point, b vaut 3 points, etc.)
	public static final int[] pointsLettres = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 10, 1, 2, 1, 1, 3, 8, 1, 1, 1, 1, 4, 10, 10, 10, 10} ;	
	public static final char[] lettres={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	/**
	 * Détermine le nombre de points du mot passé en paramètre
	 * @param mot String dont on veut connaître le nombre de points
	 * @return le nombre de points calculé
	 */
	public int nombrePoints(String mot);
	
	/**
	 * Forme le meilleur mot possible (celui qui compte le plus de points) à l'aide des lettres passées en paramètre 
	 * @param lettres chevalet contenant les 7 lettres à utiliser pour former un mot
	 * @return le mot formé à l'aide des lettres du chevalet
	 * @throws PasDeSolution - exception levée si aucun mot ne peut être formé à l'aide des lettres du chevalet
	 */
	public String formerMot(Chevalet lettres) throws PasDeSolution;
		
	/**
	 * Forme le meilleur mot possible (celui qui compte le plus de points) à l'aide des lettres passées en paramètre. 
	 * Ce mot contient obligatoirement la lettrePivot passée en paramètre (afin de pouvoir le placer sur la grille).
	 * @param lettres chevalet contenant les 7 lettres à utiliser pour former un mot
	 * @param lettrePivot lettre à inclure obligatoirement dans le mot formé
	 * @return le mot formé à l'aide des lettres du chevalet
	 * @throws PasDeSolution - exception levée si aucun mot ne peut être formé à l'aide des lettres du chevalet
	 */
	public String formerMot(Chevalet lettres, char lettrePivot) throws PasDeSolution;
	
}

