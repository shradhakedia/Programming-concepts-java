package TimeComplexity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortArray0_1_2 {

    //Time complexity should be O(n)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of the array : ");
        int n = Integer.parseInt(br.readLine());
        int[] input = new int[n];
        for(int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(Arrays.toString(sort(input)));
    }

    public static int[] sort(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while(mid <= high) {
            if(arr[mid] == 0) {
                //swap elements at low and mid index, then increment low and mid
                swap(arr, low, mid);
                low++;
                mid++;
            }
            else if(arr[mid] == 2) {
                //swap elements at mid and high index, then decrement high only
                swap(arr, mid, high);
                high--;
            }
            else {
                //increment mid only
                mid++;
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

