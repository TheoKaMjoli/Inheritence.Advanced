package DemonstratingConstructor;
//child class of party
public class DinnerPartyWithConstructor extends PartyWithConstructor2 {
     private int dinnerChoice; //addition to this type of party

    public DinnerPartyWithConstructor(int numGuests) {
        super(numGuests);
    }

    public int getDinnerChoice() {
        return dinnerChoice;
    }

    public void setDinnerChoice(int dinnerChoice) {
        this.dinnerChoice = dinnerChoice;
    }
    @Override
    public void displayInvitation(){
        System.out.println("Thank you for being a part of my Dinner Party");
    }
}
