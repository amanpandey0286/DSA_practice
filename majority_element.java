class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        Arrays.sort(a);
        int prev = a[0];
        int ans = -1;
        int count = 0;
        for(int i = 0; i < size; i++){
            if(a[i] == prev){
                count++;
            }else if(a[i] != prev){
                prev = a[i];
                count = 1;
            }
            
            if(count > (size/2) ){
                return a[i];
            }
        }
        
       
        
        return ans;
    }
}

//https://www.geeksforgeeks.org/problems/majority-element-1587115620/1?page=1&difficulty=Medium&sortBy=submissions
