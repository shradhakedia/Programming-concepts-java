package SortingAlgorithm;

import java.util.*;


//Time complexity: O(n.log(n))

/**The root idea of merge sort is merging two sorted arrays.Here, we are given a single array and
 * firstly we break it into smaller arrays(till a single element) now this single element array is sorted so, we merge it to get a two elements sorted array
 * and continue merging till we get our final sorted array.
 */

//                                          MS(arr,0,4)
//                                          /        \
//                                    MS(0,2)         MS(3,4)
//                                   /       \          /     \
//                              MS(0,1)       MS(2,2)  MS(3,3) MS(4,4)
//                             /     \
//                         MS(0,0)  MS(1,1)
//    now we begin merging from below and go to the top of the tree while getting a final sorted array.

public class MergeSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++)
            input[i] = sc.nextInt();
        System.out.println(Arrays.toString(mergeSort(input, 0, input.length - 1)));
    }

    static int[] mergeSort(int[] array, int low, int high){
        if(low == high) {
            int[] base = new int[1];
            base[0] = array[low];
            return base;
        }
        int mid =(low + high) /  2;

        int[] fh = mergeSort(array, low, mid);
        int[] sh = mergeSort(array, mid + 1, high);

        return mergeTwoSortedArrays(fh, sh);
    }

    static int[] mergeTwoSortedArrays(int[] array1, int[] array2) {
        int i = 0, j = 0 , k = 0;
        int[] merged = new int[array1.length + array2.length];

        while(i < array1.length && j < array2.length) {
            if(array1[i] <= array2[j]) {
                merged[k] = array1[i];
                i++;
            }
            else{
                merged[k] = array2[j];
                j++;
            }
            k++;
        }

        if(i == array1.length) {
            while(j < array2.length){
                merged[k]=array2[j];
                j++;
                k++;
            }
        }
        if(j == array2.length) {
            while (i < array1.length) {
                merged[k] = array1[i];
                i++;
                k++;
            }
        }
        return merged;
    }
}
