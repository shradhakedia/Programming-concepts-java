package SortingAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class CountSort {
    static int maximum(int[] arr){
        int max=arr[0];
        for(int i=1;i< arr.length;i++){
            if(max<arr[i])
                max=arr[i];
        }
        return max;
    }
    static void countSort(int[] arr){
        int max = maximum(arr); //getting the max from the arr and creating countArray of size max+1
        int[] countArray=new int[max+1];

        //fill the array with 0
        Arrays.fill(countArray,0);

        // Increment the corresponding index in the count array
        for (int j : arr) {
            countArray[j] += 1;
        }

        //for eg. count array= [0, 2, 1, 0, 0, 1] where actual unsorted array was [5, 1, 2, 1]
        // from count array we will sort the array 'arr' now by initializing it by index 'i' of count array as many times as countArray[i] is there
        // 1 1 2 5
        int index=0;
        for(int i=0;i<=max;i++) {
            while (countArray[i] > 0) {
                arr[index] = i;
                index++;
                countArray[i]--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++)
            arr[i]= sc.nextInt();
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
