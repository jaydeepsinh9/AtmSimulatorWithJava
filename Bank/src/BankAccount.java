
public class BankAccount {
   int balance;
   int previousTransaction;
   int tracker=0;
   String name;
   String customerID;
   
   public void deposite(int amount)
    {
    if(amount>0)
    {
        balance=balance+amount;
        previousTransaction=amount;
        tracker=1;
    }
    
    }
    public void withdraw(int amount)
    {
        if((amount<balance)&&(amount>0))
        {
            balance=balance-amount;
            previousTransaction=amount;
            tracker=2;
        }
        if(amount>balance)
        {
            System.out.println("You don't have sufficient balance.");
        }
    }
    public void getPreviousTransaction()
    {
        if(tracker==1)
        {
            System.out.println("You Deposited "+previousTransaction+"last time");
        }
        if(tracker==2)
        {
            System.out.println("You Withdran "+previousTransaction+"last time");
        }
    }
}
