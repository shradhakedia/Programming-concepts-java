package Recursion;

public class Print_when_FunctionStackFallAndGrow {
    public static void main(String[] args) {
        PDI(5);
    }

    public static void PDI(int n) {
        if(n == 0) return;
        System.out.println(n);
        PDI(n - 1);
        System.out.println(n);
    }
}
