class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans = 0;
        for(int i = 0; i < words.length; i++){
            String s  = words[i];
            boolean flag = true;
            for(int j = 0; j < s.length(); j++){
                String st = Character.toString(s.charAt(j));
                if(allowed.contains(st) == false){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                ans++;
            }
            
        }
        return ans;
    }
}

//https://leetcode.com/problems/count-the-number-of-consistent-strings/
