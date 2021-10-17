package Recursion;

import java.util.Arrays;

public class AllIndices {
    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 8, 8, 4};
        int[] res = allIndices(arr, 0, 8, 0);
        System.out.println(Arrays.toString(res));
    }

    public static int[] allIndices(int[] arr, int si, int data, int count) {

        if(si == arr.length) return new int[count];
        int[] res = null;
        if(arr[si] == data) {
            res = allIndices(arr, si + 1, data, count + 1);
            res[count] = si;
        }
        else {
            res = allIndices(arr, si + 1, data, count);
        }
        return res;
    }
}
