// only recursive solution

class Solution {

    public int md(String word1, String word2 , int m , int n){
        if(m == 0) return n;
        if(n == 0) return m;
        if(word1.charAt(m-1) == word2.charAt(n-1)){
            return md(word1, word2 , m -1 , n-1); //if both matched we will come back 
        }else{
            return 1 + Math.min(Math.min(md(word1, word2, m , n -1), md(word1, word2, m -1, n )),  md(word1, word2, m -1, n-1 )); // we will take min of the all three operations.
        }
    }

    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        return md(word1, word2, m , n);
    }
}
