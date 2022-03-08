package Ebibliotheque;

public interface Ebibliotheque {
    
 public static final int  nbEmpruntMax = 5;



public int ajouterLecteur(Lecteur lecteur);
public long ajouterLivre(Livre livre);
public void retirer(long numeroLivre);
public void preter(long numeroLivre, int numeroLecteur);
public void retourner(long numeroLivre);
public void editerBilan();



}
