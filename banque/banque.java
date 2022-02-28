package banque;

public class banque {
    public static void main(String args[]) {
        Compte c1;
        Compte c2;
        c1 = new Compte(39283);
        c2 = new Compte(12, 33, "bleu");
        c1.editerRelever();
        c2.editerRelever();
        int numero = c1.getNumCompte();
        System.out.println("Numero de compte: " + numero);
        c1.operation(-200);
        c2.operation(200);
        c1.editerRelever();
        c2.editerRelever();
        System.out.println();


        //////////////////////////////////////////////////////////////////////////
        ///////////////////////// 2e version /////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////

        Compte[] Comptes = new Compte[10];
        compteDepot cd;
        cd = new compteDepot(101, 4744, "bleu");
        CompteEpargne ce;
        ce = new CompteEpargne(4544, 444, "moi", 0.3);

        ce.operation(200);

        Comptes[0]= c1;
        Comptes[1]=c2;
        Comptes[3]=cd;
        Comptes[4]=ce;
        Comptes[2]= new compteDepot(102,500, "truc");

        Comptes[1].editerRelever();
        for(int i=0; i < 5; i++){
        Comptes[i].editerRelever();
        }
    }
}
