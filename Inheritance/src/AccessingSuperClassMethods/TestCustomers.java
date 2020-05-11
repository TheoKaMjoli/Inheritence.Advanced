package AccessingSuperClassMethods;

import com.sun.deploy.association.utility.AppAssociationReaderFactory;
import sun.plugin2.message.CustomSecurityManagerRequestMessage;

public class TestCustomers {
    public static void main(String[] args){
        Customer oneCust = new Customer(921111, 1500);
        PreferredCustomer firstCust = new PreferredCustomer(931111, 900, 0.15);
        //oneCust.display();
        firstCust.display();

    }
}
