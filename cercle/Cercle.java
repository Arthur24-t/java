package cercle;
class Cercle {

	// Attributs
	protected int x;
	protected int y;
	protected int rayon;
	
	public Cercle() {
		x=0;
		y=0;
		rayon=10;
	}
	
	public Cercle(int x, int y, int rayon) {
		this.x = x;
		this.y = y;
		this.rayon = rayon;
	}
	
	//Methodes
	public void deplacerCentre(int x, int y) {
		this.x = this.x + x;
		this.y = this.y + y;
	}

	public void modifierRayon(int r) {
		rayon = r;
	}
	
	public void afficherProprietes(){
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("rayon="+rayon);
	}
}
