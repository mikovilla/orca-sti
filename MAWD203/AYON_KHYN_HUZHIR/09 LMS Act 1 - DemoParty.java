import java.util.Scanner;

//da class
public class DemoParty { 
public static void main(String[] args) { 
  Scanner Ayon = new Scanner(System.in);

//the instance
DinnerParty dinnerParty = new DinnerParty();

//the getter and da display user input ^-^
System.out.print("Enter the number of guests for the dinner party: ");
dinnerParty.setNumGuests(Ayon.nextInt());

System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

System.out.print("Enter the menu option (1 for chicken or 2 for beef): "); 
dinnerParty.setFoodChoice(Ayon.nextInt());

System.out.println();
System.out.println("==================AYON PARTY INFO=================");

System.out.println("The dinner party has " + dinnerParty.getNumGuests() + " guests."); 
System.out.println("Menu option " + dinnerParty.getFoodChoice() + " will be served."); 
System.out.println();
dinnerParty.showInvitation();

Ayon.close(); 
   }
} 
