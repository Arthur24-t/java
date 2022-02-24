package robot;

public class testRobot {
    
public static void main(String[] args) {
    robot r1;
    r1= new robot(0, 0, "MR.Robot", 0);

    robot r2;
    r2= new robot(r1);

    robot r3;
    r3 = new robot();
r1.Etat();

r1.avancer(3);
r1.Etat();
r1.tournerDroit();
r1.Etat();
r2.Etat();
r3.Etat();


}







}
