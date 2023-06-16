class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] ch1 = jewels.toCharArray();
        char[] ch2 = stones.toCharArray();
        int count = 0;
        for(int i = 0; i < ch2.length; i++){
            for(int j = 0; j < ch1.length; j++){
                if(ch2[i] == ch1[j]){
                    count++;
                }
            }
        }
        return count;
    }
}

//https://leetcode.com/problems/jewels-and-stones/description/
