package TP.TP2;


public class Capitale extends Ville{
    

    private String nomPays;

    

    public Capitale(String nom, String nomPays) {
        super(nom);
        this.nomPays= nomPays.toUpperCase();
    }

    public Capitale(String nom,String nomPays, int nbHabitants) {
        super(nom, nbHabitants);
        this.nomPays = nomPays.toUpperCase();
    }
    public String getNomPays() {
        return this.nomPays;
    }

    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }

    public String categorie(){
        super.categorie();
        if(nomPays != ""){
            return "C";
        }
        else{
            return "erreur";
        }
    }

}
