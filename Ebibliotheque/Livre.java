package Ebibliotheque;

import java.util.ArrayList;
import java.util.Date;

public class Livre {
    
    private String titre;
    private ArrayList<String> auteurs;
    private long numeroLivre;
    private Lecteur lecteur;
    private Date date;
    private static int compteur = 0;

    public Livre(String titre, ArrayList<String> auteurs, long numeroLivre) {
        this.titre = titre;
        this.auteurs = auteurs;
        compteur++;
        numeroLivre = compteur;  
        
    }



    public String getTitre() {
        return this.titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public ArrayList<String> getAuteurs() {
        return this.auteurs;
    }

    public void setAuteurs(ArrayList<String> auteurs) {
        this.auteurs = auteurs;
    }

    public long getNumeroLivre() {
        return this.numeroLivre;
    }

    public void setNumeroLivre(long numeroLivre) {
        this.numeroLivre = numeroLivre;
    }

    public Lecteur getLecteur() {
        return this.lecteur;
    }

    public void setLecteur(Lecteur lecteur) {
        this.lecteur = lecteur;
    }

    public void setDateEmprunt(Date date){
        this.date = date;
    }
   
    
    public void  emprunter(Lecteur lecteur){

        this.lecteur= lecteur;
        this.date = new Date();
        System.out.println(date);

    }

   


    




}