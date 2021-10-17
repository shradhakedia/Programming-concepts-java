package Pattern_Practice;

import java.util.Scanner;

/*
 *
 * *
 * * *
 * * * *
 * * *
 * *
 *
 */
public class Pattern5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nr = 2 * n - 1;
        int nst = 1;
        int current = 1;
        while(current <= nr) {
            int cst = 1;
            while(cst <= nst) {
                System.out.print("* ");
                cst++;
            }
            System.out.println();
            if(current < nr/2) nst += 1;
            else nst -= 1;
            current++;
        }
    }
}
