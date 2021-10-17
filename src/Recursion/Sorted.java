package Recursion;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 8, 9};
        boolean val = isSorted(arr, 0);
        System.out.println(val);
    }

    public static boolean isSorted(int[] arr, int si) {
        if(si == arr.length - 1) return true;
        if(arr[si] < arr[si + 1]) return isSorted(arr, si + 1);
        return false;
    }
}
