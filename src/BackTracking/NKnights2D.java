package BackTracking;

public class NKnights2D {
    public static void main(String[] args) {
        knightCombinationBoxRespect2DKill(new boolean[3][3],0, 0, 0, 3, "");
    }

    public static void knightCombinationBoxRespect2DKill(boolean[][] board, int row, int col, int kpsf, int tk, String ans) {
        //positive base case
        if(kpsf == tk) {
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
            knightCombinationBoxRespect2DKill(board, row, col + 1, kpsf + 1, tk, ans + "(" + row + "-" + col + ") ");
            board[row][col] = false; //undo
        }
        //not place
        knightCombinationBoxRespect2DKill(board, row, col + 1, kpsf, tk, ans);
    }

    public static boolean isItSafe(boolean[][] board, int row, int col) {
        int[] rowArray = {-1, -2, -2, -1};
        int[] colArray = {2, 1, -1, -2};
        for (int i = 0; i < 4; i++) {
            int r = row + rowArray[i];
            int c = col + colArray[i];
            if(r >= 0 && r < board.length && c >= 0 && c < board[0].length) {
                if (board[r][c]) return false;
            }
        }
        return true;
    }
}
