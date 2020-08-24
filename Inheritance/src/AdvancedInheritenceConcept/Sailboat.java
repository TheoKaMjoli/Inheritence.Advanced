package AdvancedInheritenceConcept;

import javax.swing.*;

public class Sailboat extends Vehicle{
    private int length; 
    //calling the constructor of the abstract class
    public Sailboat(){
        super("wind", 0);
        setLength(); //the object was created before the code, as shown below
    }

    // setLength() method that prompts the user for and sets the length of the Sailboat objects:
    public void setLength() {
        String entry;
        entry = JOptionPane.showInputDialog(null, "Enter sailboat length in feet ");
        length = Integer.parseInt(entry);
    }
    public int getLength(){
        return length;
    }

    //Abstract methods must be Overridden by the concrete class.
    @Override
    public void setPrice() {
        String entry;
        final int MAX = 100000;
        //prompts the user for the price and forces it to the maximum value if the entered value is too high
        entry = JOptionPane.showInputDialog(null, "Enter sailboat price ");
        price = Integer.parseInt(entry);
        if(price > MAX) price = MAX;
    }
    @Override
    public String toString(){
        return("The " + getLength() + " foot sailboat is powered by " + getPowerSource() + "; it has " + getWheels() +
                " wheels and costs R" + getPrice());
    }
}
