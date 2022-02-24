package scrable;
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
		
		//dico.afficherContenu();
		
		// Génération d'un chevalet
		Chevalet c1 = new Chevalet('b', 'o', 'n', 'j', 'o', 'u', 'r');
		
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

}
