class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length-1];

        for(int i = 0 ; i < first.length(); i++){
            if(first.charAt(i) != last.charAt(i)){
                break;
            }
            sb.append(first.charAt(i));
        }

        return sb.toString();
    }
}

//https://leetcode.com/problems/longest-common-prefix/description/
