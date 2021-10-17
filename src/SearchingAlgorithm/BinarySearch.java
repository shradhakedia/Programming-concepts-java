package SearchingAlgorithm;

public class BinarySearch {

    public static int binarySearch(int[] arr, int element) {
        int low=0,high=arr.length-1;
        int mid = 0;

        while(low<=high){
            mid = (low+high)/2;
            if(arr[mid]==element){
                return mid;
            }
            else if(arr[mid]<element){
                low=mid+1;
            }
            else if(arr[mid]>element){
                high=mid-1;
            }
        }
        return -1;
    }

    public static void main (String[]args){
        int[] arr = {0, 0, 1, 1, 1, 1, 1};
        int element = 1;
        int pos1 = binarySearch(arr, element);
        System.out.println("Position via binary search: "+pos1);
    }
}
