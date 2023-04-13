public static String reverseWord(String str)
    {
        // Reverse the string str
        StringBuilder sb  = new StringBuilder(str.length());
        for(int i = 0; i<str.length(); i++){
            sb.insert(i,str.charAt(str.length()-i-1));
        }
        return sb.toString();
    }
 
 //https://practice.geeksforgeeks.org/problems/reverse-a-string/1
