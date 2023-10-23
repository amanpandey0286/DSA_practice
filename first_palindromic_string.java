class Solution {
    public String firstPalindrome(String[] words) {
        String ans = ""; 
        for(int i = 0; i < words.length; i++){
            String s = words[i];
            boolean flag = false;
            for(int j = 0; j < (s.length()/2); j++){
                if(s.charAt(j) != s.charAt((s.length() - j-1))){
                    flag = true;
                    break;
                    
                }
            }
            if(flag == false){
                ans = s;
                break;
            }
        }
        return ans;
    }
}

//https://leetcode.com/problems/find-first-palindromic-string-in-the-array/
