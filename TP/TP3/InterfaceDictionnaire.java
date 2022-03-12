package TP.TP3;

/**
 * L'interface InterfaceDictionnaire contient les méthodes à implémenter dans la classe Dictionnaire qui implémente
 * cette interface.
 * 
 * @author Thierry Delot
 *
 */
public interface InterfaceDictionnaire {
	
	/**
	 * Vérifie si un mot est contenu dans le dictionnaire
	 * @param mot - mot recherché dans le dictionnaire, est trouvé 
	 * @return true si le mot est présent dans le dictionnaire, qu'il soit écrit en minuscule ou en majuscule
	 */
	public boolean contientMot(String mot);
	
	/**
	 * Affiche le contenu du dictionnaire
	 */
	public void afficherContenu();
	
	/**
	 * Affiche les mots du dictionnaire commençant par la lettre l
	 */
	public void afficherContenu(char l);
	
	/**
	 * Calcule le nombre de mots stockés dans le dictionnaire
	 * @return la taille du dictionnaire
	 */
	public int taille();

}
