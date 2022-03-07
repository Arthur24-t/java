package PoupeeRusse;


public class PoupeeRusse {

    private int taille;
    private boolean ouverte;
    private PoupeeRusse poupeeContenue;
    private PoupeeRusse poupeeContenante;
    private int numPoupee;
    private static int compteur = 0;

    public PoupeeRusse(int taille) {
        this.taille = taille;
        compteur++;
        this.numPoupee = compteur;
        this.ouverte = false;
        this.poupeeContenue = null;
        this.poupeeContenante = null;

    }

    public void ouvrir() {
        if (this.ouverte == false && this.poupeeContenante == null) {
            this.ouverte = true;
        } else {
            System.out.println("Tu peux pas ouvrir la poupee :" + numPoupee);
        }

    }

    public void fermer() {
        if (this.ouverte == true && this.poupeeContenue == null && !this.poupeeContenue.ouverte) {
            this.ouverte = false;
        }
        if (this.poupeeContenue == null && this.ouverte == true) {
            this.ouverte = false;
        } else {
            System.out.println("Tu peux pas fermer la poupee :" + numPoupee);
        }

    }

    public void placerDans(PoupeeRusse P) {

        if (this.poupeeContenante == null && P.poupeeContenue == null && !this.ouverte && P.ouverte
                && this.taille < P.taille) {
            P.poupeeContenue = this;
            this.poupeeContenante = P;
            System.out.println("la poupée " + this.numPoupee + " a ete placée dans la poupée" + P.numPoupee);
        } else {
            System.out.println("c'est non");
        }
    }

    public void sortirDe() {
        if (this.poupeeContenante == null) {
            System.out.println("pas de contenant, impossible de sortir de rien");
        } else if (this.poupeeContenante.ouverte) {
            PoupeeRusse P = this.poupeeContenante;
            P.poupeeContenue = null;
            this.poupeeContenante = null;
        }
    }





    public int nbPoupeesContenuesR(){


        if(this.poupeeContenue == null){
           return 0;
        }
        else 
        {
           return 1 + this.poupeeContenue.nbPoupeesContenuesR();
        }


    }

    public int nbPoupeesContenuesI(){

return 0;

    }


}
