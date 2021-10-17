package Pattern_Practice;

import java.util.Scanner;
/*
 * * * * * * *
   * * * * *
     * * *
       *
 */
public class Pattern3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 2 * n - 1;
        int nsp = 0;
        int counter = 1;
        while(counter <= n) {
            int csp = 0;
            int cst = 1;
            while (csp < nsp) {
                System.out.print("  ");
                csp++;
            }
            while(cst <= nst) {
                System.out.print("* ");
                cst++;
            }
            System.out.println();
            nsp++;
            nst -= 2;
            counter++;
        }
    }
}
