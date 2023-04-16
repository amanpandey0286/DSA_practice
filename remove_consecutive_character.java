class Solution{
    public String removeConsecutiveCharacter(String S){
        StringBuilder sb = new StringBuilder(S.length());
        for(int i = 0; i < S.length(); i++){
            //run till second last element.
            if((i<S.length()-1) && S.charAt(i) == S.charAt(i+1)){
                continue;
            }
            else{
             // for all other cases like for dissimial & last index value.
                sb.append(S.charAt(i));
            }
        }
        
        return sb.toString();
        
        
    }
}

//https://practice.geeksforgeeks.org/problems/consecutive-elements2306/1
