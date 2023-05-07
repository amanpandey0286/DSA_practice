//Slinding window or Two pointer approach.

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int a  = 0;
        int b  = 0;
        int maxm = 0;
 
        HashSet<Character> new_substring = new HashSet<>();
        while(b < s.length()){
            if(!new_substring.contains(s.charAt(b))){
                new_substring.add(s.charAt(b));
                b++;
                maxm = Math.max(maxm, new_substring.size());
            }else{
                new_substring.remove(s.charAt(a));
                a++;
            }
        }
        return maxm;
    }
}

//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
