package demoparty;
import java.util.Scanner;

public class DemoParty 
{
    public static void main(String[] args) 
    {
       Scanner scn = new Scanner(System.in);
       //Created scanner
       
       DinnerParty detail = new DinnerParty();
       //Created object on subclass
       
       System.out.print("Attendees: ");
       int guest = scn.nextInt();
       //Scan for guest from the user
       
       detail.setNumGuests(guest);
       //Assign guest to setNumGuest to superclass      
       
       System.out.print("""
                          Menu:
                          Chicken: 1
                          Beef: 2
                          """
                          );
       int choice = scn.nextInt();
       //Scan for food choice on the menu from the user
       
       
       detail.setFoodChoice(choice);      
       //Assign choice to setFoodChoice to subclass
       
       if(detail.getFoodChoice() == 1)
       {
           System.out.println("Menu 1, Chicken will be serve.");
       }
       else
       {
           if(detail.getFoodChoice() == 2)
           {
               System.out.println("Menu 2, Beef will be serve.");
           }
           else
           {
               System.out.println("Not available on the menu.");
           }
       }
       //If statement check the input if available on the menu using getter 
       
       System.out.println("Guests Total: " + detail.getNumGuests());
       //Print the total guest from earlier
             
       detail.showInvitation();
       //Print the overloaded invitation
       
       /*SAMPLE OUTPUT
        Attendees: 28
        Menu:
        Chicken: 1
        Beef: 2
        1
        Menu 1, Chicken will be serve.
        Guests Total: 28
        Please come to my dinner party!
       */
    } 
}
