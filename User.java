import java.util.ArrayList;
import java.util.ArrayList;
public class User {
    private String firstName;
    private String lastName;
    private String cardNumber;
    private byte pinHash[];
    private ArrayList <Account> accounts;
    public User(String firstName,String lastName,String pin, Bank theBank)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        pinHash=pin;
    }
}
