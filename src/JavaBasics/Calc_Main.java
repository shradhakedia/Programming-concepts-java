package JavaBasics;

import java.util.*;
public class Calc_Main {

    public static void main(String[] args)
    {
        Calc cal = new Calc();
        Scanner sc=new Scanner(System.in);

        System.out.println("""
                -----Calculator-----
                1.ADD
                2.SUBTRACT
                3.MULTIPLY
                4.DIVIDE""");
        int c;

        do{
            System.out.println("Enter your choice: ");
            c = sc.nextInt();

            switch(c){
                case 1-> {
                    try
                    {
                        System.out.print("Enter first number: ");

                        if(!sc.hasNextInt()) {
                            sc.next();
                            throw new Exception("Invalid Input, must be an Integer.");
                        }

                        int first = sc.nextInt();
                        System.out.print("Enter second number: ");

                        if(!sc.hasNextInt()) {
                            sc.next();
                            throw new Exception("Invalid Input, must be an Integer.");
                        }

                        int second = sc.nextInt();
                        System.out.println("The result is: " + cal.add(first, second));
                    }
                    catch (Exception e)
                    {
                        System.out.println(e.getMessage());
                    }
                }

                case 2-> {
                    try{
                        System.out.print("Enter first number: ");

                        if(!sc.hasNextInt()) {
                            sc.next();
                            throw new Exception("Invalid Input, must be an Integer.");
                        }

                        int first = sc.nextInt();
                        System.out.print("Enter second number: ");

                        if(!sc.hasNextInt()) {
                            sc.next();
                            throw new Exception("Invalid Input, must be an Integer.");
                        }

                        int second = sc.nextInt();
                        System.out.println("The result is: " + cal.subtract(first, second));
                    }
                    catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }

                case 3-> {
                    try {
                        System.out.print("Enter first number: ");

                        if(!sc.hasNextInt()) {
                            sc.next();
                            throw new Exception("Invalid Input, must be an Integer.");
                        }

                        int first = sc.nextInt();
                        System.out.print("Enter second number: ");

                        if(!sc.hasNextInt()) {
                            sc.next();
                            throw new Exception("Invalid Input, must be an Integer.");
                        }

                        int second = sc.nextInt();
                        System.out.println("The result is: " + cal.multiply(first, second));
                    }
                    catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }

                case 4-> {
                    try {
                        System.out.print("Enter Dividend: ");

                        if(!sc.hasNextInt()) {
                            sc.next();
                            throw new Exception("Invalid Input, must be an Integer.");
                        }

                        int first = sc.nextInt();
                        System.out.print("Enter Divisor: ");

                        if(!sc.hasNextInt()) {
                            sc.next();
                            throw new Exception("Invalid Input, must be an Integer.");
                        }

                        int second = sc.nextInt();

//                        if(second==0) {
//                            throw new Exception("Zero Division Error");
//                        }
                        System.out.println("The result is: " + cal.division(first, second));
                    }
                    catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }

                default -> {
                    System.out.println("Invalid Choice");
                }
            }
        } while(c!=0);
    }
}
