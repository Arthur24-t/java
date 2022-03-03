package TP.TP2;

public class Route {
    protected String nomRoute;
    protected int limitation;
    protected int distance;
    protected Ville Destination;


    public Route(String nomRoute, int limitation, int distance, Ville Destination) {
        this.nomRoute = nomRoute;
        this.limitation = limitation;
        this.distance = distance;
        this.Destination = Destination;
    }






    public String getNomRoute() {
        return this.nomRoute;
    }

    public void setNomRoute(String nomRoute) {
        this.nomRoute = nomRoute;
    }

    public int getLimitation() {
        return this.limitation;
    }

    public void setLimitation(int limitation) {
        this.limitation = limitation;
    }

    public int getDistance() {
        return this.distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Ville getDestination() {
        return this.Destination;
    }

    public void setDestination(Ville Destination) {
        this.Destination = Destination;
    }



}
