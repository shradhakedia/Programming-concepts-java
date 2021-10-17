package Extra;

import java.util.Scanner;
/*
here, we are going to find the length of longest common substring when given two strings of length m,n
time complexity: O(m*n)
space complexity: O(m*n)
we will make a table for the strings, i.e. let one string be weeks and other be geeks then
the longest common substring is eeks of length 4.
table:       g e e k s
           0 0 0 0 0 0
        w  0 0 0 0 0 0
        e  0 0 1 1 0 0
        e  0 0 1 2 0 0
        k  0 0 0 0 3 0
        s  0 0 0 0 0 4
     so, here what we do is create a table of row length = first word length + 1 here(6) and
     column length = second word length + 1 here(6)
     Now, we start with index (1,1) of table and match if "w" is in "g" since not we fill 0. Now, we check "w" in "ge"
     and so on, "w" in "gee" then in "geek and then in "geeks" now we go to next row (2,1) and check if "we" in "g" the "we" in "ge"
     and so on, and we do this by DP, how we achieved it? the answer is we check the character in a row with each element in column
     and if we get a match the we need to check its previous string which is stored in previous diagonal element and hence we add
     that previous integer in previous diagonal to current cell by one. We continue doing it till we reach the last cell.
     Example: when we check "k" , we match it by "g" no match so filled cell by 0 then checked "k" with "e" again filled 0
     again by "e" and 0, now "k" checked with "k" got a match so we will see if before "k" in weeks there was any match with geeks
     and that is done in previous diagonal element, "gee" in "wee" so we add 2 to 1 and get 3. whole process goes this way with two
     nested loops. giving the O(m*n).

 */
public class LongestCommonSubstring {
    public int LCS(String first,String second){
        int maxLength=0;
        int[][] LCS_table=new int[first.length()+1][second.length()+1];
        for(int i=1;i<=first.length();i++){
            for(int j=1;j<=second.length();j++){
                if(first.charAt(i-1)==second.charAt(j-1)){
                    LCS_table[i][j]=LCS_table[i-1][j-1]+1;
                    maxLength=Integer.max(maxLength,LCS_table[i][j]);
                }
            }
        }
        return maxLength;
    }
    /**
     * Recursive way of calculating lcs
     */
    public int longestCommonSubstringRec(char[] str1, char[] str2, int pos1, int pos2, boolean checkEqual){
        if(pos1 == -1 || pos2 == -1){
            return 0;
        }
        if(checkEqual){
            if(str1[pos1] == str2[pos2]){
                return 1 + longestCommonSubstringRec(str1, str2, pos1-1, pos2-1, true);
            }else{
                return 0;
            }
        }
        int r1 = 0;
        if(str1[pos1] == str2[pos2]){
            r1 = 1 + longestCommonSubstringRec(str1, str2, pos1-1, pos2-1, true);
        }
        return Math.max(r1,Math.max(longestCommonSubstringRec(str1, str2, pos1-1, pos2, false), longestCommonSubstringRec(str1, str2, pos1, pos2-1,false)));
    }

    public static void main(String[] args) {
        LongestCommonSubstring lcs=new LongestCommonSubstring();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1: ");
        String first=sc.nextLine();
        System.out.println("Enter string 2: ");
        String second=sc.nextLine();
        System.out.println("The length of longest common Substring is: "+ lcs.LCS(first,second));
        char[] str1 = "abide".toCharArray();
        char[] str2 = "def".toCharArray();
        System.out.println(lcs.longestCommonSubstringRec(str1, str2,str1.length-1, str2.length-1,false));
    }
}
