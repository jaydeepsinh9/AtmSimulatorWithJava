import java.util.ArrayList;
public class Account {
    private String name;
    private double balance;
    private User holder;
    private ArrayList<Transaction> transactions;
    public Account(String name, double balance,User holder)
    {
        this.name=name;
        this.balance=balance;
        this.holder=holder;
    }
}
