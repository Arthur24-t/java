package TP.TP2;

public class Autoroute extends Route{
   
    private int nbVoie;
    private double tarif;

    public int getNbVoie() {
        return this.nbVoie;
    }

    public void setNbVoie(int nbVoie) {
        this.nbVoie = nbVoie;
    }

    public double getTarif() {
        return this.tarif;
    }

    public void setTarif(double tarif) {
        this.tarif = tarif;
    }


    public Autoroute(String nomRoute, int limitation, int distance,int nbVoie, Ville Destination, double tarif) {
        super(nomRoute, limitation, distance, Destination);
        this.nbVoie=nbVoie;
        this.tarif= tarif;
    }


}
