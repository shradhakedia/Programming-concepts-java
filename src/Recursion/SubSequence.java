package Recursion;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        System.out.println(getSS("ab"));
        printSS("ab", "");
    }

    public static ArrayList<String> getSS(String str) {
        if(str.length() == 0) {
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }

        char ch = str.charAt(0);
        //String ascii = String.valueOf((int) ch);
        String substr = str.substring(1);
        ArrayList<String> recResult = getSS(substr);
        ArrayList<String> myResult = new ArrayList<>();
        for (String s : recResult) {
            myResult.add(s);
            myResult.add(ch + s);
            //myResult.add(ascii + s);
        }
        return myResult;
    }

    public static void printSS(String str, String result) {
        if(str.length() == 0) {
            System.out.println(result);
            return;
        }
        char ch = str.charAt(0);
        //String ascii = String.valueOf((int) ch);
        String substr = str.substring(1);
        printSS(substr, result);
        printSS(substr, result + ch);
        //printSS(substr, result + ascii);
        }

}
