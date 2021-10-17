package SortingAlgorithm;
import java.util.*;

// Time Complexity: O(n^2)
// Adaptive Algorithm: if array is already sorted and the algo takes less time than usual then it is an adaptive algorithm.Yes, This Algo is Adaptive.
// Stable Algorithm: if in array after sorting the order of same elements remain same.
// i.e After sorting, the first occurred same elt is before the elt occurred later whose value is same as first.Yes, This Algo is Stable.

public class BubbleSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        arr = bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] bubbleSort(int[] arr){

        int flag = 0;  //to make bubble sort adaptive

        //n-1 pass
        for(int i = arr.length - 1; i > 0; i--) {
            for(int j = 0; j <= i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp;
                    flag = 1;
                    //if swap occur even once flag is set to 1 means array is already not sorted and if
                    //array is already sorted it will not swap even once i.e flag remains 0 after first pass
                }
            }
            if(flag == 0) //if 0 i.e. already sorted we break the loop and make the algo adaptive by reducing its time complexity to O(n).
                break;
        }
        return arr;
    }

}
