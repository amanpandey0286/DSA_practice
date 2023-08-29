// normal recursive solution

class Solution {

    public int lcs(String text1, String text2, int m, int n){
        if(m == 0 || n == 0) return 0;
        if(text1.charAt(m-1) == text2.charAt(n-1)){
            return 1 + lcs(text1, text2, m -1, n-1); 
        }else{
            return Math.max(lcs(text1, text2, m -1, n), lcs(text1, text2, m, n-1));
        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
    
        return lcs(text1, text2, m, n);
    }
}
