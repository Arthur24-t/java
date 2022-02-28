package banque;

public class compteDepot extends Compte {

    protected int nbOperation;
    protected double[] operations;

    public int getNbOperation() {
        return this.nbOperation;
    }

    public void setNbOperation(int nbOperation) {
        this.nbOperation = nbOperation;
    }

    public double[] getOperations() {
        return this.operations;
    }

    public void setOperations(double[] operations) {
        this.operations = operations;
    }

    
    public compteDepot(int numCompte) {
        super(numCompte);
        nbOperation = 0;
        operations = new double[1000];
    }

    public compteDepot(int numCompte, double solde, String identite) {
        super(numCompte, solde, identite);
        nbOperation = 0;
        operations = new double[1000];
        operations[0] = solde;
        nbOperation++;
    }

}
