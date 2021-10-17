package Recursion;

public class Factorial {
    public static void main(String[] args) {
        int ans = fact(0);
        System.out.println(ans);
    }

    public static int fact(int n) {
        if(n == 0) return 1;
        return n * fact(n - 1);
    }
}
