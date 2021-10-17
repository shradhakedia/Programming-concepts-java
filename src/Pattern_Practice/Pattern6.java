package Pattern_Practice;

import java.util.Scanner;

/*
 * * * * *
     * * * *
         * * *
             * *
                 *
             * *
         * * *
     * * * *
 * * * * *
 */

public class Pattern6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nr = 2 * n - 1;
        int nst = n;
        int nsp = 0;
        int current = 1;
        while(current <= nr) {
            int csp = 0;
            int cst = 1;
            while(csp < nsp) {
                System.out.print("  ");
                csp++;
            }
            while(cst <= nst) {
                System.out.print("* ");
                cst++;
            }
            if(current < n) {
                nst--;
                nsp += 2;
            }
            else {
                nst++;
                nsp -= 2;
            }
            System.out.println();
            current++;
        }
    }
}
