package JavaBasics;

public class SavingsAccount extends Accounts
{

    private float rateOfInterest;
    private static int acn = 156354;

    public SavingsAccount(float _balance, String _name, String _address)
    {
        balance = _balance;
        accountNumber = acn;
        acn++;
        name = _name;
        address = _address;
    }


    @Override
    public void withDrawl(int acc, float amt)
    {

        if(amt < balance) {
            balance = balance - amt;
            System.out.println("Amount Withdrawn.");
        }
        else System.out.println("Insufficient Balance.");
    }

    @Override
    public void deposit(int acc, float amt)
    {
        if(amt <= 0) System.out.println("Enter a valid amount");
        else balance = balance + amt;
    }

    private float calculateAmount()
    {

        balance = balance + ((rateOfInterest / 100) * balance);
        return balance;
    }

    @Override
    public String toString() {

        return "-----Your Account Details-----\n" +
                "Account Number: " + accountNumber + "\n" +
                "Account holder's name: " + name + "\n" +
                "Account holder's balance: " + balance + "\n";
    }

}
