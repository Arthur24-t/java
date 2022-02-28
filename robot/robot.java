package robot;

public class robot {
    private String nom;
    private int num;
    private int posiX;
    private int posiY;
    private int orientation;

    public robot() {
        nom = "null";
        num = 0;
        posiX = 0;
        posiY = 0;
        orientation = 0;
    }

    public robot(int posiX, int posiY, String nom, int orientation) {

        this.posiX = posiX;
        this.posiY = posiY;
        this.nom = nom;
        this.orientation = orientation;
    }

    public robot(robot r) {
        this.posiX = r.posiX;
        this.posiY = r.posiY;
        this.nom = r.nom;
        this.num = r.num;
        this.orientation = r.orientation;
    }

    public int getPosiX() {
        return posiX;
    }

    public int getPosiY() {
        return posiY;
    }

    public int getNum() {
        return num;
    }

    public String getNom() {
        return nom;
    }

    public int getOrientation() {
        return orientation;
    }

    public void setPosiY(int posiY) {

        this.posiY = posiY;
    }

    public void setNum(int num) {

        this.num = num;
    }

    public void setNom(String nom) {

        this.nom = nom;
    }

    public void setorientation(int orientation) {

        this.orientation = orientation;
    }

    public void avancer(int nb) {

        switch (orientation) {

            case 0:
                posiX += nb;
                break;

            case 1:
                posiY += nb;
                break;

            case 2:
                posiX -= nb;
                break;

            case 3:
                posiY -= nb;
                break;
            default:
                System.out.println("Le robot a planter");
                break;

        }

    }

    public void tournerDroit() {
        switch (orientation) {

            case 0:
                orientation = 1;
                break;

            case 1:
                orientation = 2;
                break;

            case 2:
                orientation = 3;
                break;

            case 3:
                orientation = 0;
                break;
            default:
                System.out.println("Le robot a planter");
                break;

        }
    }

public void Etat(){
    System.out.println("le robot : " + nom + " de numero " + num + "est en position : X= "+ posiX +" Y= "+ posiY + "et d'orientation "+ orientation);
}

}
