package JavaBasics;

public abstract class Accounts
{

    float balance;
    int accountNumber;
    String name;
    String address;

    public abstract void withDrawl(int acc, float amt);
    public abstract void deposit(int acc, float amt);

    public float display(int acc)
    {

        return balance;
    }

}
