package AdvancedInheritenceConcept;

public abstract class Vehicle {
    private String powerSource;
    private int wheels;
    protected int price;

    public Vehicle(String powerSource, int wheels) {
        setPowerSource(powerSource);
        setWheels(wheels);
        setPrice();
    }
        //Getter methods
    public String getPowerSource() {
        return powerSource;
    }

    public int getWheels() {
        return wheels;
    }

    public int getPrice() {
        return price;
    }
    //Setter methods


    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    //Abstract method is left empty so that it can be overridden by subclasses
    public abstract void setPrice();


}