package banque;

public class CompteEpargne extends Compte {

    private double tauxInteret;

    public double getTauxInteret() {
        return this.tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    public CompteEpargne(int numCompte, double tauxInteret){
        super(numCompte);
        this.tauxInteret = tauxInteret;
    }

    public CompteEpargne(int numCompte, double solde,String identite, double tauxInteret){
        super(numCompte, solde , identite);
        this.tauxInteret = tauxInteret;
    }

    public void operation(double montant){
        
        if(solde + montant < 0){

            System.out.println("Solde insufisant");
        }
        else if (solde + montant >= 0){
            super.operation(montant);
            System.out.println("l'operation s'est bien effectuer, solde actuel : " + solde);

        }
    }

        public void creditInteret(){
            solde+= solde * tauxInteret/100;
        }

        public void editerRelever(){
            super.editerRelever();
            System.out.println("le taux d'interet est de : " +tauxInteret+ "%");
        }

}
