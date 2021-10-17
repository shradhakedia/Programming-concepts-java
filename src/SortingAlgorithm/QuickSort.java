package SortingAlgorithm;

import java.util.*;

// Time Complexity: best case -> O(n.log(n)), worst case -> O(n^2)
// Adaptive Algorithm: if array is already sorted and the algo takes less time than usual then it is an adaptive algorithm.Yes, This Algo is Adaptive.
// Stable Algorithm: if in array after sorting the order of same elements remain same.
// i.e After sorting, the first occurred same elt is before the elt occurred later whose value is same as first.Yes, This Algo is Stable.


public class QuickSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] input = new int[n];

        for (int i = 0; i < n; i++)
            input[i] = sc.nextInt();

        quickSort(input, 0, n-1);
        System.out.println(Arrays.toString(input));
    }

    public static int partition(int[] arr, int p, int r) {
        int x = arr[r];
        int i = p - 1;
        for(int j = p; j < r; j++){
            if(arr[j] <= x){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[r];
        arr[r] = temp;
        return i + 1;
    }

    public static void quickSort(int[] arr, int low, int high) {

         if(low < high) {
             int q = partition(arr, low, high);
             quickSort(arr, low, q - 1);
             quickSort(arr, q + 1, high);
         }
    }
}
