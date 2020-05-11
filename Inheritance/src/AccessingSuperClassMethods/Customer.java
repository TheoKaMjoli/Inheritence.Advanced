package AccessingSuperClassMethods;

public class Customer {
    private int idNumber;
    private double balanceOwed;
    public  Customer(int idNumber, double balanceOwed) {
        this.idNumber = idNumber;
        this.balanceOwed = balanceOwed;
    }
    public void display(){
        System.out.println("Customer #" + idNumber + " Balance R" + balanceOwed);
    }
}
