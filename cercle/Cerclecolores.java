package cercle;
class CercleColores extends Cercle {

	// Attributs
	private String couleur;
	
	public CercleColores() {
		x=0;
		y=0;
		rayon=10;
		couleur="rouge";
	}
	
	public CercleColores(int x, int y, int rayon, String couleur) {
		super(x,y,rayon);
		this.couleur = couleur;
	}
	
	//Methodes	
	public void afficherProprietes(){
        System.out.println();
        System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("rayon="+rayon);
		System.out.println("couleur="+couleur);
	}
}
