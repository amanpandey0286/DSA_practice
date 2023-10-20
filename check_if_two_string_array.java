class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String w1 =  "";
        String w2 = "";
        for(int i  = 0; i < word1.length; i++){
            w1 += word1[i];
        }
        for(int i = 0; i < word2.length; i++){
            w2 += word2[i];
        }

        System.out.println(w1);
        System.out.println(w2);
        boolean ans ;
        if(w1.equals(w2)){
            ans = true;
        }else{
            ans = false;
        }

        return ans;
        
    }
}

//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
