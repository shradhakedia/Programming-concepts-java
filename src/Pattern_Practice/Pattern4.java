package Pattern_Practice;

import java.util.Scanner;
/*
         *
       * ! *
     * ! * ! *
   * ! * ! * ! *
 * ! * ! * ! * ! *
 */
public class Pattern4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n - 1;
        int nst = 1;
        int counter = 1;
        while(counter <= n) {
            int csp = 1;
            int cst = 1;
            while(csp <= nsp) {
                System.out.print("  ");
                csp++;
            }
            while(cst <= nst) {
                System.out.print("* ");
                if(cst < nst) {
                    System.out.print("! ");
                }
                cst++;
            }
            System.out.println();
            nsp--;
            nst++;
            counter++;
        }
    }
}
