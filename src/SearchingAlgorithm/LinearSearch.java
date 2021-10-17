package SearchingAlgorithm;

public class LinearSearch {

    static int linearSearch(int[] arr,int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static void main (String[]args) {
        int[] arr = {0, 0, 1, 1, 1, 1, 1};
        int element = 1;
        int pos = linearSearch(arr, element);
        System.out.println("Position via linear search: " + pos);
    }
}
