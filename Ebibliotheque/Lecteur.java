package Ebibliotheque;

public class Lecteur {

    private String nom;
    private String prenom;
    private int tel;
    private int numeroLecteur;
    private int nbEmprunt;
    private static int compteur = 0;

    public Lecteur(String nom, String prenom, int tel) {
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.numeroLecteur = 0;
        compteur++;
        this.numeroLecteur = compteur;

    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getTel() {
        return this.tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getNumeroLecteur() {
        return this.numeroLecteur;
    }

    public void setNumeroLecteur(int numeroLecteur) {
        this.numeroLecteur = numeroLecteur;
    }

    public int getNbEmprunt() {
        return this.nbEmprunt;
    }

    public void increCompteurLivre() {
        this.nbEmprunt++;
    }

    public void decreCompteurLivre() {
        this.nbEmprunt--;
    }

}
