package DataStructures.StackDS;

import java.util.Scanner;

public class NextGreaterElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");

        int[] array = new int[s.length];
        for(int i = 0; i < s.length; i++) {
            array[i] = Integer.parseInt(s[i]);
        }

        nextGreaterElement(array);

    }

    public static void nextGreaterElement(int[] array) {

        StaticStack<Integer> stack = new DynamicStack<>();

        for (int j : array) {

            while (!stack.isEmpty() && j > stack.peek()) {
                int ele = stack.pop();
                System.out.println(ele + " : " + j);
            }
            stack.push(j);
        }

        while (!stack.isEmpty()) {
            int ele = stack.pop();
            System.out.println(ele + " : " + -1);
        }
    }
}
