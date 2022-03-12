package TP.TP3;

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
				grille[i][i]='.';
	}

	@Override
	public void placerMot(String mot) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void placerMot(String mot, Lettre lettre) throws PlacementImpossible {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Lettre[] premieresLettres() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		
	}



}
