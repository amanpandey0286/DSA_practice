class Solution {
    public int countSeniors(String[] details) {
        int count = 0; 
        for(int i = 0; i < details.length; i++){
            String s = details[i];
            int t = s.charAt(11) - '0';
            int o = s.charAt(12) - '0';
            int age = t*10 + o;
            if(age > 60){
                count++;
            }
        }
        return count;
    }
}

//https://leetcode.com/problems/number-of-senior-citizens/
