// only recursive approach
static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here 
         if( W == 0 || n == 0 ) return 0; 
         if(wt[n-1] > W){
             return knapSack(W, wt, val , n-1);
         }else{
             return Math.max(knapSack(W, wt, val, n-1), val[n-1] + knapSack(W - wt[n-1], wt , val ,n-1 ));
         }
    } 
