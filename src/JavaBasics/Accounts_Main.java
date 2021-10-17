package JavaBasics;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Accounts_Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                ------Menu------
                0.Exit.
                1.Create your Account.
                2.Display your Account Balance.
                3.Withdraw Money
                4.Deposit Money""");

//        ArrayList<SavingsAccount> accounts = new ArrayList<>(100);
        SavingsAccount[] accounts = new SavingsAccount[100];
        int base = 156354;

        int c;

        do {

            System.out.println("Enter your Choice: ");
            c = sc.nextInt();

            switch (c)
            {

                case 1 -> {
                    try{
                        System.out.println("Enter the name: ");
                        if(sc.hasNextInt()) {
                            sc.next();
                            throw new Exception("Name must be a string. ");
                        }
                        String name = sc.next();

                        System.out.println("Enter the Address: ");
                        if(sc.hasNextInt()) {
                            sc.next();
                            throw new Exception("Address must be a string. ");
                        }
                        String address = sc.next();

                        System.out.println("Enter the Initial amount: ");
                        if(!sc.hasNextInt())
                        {
                            sc.next();
                            throw new Exception("Amount must be a numeric.");
                        }
                        float balance = sc.nextFloat();

                        SavingsAccount one = new SavingsAccount(balance, name, address);
                        accounts[one.accountNumber - base] = one;

                        System.out.println("Account is created Successfully.");
                        System.out.println(one);
                    }
                    catch(Exception e) {

                        System.out.println(e.getMessage());
                    }

                }

                case 2 -> {

                    try {
                        System.out.println("Enter the Account no.: ");
                        if(!sc.hasNextInt()) {
                            sc.next();
                            throw new Exception("Account no. must be numeric.");
                        }
                        int acc = sc.nextInt();

                        int index = acc - base;

                        if (index >= 0 && index < 100 && accounts[index].accountNumber == acc) {

                            float bal = accounts[index].display(acc);
                            System.out.println("Your balance is: " + bal);
                        }
                        else {

                            System.out.println("Your account does not exist");
                        }
                    }
                    catch(Exception e) {
                        System.out.println(e.getMessage());
                    }
                }

                case 3 -> {

                    try {
                        System.out.println("Enter the Account no.: ");
                        if(!sc.hasNextInt()) {
                            sc.next();
                            throw new Exception("Account no. must be numeric.");
                        }
                        int acc = sc.nextInt();

                        int index = acc - base;

                        if (index >= 0 && index < 100 && acc == accounts[index].accountNumber) {

                            System.out.println("Enter Withdrawal amount: ");
                            float amt = sc.nextFloat();

                            accounts[index].withDrawl(acc, amt);
                        }
                        else {

                            System.out.println("Your account does not exist");
                        }
                    }
                    catch(Exception e) {
                        System.out.println(e.getMessage());
                    }
                }

                case 4 -> {
                    try {
                        System.out.println("Enter the Account no.: ");
                        if(!sc.hasNextInt()) {
                            sc.next();
                            throw new Exception("Account no. must be numeric.");
                        }
                        int acc = sc.nextInt();

                        int index = acc - base;

                        if (index >= 0 && index < 100 && acc == accounts[index].accountNumber) {

                            System.out.println("Enter Deposit amount: ");
                            float amt = sc.nextFloat();

                            accounts[index].deposit(acc, amt);

                            System.out.println("Money Deposited.");
                        }
                        else {

                            System.out.println("Your account does not exist");
                        }
                    }
                    catch(Exception e) {
                        System.out.println(e.getMessage());
                    }
                }

            }

        }while(c != 0);

    }
}
