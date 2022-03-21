// TP en binome 
// Wandolski Pauline 
// Trusgnach Arthur



package TP.TP3

public class PlacementImpossible extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String toString() {
		return "Erreur : " + this.getMessage();
	}
	
	public String getMessage() {
		return "Placement impossible";
	}
}
