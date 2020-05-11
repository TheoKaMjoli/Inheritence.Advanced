package AccessingSuperClassMethods;

public class PreferredCustomer extends Customer {
    double discountRate;

    public PreferredCustomer(int idNumber, double balanceOwed, double discountRate) {
        super(idNumber, balanceOwed);
        this.discountRate = discountRate;
    }

    @Override
    public void display() {
        System.out.println("Discount rate is " + discountRate + ".");
    }
}
