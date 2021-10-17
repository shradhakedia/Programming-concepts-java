package DataStructures.StackDS;

public class ReverseTheStack {

    public static void main(String[] args) {

        StaticStack<Integer> original = new DynamicStack<>();
        StaticStack<Integer> helper = new DynamicStack<>();

        for(int i = 1; i <= 6; i++) {
            original.push(i * 10);
        }

        System.out.println("Original: " + original);
        reverse(original, helper, 0);
        System.out.println("After Reversing: " + original);
    }

    public static void reverse(StaticStack<Integer> stack, StaticStack<Integer> result, int index) {

        if(stack.isEmpty()) {
            return;
        }

        int ele = stack.pop();
        reverse(stack, result, index + 1);
        result.push(ele);

        if(index == 0) {
            while (!result.isEmpty()) {
                int ele1 = result.pop();
                stack.push(ele1);
            }
        }
    }
}
