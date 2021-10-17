package Recursion;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        System.out.println(getPermutation("abc"));
        printPermutation("abc", "");
    }

    public static ArrayList<String> getPermutation(String str) {
        if(str.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        char ch = str.charAt(0);
        String substr = str.substring(1);
        ArrayList<String> rr = getPermutation(substr);
        ArrayList<String> mr = new ArrayList<>();
        for (String s : rr) {
            for (int j = 0; j <= s.length(); j++) {
                mr.add(s.substring(0, j) + ch + s.substring(j));
            }
        }
        return mr;
    }

    public static void printPermutation(String str, String res) {
        if(str.length() == 0) {
            System.out.println(res);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            printPermutation(str.substring(0, i) + str.substring(i + 1), res + str.charAt(i));
        }

    }

}
