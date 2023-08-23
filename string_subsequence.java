class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i = 0, j = 0;
        while(i < str1.length() && j < str2.length()){
            int s1 = str1.charAt(i) - 'a';
            int s2 = str2.charAt(j) - 'a';

            if(s1 == s2 || s2 == (s1+1)%26){
                j++;
            }
            i++;
        }
        return j == str2.length();
    }
}


//https://leetcode.com/problems/make-string-a-subsequence-using-cyclic-increments/description/
