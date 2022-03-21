package TP.TP3

public class PasDeSolution extends java.lang.Exception {
	
	private static final long serialVersionUID = 1L;

	public String toString(){ 
		return ("Erreur : " + this.getMessage());
	}
	
	public String getMessage() {
		return "Pas de solutions avec les lettres du chevalet";
	}
}
