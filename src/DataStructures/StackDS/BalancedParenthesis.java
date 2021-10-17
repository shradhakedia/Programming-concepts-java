package DataStructures.StackDS;

import java.util.Scanner;

public class BalancedParenthesis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(checkParenthesis(s));
    }

    public static boolean checkParenthesis(String s) {

        StaticStack<Character> stack = new DynamicStack<>();

        for(char c : s.toCharArray()) {

            if("({[".contains(c + "")) {
                stack.push(c);
            }
            else if(")}]".contains(c + "")) {
                if (stack.isEmpty()) {
                    return false;
                }
                else if (c == ')') {
                    if (stack.peek() == '(') stack.pop();
                    else return false;
                }
                else if (c == '}') {
                    if (stack.peek() == '{') stack.pop();
                    else return false;
                }
                else if (c == ']') {
                    if (stack.peek() == '[') stack.pop();
                    else return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
