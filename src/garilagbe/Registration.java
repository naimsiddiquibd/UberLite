
package garilagbe;
import java.util.Scanner;

public class Registration {
    private String Name;
    private String PhoneNo;
    private String Gender;
    private String Address;
    private String TypeOfUser;
    private String Password;
 Scanner input = new Scanner(System.in);
 public void Registration(){
     System.out.println("For completing registration fill up the form.");
     System.out.println("Enter Your name: ");
     Name = input.nextLine();
     System.out.println("Enter Your Phone Number: ");
     PhoneNo = input.nextLine();
     System.out.println("Enter Your Gender: ");
     Gender = input.nextLine();
     System.out.println("Enter Your Address: ");
     Address = input.nextLine();
     System.out.println("Enter Your User Types: ");
     TypeOfUser = input.nextLine();
     System.out.println("Enter Your Password: ");
     Password = input.nextLine();
 }
 public void Login(){
     System.out.println("To login input your name and password.");
     System.out.println("Enter Your name: ");
     Name = input.nextLine();
     System.out.println("Enter Your Password: ");
     Password = input.nextLine();
 }       
      
}
