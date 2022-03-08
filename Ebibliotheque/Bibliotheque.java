package Ebibliotheque;

import java.util.ArrayList;

public class Bibliotheque implements Ebibliotheque{
    

    private ArrayList<Livre> livres;
    private ArrayList<Lecteur> lecteurs;



    public Bibliotheque(){

        this.livres= new ArrayList<Livre>();
        this.lecteurs= new ArrayList<Lecteur>();
    }


    public int ajouterLecteur(Lecteur lecteur){
        this.lecteurs.add(lecteur);
        return lecteur.getNumeroLecteur();
    }

    public long ajouterLivre(Livre livre){
        this.livres.add(livre);
        return livre.getNumeroLivre();
    }

    public void retirer(long numeroLivre){
        Livre livre = this.chercherLivreParNumero(numeroLivre);
        livres.remove(livre);
        System.out.println("le livre est supprimer " + numeroLivre);
    }


    
    public Lecteur chercherLecteurParNumero(long numero){

        Lecteur l = null;

        for(int i=0; i< lecteurs.size(); i++){

            if (lecteurs.get(i).getNumeroLecteur() == numero){

                l= lecteurs.get(i);
            }

        }

        return l;
    }



    public Livre chercherLivreParNumero(long numero){

        Livre l = null;

        for(int i=0; i< livres.size(); i++){

            if (livres.get(i).getNumeroLivre() == numero){

                l= livres.get(i);
            }

        }

        return l;
    }
}
