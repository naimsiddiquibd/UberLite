package garilagbe;
import java.util.Scanner;

public class Pessenger {
    private String Vehicles;
    public String Destination;
    private String PickupPlace;
    private double Distance;
    private double Cost;
    private int time;
    private double Amount;
    private String paymentType;
    Scanner get = new Scanner(System.in);
    String destination;

    public void SearchForVehicles(){
        System.out.println("Enter the type of vehicle: ");
        Vehicles = get.nextLine();
        System.out.println("Enter your pickup place: ");
        PickupPlace = get.nextLine();
        System.out.println("Enter your destination: ");
        Destination = get.nextLine();
    }
    public double CalculatingFare(){
        System.out.println("Enter types of vehicles: ");
        Vehicles = get.nextLine();
        System.out.println("Enter the distance in KM: ");
        Distance = get.nextDouble();
        if (Vehicles.equals("CNG"))
           Cost = Distance*20;
        else if (Vehicles.equals("Car"))
            Cost = Distance*50;
        else
            Cost = Distance*35;
        System.out.println("The total cost is: "+ Cost);
        return Cost;
    }
    public void CalculateFine(){
        System.out.println("Enter the delay time for traffic jam: ");
        time = get.nextInt();
        double finalCost = this.Cost + time*10;
        System.out.println("The final cost is: "+ finalCost);
        
    }
    public void Payment(){
        System.out.println("Enter the amount: ");
        Amount = get.nextDouble();
        System.out.println("Enter the paymet method: ");
        paymentType = get.nextLine();
        System.out.println("The payment is successfull.");
    }
    
}
