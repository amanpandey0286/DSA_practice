class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxnum = 0;
        for(int i = 0; i < candies.length; i++){
            maxnum  = Math.max(maxnum, candies[i]);
        }

        ArrayList<Boolean> res = new ArrayList<>();
        for(int i =0;i < candies.length; i++){
            if((candies[i] + extraCandies) >= maxnum){
                res.add(true);
            }else{
                res.add(false); 
            }
        }
        return res;
    }
}

//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
