package Pattern_Practice;

import java.util.Scanner;
/*
    * * * * *
        * * * *
            * * *
                * *
                    *
 */
public class Pattern1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 1;
        int nst = 5;
        int nsp = 0;
        while(counter <= n) {
            int cst = 1;
            int csp = 0;
            while(csp < nsp) {
                System.out.print("  ");
                csp++;
            }
            while(cst <= nst) {
                System.out.print("* ");
                cst++;
            }
            System.out.println();
            nsp += 2;
            nst--;
            counter++;
        }
    }
}
