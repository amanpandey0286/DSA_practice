class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> mainList = new ArrayList<>();
        
        for(int i = 0; i <= rowIndex; i++){
            List<Integer> currList = new ArrayList<>(i+1);
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    currList.add(1);
                }else{
                    int res = mainList.get(i-1).get(j) + mainList.get(i-1).get(j-1);
                    currList.add(res);
                }
            }
            mainList.add(currList);

        }
        return mainList.get(rowIndex );
    }
}

// https://leetcode.com/problems/pascals-triangle-ii/?envType=daily-question&envId=2023-10-16
