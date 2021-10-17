package SearchingAlgorithm;

public class LowerBound {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 3, 4, 4, 4, 5};
        System.out.println(lowerBound(arr, 4));
        System.out.println(lowerBound(arr, 3));
    }

    public static int lowerBound(int[] arr, int data) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(arr[mid] == data) {
                ans = mid;
                end = mid - 1;
            }
            else if(arr[mid] < data ) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
