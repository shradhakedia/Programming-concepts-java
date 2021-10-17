package TimeComplexity;

import java.util.Scanner;

// Time complexity to be order O(log n)
public class PowerOfANumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the the base number : ");
        int base = sc.nextInt();
        System.out.println("Enter the power : ");
        int power = sc.nextInt();

        int result = powerFunction(base, power);
        System.out.println(result);
    }

    public static int powerFunction(int base, int power) {
        if(power == 0) return 1;
        int result = powerFunction(base, power / 2);
        if((power & 1) == 1)  {
            return result * result * base;
        }
        else return result * result;
    }
}
