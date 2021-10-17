package Recursion;

import java.util.ArrayList;

public class MazePath {
    public static void main(String[] args) {
        System.out.println(getMazePath(0,0, 2, 2));
        System.out.println(getMazePathDiag(0,0, 2, 2));
        printMazePath(0,0, 2, 2, "");
        System.out.println(countMazePath(0, 0, 2, 2));
    }

    /////////////////////////////////////////////

    public static ArrayList<String> getMazePath(int startx, int starty, int gridx, int gridy) {

        if(startx == gridx && starty == gridy) {
            ArrayList<String > base = new ArrayList<>();
            base.add("");
            return base;
        }
        if(startx > gridx || starty > gridy) {
            return new ArrayList<>();
        }
        ArrayList<String> mr = new ArrayList<>();

        ArrayList<String> rrV = getMazePath(startx + 1, starty, gridx, gridy );
        for(String s : rrV) {
            mr.add("V" + s);
        }
        ArrayList<String> rrH  = getMazePath(startx, starty + 1, gridx, gridy );
        for(String s : rrH) {
            mr.add("H" + s);
        }
        return mr;
    }

    //////////////////////////////////////

    public static void printMazePath(int startx, int starty, int gridx, int gridy, String ans) {

        if(startx == gridx && starty == gridy) {
            System.out.println(ans);
            return;
        }
        if(startx > gridx || starty > gridy) {
            return;
        }
        printMazePath(startx, starty + 1, gridx, gridy, ans + "H");
        printMazePath(startx + 1, starty, gridx, gridy , ans + "V");
    }

    //////////////////////////////////////

    public static int countMazePath(int startx, int starty, int gridx, int gridy) {

        if(startx == gridx && starty == gridy) {
            return 1;
        }
        if(startx > gridx || starty > gridy) {
            return 0;
        }
        int countH = countMazePath(startx, starty + 1, gridx, gridy);
        int countV = countMazePath(startx + 1, starty, gridx, gridy);

        return countH + countV;
    }

    //////////////////////////////////////

    public static ArrayList<String> getMazePathDiag(int startx, int starty, int gridx, int gridy) {

        if(startx == gridx && starty == gridy) {
            ArrayList<String > base = new ArrayList<>();
            base.add("");
            return base;
        }
        if(startx > gridx || starty > gridy) {
            return new ArrayList<>();
        }
        ArrayList<String> mr = new ArrayList<>();

        ArrayList<String> rrV = getMazePathDiag(startx + 1, starty, gridx, gridy );
        for(String s : rrV) {
            mr.add("V" + s);
        }
        ArrayList<String> rrH  = getMazePathDiag(startx, starty + 1, gridx, gridy );
        for(String s : rrH) {
            mr.add("H" + s);
        }
        ArrayList<String> rrD  = getMazePathDiag(startx + 1, starty + 1, gridx, gridy );
        for(String s : rrD) {
            mr.add("D" + s);
        }
        return mr;
    }
}
