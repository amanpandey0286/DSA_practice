public static int findSum(int A[],int N) 
    {
        
        int maxm = Integer.MIN_VALUE;
        int minm = Integer.MAX_VALUE;
        for(int i = 0; i<N; i++){
            maxm = Math.max(maxm, A[i]);
            minm = Math.min(minm, A[i]);
        }
        return maxm + minm;
    }

//https://practice.geeksforgeeks.org/problems/max-min/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab
