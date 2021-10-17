package BackTracking;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {

        //coinChangeCombination(new int[] {2, 3, 5, 6}, 10, "", 0);
        //coinChangePermutation(new int[] {2, 3, 5, 6}, 10, "");
        coinChangeCombinationCoinRespect(new int[] {2, 3, 5, 6}, 0,10, "");
    }

    public static void coinChangeCombination(int[] denomination, int amt, String ans, int lastDenominationIndex) {
        if(amt == 0) {
            System.out.println(ans);
            return;
        }
        //if(amt < 0) return;
        for (int i = lastDenominationIndex; i < denomination.length; i++) {
            if(amt >= denomination[i]) {
                coinChangeCombination(denomination, amt - denomination[i], ans + denomination[i], i);
            }
        }
    }

    public static void coinChangePermutation(int[] denomination, int amt, String ans) {
        if(amt == 0) {
            System.out.println(ans);
            return;
        }
        if(amt < 0) return;

        for(int i = 0; i < denomination.length; i++) {
            coinChangePermutation(denomination, amt - denomination[i], ans + denomination[i]);
        }
    }

    public static void coinChangeCombinationCoinRespect(int[] denomination, int vindex, int amt, String ans) {
        if(amt == 0) {
            System.out.println(ans);
            return;
        }
        if(amt < 0 || vindex == denomination.length) return;

        //yes, to contribute
        coinChangeCombinationCoinRespect(denomination, vindex, amt - denomination[vindex], ans + denomination[vindex]);
        //not to contribute
        coinChangeCombinationCoinRespect(denomination, vindex + 1, amt, ans);

    }
}
