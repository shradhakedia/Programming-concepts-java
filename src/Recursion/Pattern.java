package Recursion;

public class Pattern {
    public static void main(String[] args) {
        pattern(5, 0, 0);
    }

    public static void pattern(int n, int row, int col) {
        if(row == n) return;
        if(col <= row) {
            System.out.print("* ");
            pattern(n, row, col + 1);
            return;
        }
        System.out.println();
        pattern(n, row + 1, 0);

    }
}
