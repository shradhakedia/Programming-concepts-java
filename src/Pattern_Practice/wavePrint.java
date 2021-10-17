package Pattern_Practice;

public class wavePrint {
    public static void main(String[] args) {
        String[][] arr = new String[4][4];
        for(int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = (i + 1) + String.valueOf(j + 1);
//                System.out.print(arr[i][j] + " ");
            }
//            System.out.println();
        }
        printPattern(arr);
    }

    public static void printPattern(String[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            int k = arr.length - 1;
            for (int j = 0; j < arr[i].length; j++) {
                if(i % 2 == 0) {
                    System.out.print(arr[i][j] + ", ");
                }
                else {
                    System.out.print(arr[i][k--] + ", ");
                }
            }
        }
        System.out.println("End");
    }
}
