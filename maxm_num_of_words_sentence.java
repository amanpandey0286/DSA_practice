class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxCount = 0;
        for(int i = 0; i < sentences.length; i++){
            String s = sentences[i];
            int count = 0;
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) == ' '){
                    count++;
                }
                
            }
            count++;
            maxCount = Math.max(maxCount , count);
        }

        return maxCount;
    }
}

//https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
