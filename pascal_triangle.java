class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> mainList = new ArrayList<>();
        List<Integer> firstList = new ArrayList<>();
        firstList.add(1);
        mainList.add(firstList);
        
        if(numRows  == 1) return mainList;

        for(int i = 1; i < numRows; i++){
            List<Integer> prevList = mainList.get(i -1);
            List<Integer> curList = new ArrayList<>();
            curList.add(1);
            for(int j  = 0; j < i-1; j++ ){
                curList.add(prevList.get(j)+prevList.get(j+1));
            }
            curList.add(1);
            mainList.add(curList);
        }

        return mainList;
    }
}

//https://leetcode.com/problems/pascals-triangle/
