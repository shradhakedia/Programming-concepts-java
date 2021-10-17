package Recursion;

import java.util.ArrayList;

public class BoardPath {
    public static void main(String[] args) {
        System.out.println(getBoardPath(0, 4));
        printBoardPath(0, 4, "");
        System.out.println(countBoardPath(0, 10));
    }

    public static ArrayList<String> getBoardPath(int curr, int end) {
        if (curr > end) {
            return new ArrayList<>();
        }
        if (curr == end) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> mr = new ArrayList<>();
        for (int dice = 1; dice <= 6; dice++) {
            ArrayList<String> rr = getBoardPath(curr + dice, end);
            for (String s : rr) {
                mr.add(dice + s);
            }
        }
        return mr;
    }

    public static void printBoardPath(int curr, int end, String ans) {
        if (curr > end) {
            return;
        }
        if (curr == end) {
            System.out.println(ans);
            return;
        }
        for (int dice = 1; dice <= 6; dice++) {
            printBoardPath(curr + dice, end, ans + dice);
        }
    }

    public static int countBoardPath(int curr, int end) {
        if (curr > end) {
            return 0;
        }
        if (curr == end) {
            return 1;
        }
        int count = 0;
        for (int dice = 1; dice <= 6; dice++) {
            count += countBoardPath(curr + dice, end);
        }
        return count;
    }
}


