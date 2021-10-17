package SortingAlgorithm;

import java.util.*;

// Time Complexity: O(n^2)
// Adaptive Algorithm: if array is already sorted and the algo takes less time than usual then it is an adaptive algorithm.No, This Algo is not Adaptive.
// Stable Algorithm: if in array after sorting the order of same elements remain same,
// i.e After sorting, the first occurred same elt is before the elt occurred later whose value is same as first.No, This Algo is not Stable.
public class SelectionSorting {
    static int[] selectionSorting(int[] arr){
        int temp,indexOfMin;

        //for all passes
        for(int i=0;i<arr.length-1;i++) {
            indexOfMin=i;
            //for each pass
            for (int j = i; j < arr.length; j++) {
                if (arr[j]<arr[indexOfMin]) {
                    indexOfMin = j;
                }
            }

            //swap min with element at index i
            temp=arr[i];
            arr[i]=arr[indexOfMin];
            arr[indexOfMin]=temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        arr = selectionSorting(arr);
        System.out.println(Arrays.toString(arr));
    }
}
