package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3;
        toh(n, "src", "dest", "helper");
        System.out.println(toHSteps(n));
    }

    public static void toh(int n, String src, String dest, String helper) {
        if(n == 0) return;
        toh(n - 1, src, helper, dest);
        System.out.println("Move " + n + "th disc from " + src + " to " + dest + " tower.");
        toh(n - 1, helper, dest, src);
    }

    public static int toHSteps(int n) {
        if(n == 0) return 0;

        return 2 * toHSteps(n - 1) + 1;
    }

}
