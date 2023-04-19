public static void printDuplicate(String S){
        char [] s_arr = S.toCharArray();

        Arrays.sort(s_arr);

        int count = 0;
        char temp = s_arr[0];
        for(int i = 0; i< S.length() ; i++){
            if(i == (S.length()-1)){
                if(s_arr[i] == temp){
                    count++;
                }
                if(count>1){
                    System.out.print(temp + " : ");
                    System.out.println(count);
                }

            }
            else if(s_arr[i] == temp){
                count++;
            }
            else{
                if(count>1){
                    System.out.print(temp + " : ");
                    System.out.println(count);
                }
                temp = s_arr[i];
                count = 1;
            }
        }
    }

//https://www.geeksforgeeks.org/print-all-the-duplicates-in-the-input-string/
