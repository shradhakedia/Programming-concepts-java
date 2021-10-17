package Recursion;

import java.util.ArrayList;
import java.util.HashMap;

public class fibonacci {

    private static final ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        int n = fib(7);
        System.out.println(n);
    }

    public static int fib(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }
}
