
package garilagbe;

import java.io.InputStream;


public class Driver {
Pessenger P = new Pesssenger(System.in);
    public void checkDestination(){
 
        System.out.println("The destination is: "+ P.destination);
    }
    public void rideconfirmation(){
        System.out.println("The is Confirm.");
    }
    public void ridecencelation(){
        System.out.println("Sorry, the ride is canceled by the driver");
    }

    private static class Pesssenger extends Pessenger {

        public Pesssenger(InputStream in) {
        }
    }
}
