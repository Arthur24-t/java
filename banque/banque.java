package banque;

public class banque {
    public static void main(String args[]) {
        Compte c1;
        Compte c2;
    c1 = new Compte(39283);
    c2 = new Compte(12, 33,"bleu");
       c1.editerRelever();
       c2.editerRelever();
       int numero = c1.getNumCompte();
        System.out.println("Numero de compte: " + numero);
        c1.operation(-200);
        c2.operation(200);
        c1.editerRelever();
       c2.editerRelever();
    }
}
