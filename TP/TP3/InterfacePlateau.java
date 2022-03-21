package TP.TP3


/**
 * InterfacePlateau contient les méthodes à définir (a minima) dans la classe Plateau
 * @author Thierry Delot
 *
 */
public interface InterfacePlateau {
	
	/**
	 * Place un mot dans un plateau de jeu vide (le premier mot joué)
	 * @param mot
	 */
	public void placerMot(String mot);
	
	/**
	 * Placer un mot démarrant par la lettre 'lettre' déjà placée sur le plateau
	 * @param mot à placer sur le plateau de jeu
	 * @param lettre déjà placée sur le plateau qui constitue la première lettre du mot formé
	 * @throws PlacementImpossible exception levée si le mot 'mot' ne peut pas être placé à partir de la lettre 'lettre' sur le plateau
	 */
	public void placerMot(String mot, Lettre lettre) throws PlacementImpossible;
	
	/**
	 * Renvoie les lettres sur le plateau à partir desqueslles des mots pourront être générés puis placés.
	 * La lettre ainsi renvoyée pourra constituer la première lettre d'un mot 
	 * @return
	 */
	public Lettre[] premieresLettres();
	
	/**
	 * Affiche le plateau de jeu
	 */
	public void afficher();

}
