package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = {50, 40, 30, 20, 10};
        bubbleSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr, int si, int li) {
        if(li == 0) return;
        if(si == li) {
            bubbleSort(arr, 0, li - 1);
            return;
        }
        if(arr[si] > arr[si + 1]) {
            int temp = arr[si];
            arr[si] = arr[si + 1];
            arr[si + 1] = temp;
        }
        bubbleSort(arr, si + 1, li);

    }
}
