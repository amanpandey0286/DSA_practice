class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ls = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        int j = 0;
        for(int i = 1; i <= n; i++){
            s.push(i);
            ls.add("Push");
            if(s.peek() == target[target.length - 1]){
                break;
            }
            if(s.peek() != target[j]){
                s.pop();
                ls.add("Pop");
            }else{
                j++;
            }
        }
        return ls;
    }
}

//https://leetcode.com/problems/build-an-array-with-stack-operations/description/
