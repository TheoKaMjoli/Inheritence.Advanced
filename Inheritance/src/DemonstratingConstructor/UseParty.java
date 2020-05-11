package DemonstratingConstructor;
import java.util.Scanner;
public class UseParty {
    public static void main(String[] args){
        //number of guests variable
        int dGuests;
        PartyWithConstructor2 aPartyWithConstructor = new PartyWithConstructor2(5); //instance of PartyWithConstructor2 class
        Scanner keyboard = new Scanner(System.in); //scanner class ?

        //System.out.print("Enter number of guests for the party >> ");
        //dGuests = keyboard.nextInt();  //assign the scanner method to guests
        //aPartyWithConstructor.setGuests(dGuests); //set the number of guests in the party object
        //System.out.println("The party has " + aPartyWithConstructor.getGuests() + "guests"); //display the value
        //display the party invitation
       // aPartyWithConstructor.displayInvitation();

        //*******************************************************************************************************

        //We have changed this section to use it to perform the dinner party interface
        DinnerPartyWithConstructor aDinnerParty = new DinnerPartyWithConstructor(15);
        int choice;

        System.out.print("Enter amount of guests for the Dinner party >> ");
        dGuests = keyboard.nextInt();
        aDinnerParty.setGuests(dGuests);

        //prompt the user for a dinner choice.
        System.out.print("Enter the menu option -- 1 for chicken or 2 for beef >> ");
        choice = keyboard.nextInt();
        aDinnerParty.setDinnerChoice(choice);

        System.out.println("The amount of guests are " + aDinnerParty.getGuests() + ", they are all welcomed.");
        System.out.println("The menu option " + aDinnerParty.getDinnerChoice() + " will be served tonight.");
      //  aPartyWithConstructor.displayInvitation();
        aDinnerParty.displayInvitation();





    }
}
