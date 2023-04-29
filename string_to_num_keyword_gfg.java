public static String phoneKeypad(String str){
        String [] num_arr = { "2","22","222","3","33","333","4","44","444","5","55","555","6","66","666","7","77","777","7777","8","88","888","9","99","999","9999"};
        char [] alp_arr = {'A', 'B', 'C', 'D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

        String ans = "";

        for(int i = 0 ; i< str.length(); i++){
            if(str.charAt(i) == ' '){
                ans += " ";
            }else{

                for(int j = 0 ; j< alp_arr.length; j++){
                    if(str.charAt(i) == alp_arr[j]){
                        ans += num_arr[j];
                    }
                }
            }
        }

        return ans;
    }


//https://www.geeksforgeeks.org/convert-sentence-equivalent-mobile-numeric-keypad-sequence/
