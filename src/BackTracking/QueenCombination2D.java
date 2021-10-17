package BackTracking;

import java.util.Queue;

public class QueenCombination2D {
    public static int count = 0;

    public static void main(String[] args) {
       // queenCombinationBoxRespect2DKill(new boolean[3][4], 0, 0, 0, 3, "");
        NQueens2CombinationQueenRespectKill(new boolean[4][4], 0, 0, 3, "");
    }


    public static void queenCombinationBoxRespect2D(boolean[][] boxes, int row, int col, int qpsf, int tq, String ans) {
        //positive base case
        if(qpsf == tq) {
            System.out.println(ans + ",");
            return;
        }

        //manually variable changes
        if(col == boxes[row].length) {
            row = row + 1;
            col = 0;
            // queenCombinationBoxRespect2D(boxes, row + 1, 0, qpsf, tq, ans);
            // return;
        }

        //negative base case
        if(row == boxes.length) {
            return;
        }

        //place
        boxes[row][col] = true;
        queenCombinationBoxRespect2D(boxes, row, col + 1,  qpsf + 1, tq, ans + "(" + row + "-" + col + ") ");
        boxes[row][col] = false; //undo
        //not place
        queenCombinationBoxRespect2D(boxes, row, col + 1, qpsf, tq, ans);

    }

    public static void queenCombinationBoxRespect2DKill(boolean[][] board, int row, int col, int qpsf, int tq, String ans) {
        //positive base case
        if(qpsf == tq) {
            System.out.println(ans + ",");
            return;
        }

        //manually variable changes
        if(col == board[0].length) {
            row = row + 1;
            col = 0;
        }

        //negative base case
        if(row == board.length) {
            return;
        }

        //is it safe to place
        if(isItSafe(board,row, col)) {
            //place
            board[row][col] = true;
            // we are not using this -> queenCombinationBoxRespect2DKill(board, row, col + 1, qpsf + 1, tq, ans + "(" + row + "-" + col + ") ");
            // because we know one row can have only one queen in it, so we place next queen in another row thus row -> row + 1 and col will be 0
            queenCombinationBoxRespect2DKill(board, row + 1, 0, qpsf + 1, tq, ans + "(" + row + "-" + col + ") ");
            board[row][col] = false; //undo
        }
        //not place
        queenCombinationBoxRespect2DKill(board, row, col + 1, qpsf, tq, ans);
    }

    public static boolean isItSafe(boolean[][] board, int row, int col) {
        //vertically upward
        for (int i = 0; i < row; i++) {
            if(board[i][col]) return false;
        }
        //horizontal left
        for (int i = 0; i < col; i++) {
            if(board[row][i]) return false;
        }
        //diagonally left
        for (int i = row - 1, j = col - 1; (i >= 0 && j >= 0); i--, j--) {
            if(board[i][j]) return false;
        }
        //diagonally right
        for (int i = row - 1, j = col + 1; (i >= 0 && j < board[row].length); i--, j++) {
            if(board[i][j]) return false;
        }
        return true;
    }

    public static void NQueens2(boolean[][] board, int row, int qpsf, int tq, String ans) {
        //positive base case
        if(qpsf == tq) {
            count++;
            System.out.println(count + ". " + ans);
            return;
        }
        //negative base case
        if(row == board.length) {
            return;
        }

        for (int col = 0; col < board[0].length; col++) {
            board[row][col] = true;
            NQueens2(board, row + 1, qpsf + 1, tq, ans + "(" + row + col + ")");
            board[row][col] = false;
        }
    }

    public static void NQueens2CombinationQueenRespectKill(boolean[][] board, int row, int qpsf, int tq, String ans) {
        //positive base case
        if(qpsf == tq) {
            count++;
            System.out.println(count + ". " + ans);
            return;
        }
        //negative base case
        if(row == board.length) {
            return;
        }

        //options : columns
        for (int col = 0; col < board[0].length; col++) {
            if(isItSafe(board, row, col)) {
                board[row][col] = true;
                NQueens2CombinationQueenRespectKill(board, row + 1, qpsf + 1, tq, ans + "(" + row + col + ")");
                board[row][col] = false;
            }
        }
        //not place(works when queens to be placed are less than n) for queens = n the dont have the choice to be not placed each row will surely have a queen
        NQueens2CombinationQueenRespectKill(board, row + 1, qpsf, tq, ans);
    }
}
