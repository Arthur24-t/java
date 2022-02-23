package equation;

public class Eq2degre {

    private double r1, r2;
    private double delta, a, b, c;

    public Eq2degre (double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
    delta = b*b-4*a*c;

    }

    public void afficheDiscriminant () {
        System.out.println("La valeur Delta est " + delta);
    }

    public void resoudreEquation () {
        if (delta>0) {
        r1 = (-b - Math.sqrt(delta)) / (2 * a);
        r2 = (-b + Math.sqrt(delta)) / (2 * a);
    }
        else if (delta==0); {
        r1 = -b / 2 * a; }
    }


    public void afficheSolution () {
        {    if (delta>0)
            System.out.println("Deux solutions r1 = " + r1 + " et r2 = " + r2);
         else if  (delta==0) {
        System.out.println("r1 = à r2 = " + r1); }
            else  System.out.println("pas de solutions réels");
         }
    }
}