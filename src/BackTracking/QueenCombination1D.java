package BackTracking;

public class QueenCombination1D {
    public static int count = 0;

    public static void main(String[] args) {

        //queenCombination(new boolean[4], 0, 2, "", -1);
        queenCombinationBoxRespect(new boolean[4], 0, 0, 2, "");
    }

    public static void queenCombination(boolean[] boxes, int qpsf, int tq, String ans, int lastBoxUsed) {
        if (qpsf == tq) {
            count++;
            System.out.println(count + ". " + ans);
            return;
        }
        for (int i = lastBoxUsed + 1; i < boxes.length; i++) {
            boxes[i] = true;
            queenCombination(boxes, qpsf + 1, tq, ans + "b" + i + " ", i);
            boxes[i] = false; //undo the result
        }
    }

    public static void queenCombinationBoxRespect(boolean[] boxes, int col, int qpsf, int tq, String ans) {
        //positive base case
        if(qpsf == tq) {
            System.out.println(ans);
            return;
        }
        //negative base case
        if(col == boxes.length) {
            return;
        }

        //place
        boxes[col] = true;
        queenCombinationBoxRespect(boxes, col + 1,  qpsf + 1, tq, ans + "b" + col);
        boxes[col] = false; //undo
        //not place
        queenCombinationBoxRespect(boxes, col + 1, qpsf, tq, ans);

    }
}
