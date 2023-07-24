//most bruteforce 
class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> sList = new ArrayList<>();
        for(int i = 0; i < words.size(); i++ ){
            int f = 0;
            for(int j = 0; j< words.get(i).length(); j++){
                int l = 0 ;
                if(words.get(i).charAt(j) == separator){
                    l = j;
                    if(words.get(i).substring(f,l).length() != 0){
                        sList.add(words.get(i).substring(f,l));
                    }
                    f = l+1;
                }
                if(j == words.get(i).length() -1){
                    if(words.get(i).substring(f).length() != 0){
                        sList.add(words.get(i).substring(f));
                    }
                }
                
            }
        }

        return sList;
    }
}


//using split method
class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> sList = new ArrayList<>(); 
        for(int i = 0; i < words.size(); i++){
            String[] st = words.get(i).split("[" + separator+ "]");
            for(String x : st){
                System.out.println(x);
                if(x.length() > 0){
                    sList.add(x);
                }
            }
        }

        return sList;
    }
}

//https://leetcode.com/problems/split-strings-by-separator/description/
