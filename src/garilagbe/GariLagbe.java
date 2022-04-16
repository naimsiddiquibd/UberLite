
package garilagbe;


public class GariLagbe {

   
    public static void main(String[]args) {
        
        Registration R = new Registration();
        Driver D = new Driver();
        Pessenger P = new Pessenger();
        R.Registration();
        R.Login();
        P.SearchForVehicles();
        String Vehicles = null;
        P.CalculatingFare(Vehicles);
        P.CalculateFine();
        P.Payment();
        D.checkDestination();
        D.rideconfirmation();
        D.ridecencelation();
        
       
    }
    
}
