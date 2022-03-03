package TP.TP2;
import java.util.ArrayList; 

public class Ville{
    protected String nom;
    protected int nbHabitants;
    protected ArrayList<Route> routes = new ArrayList<Route>();
   

    public Ville(String nom)
    {
        this.nom = nom.toUpperCase();
        this.nbHabitants = 0;
    }

    public Ville(String nom, int nbHabitants)
    {
        this.nom = nom.toUpperCase();
        this.nbHabitants = nbHabitants;

    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom.toUpperCase();
    };
    
    
    public int getNbHabitants() {
        if (nbHabitants >= 0)
        {
            return 0;
        }
        else{
            return this.nbHabitants;
        }
    
    }

    public void setNbHabitant(int nbHabitants) {
        this.nbHabitants = nbHabitants;
    };

    public String toString() 
    {
        return "Ville de  " + this.nom + " ; "+
            this.nbHabitants +
           " Habitants ";
    }

    public boolean nbHabitantsConnu()
    {
        if(nbHabitants > 0 )
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String categorie()
    {
        if(nbHabitants > 500000)
        {
            return "A";
        }
        else if( nbHabitants <= 500000 && nbHabitants > 0)
        {
            return "B";
        }
        else if(nbHabitants == 0)
        {
            return "?";
        }
        else {
            return "erreur";
        }
    }

    
    public void addRoute(Route route, boolean sens)
    {
        routes.add(route);
    }
    
    public void listerRoutes(){

        for(Route elem: routes)
        {
             System.out.println (elem);
        }


    }

    public void listerItineraires(Ville v){
        String nomroute = v.getNom();
        
        for(Route elem: routes){
            if(nomroute == String.valueOf(elem)){
                System.out.println("la voix : " + String.valueOf(elem));
            }
        }
    }
}