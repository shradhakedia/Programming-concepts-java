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
public class Pattern7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nr = 2 * n - 1;
        int nsp = n - 1;
        int nst = n;
        int current = 1;
        while(current <= nr) {
            int csp = 1;
            int cst = 1;
            while(csp <= nsp) {
                System.out.print("  ");
                csp++;
            }
            while(cst <= nst) {
                System.out.print("* ");
                cst++;
            }
            if(current < n) {
                nsp--;
                nst--;
            }
            else {
                nst++;
                nsp++;
            }
            System.out.println();
            current++;
        }
    }
}
