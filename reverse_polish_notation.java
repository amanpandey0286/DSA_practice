class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(String x : tokens){
            if( "+".equals(x)){  //do not use == , instead use .equals()
                int a = s.pop();
                int b = s.pop();
                s.push(a + b);
            }
            else if( "*".equals(x)){
                int a = s.pop();
                int b = s.pop();
                s.push(a*b);
            }
            else if( "-".equals(x)){
                int a = s.pop();
                int b = s.pop();
                s.push(b-a);
            }
            else if( "/".equals(x)){
                int a = s.pop();
                int b = s.pop();
                s.push(b/a);
            }
            else{
                s.push(Integer.parseInt(x));
            }
        }
        return s.peek();
    }
}

//https://leetcode.com/problems/evaluate-reverse-polish-notation/description/
