package cercle;
class Test {
	
	public static void main(String args[]){
		
		Cercle c = new Cercle();
		CercleColores cc1 = new CercleColores(2,2,5,"bleu");
		CercleColores cc2 = new CercleColores();
		
		System.out.println("Affichage c...");
		c.afficherProprietes();
		
		System.out.println("Affichage cc1...");
		cc1.afficherProprietes(); // Appel de la méthode redéfinie dans la classe dérivée
		System.out.println("Affichage cc2 modifie...");
		cc2.modifierRayon(25); // Appel d'une méthode héritée de la super-classe
		cc2.afficherProprietes();

		
		// Creation d'un tableau pouvant contenir des cercles, et donc des cercles colores !
		Cercle[] tableauCercles = new Cercle[3];
		
		tableauCercles[0] = c;
		tableauCercles[1] = cc1;
		tableauCercles[2] = cc2;
        
        System.out.println();
        System.out.println("Affichage des elements contenus dans le tableau");
		for (int i = 0 ; i < 3 ; i++) {
			tableauCercles[i].afficherProprietes(); // affiche les proprietes des cercles contenus dans le tableau
		}
		
		
		
		
	}
}