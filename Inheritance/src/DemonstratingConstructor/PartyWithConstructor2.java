package DemonstratingConstructor;

public class PartyWithConstructor2 {
    //number of guests expected at the party
    private int guests;

    public int getGuests() {
        return guests;
    }

    public void setGuests(int numGuests) {
         guests = numGuests;
    }

    //method to display a party invitation.
    public void displayInvitation(){
        System.out.println("Thank you for being a part of this event");
    }

    public PartyWithConstructor2(int numGuests){
        guests = numGuests;
    }

}
