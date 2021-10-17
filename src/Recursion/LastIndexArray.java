package Recursion;

public class LastIndexArray {
    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 8, 8, 7};
        int last = lastIndex(arr, 0, 8);
        System.out.println(last);
    }

    public static int lastIndex(int[] arr, int si, int data) {
        if (si == arr.length) return -1;
        int index = lastIndex(arr, si + 1, data);
        if (index == -1) {
            if (arr[si] == data) return si;
        }
        return index;
    }
}
