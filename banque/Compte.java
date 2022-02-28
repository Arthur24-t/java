package banque;

public class Compte {
    protected int numCompte;
    protected double solde;
    protected String identite;

    public Compte(int numCompte) {
        this.numCompte = numCompte;
        solde = 0;
        identite = "";
    }

    public Compte(int numCompte, String identite) {
        this.numCompte = numCompte;
        this.identite = identite;
        solde = 0;
    }

    public Compte(int numCompte, double solde, String identite) {
        this.numCompte = numCompte;
        this.identite = identite;
        this.solde = solde;
    }

public int getNumCompte(){
    return numCompte;
}

public double getSolde(){
    return numCompte;
}

public String getidentite(){
    return identite;
}


public void setNumCompte(int numCompte){
    this.numCompte = numCompte;
}

public void setsolde(double solde){
    this.solde = solde;
}

public void setIdentite(String identite){
    this.identite = identite;
}

public void operation(double montant){
solde += montant;

}

public void editerRelever(){

System.out.println("le compte de numero " + numCompte + " est pour " + identite + " contient : " + solde +"€");

}



}
