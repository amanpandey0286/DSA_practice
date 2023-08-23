class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if(words.size() != s.length()) return false;
        char[] ch = new char[words.size()];
        for(int i = 0; i < words.size(); i++){
            ch[i] = words.get(i).charAt(0);
        }
        for(int i = 0; i < ch.length; i++){
            if(ch[i] != s.charAt(i)) return false;
        }
        return true;
    }
}

//https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/description/
