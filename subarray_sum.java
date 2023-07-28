
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = sc.nextInt();
        int[] nums = new int[N];
        for(int i = 0; i < N; i++){
            nums[i] = sc.nextInt();
        }
        int f = 0, l = 0, sum = 0;
        boolean flag = true;
        while(l<N){
            if(sum == S){
                System.out.println(f+1 +" "+ l);
                flag = false;
                break;
            }else if(sum < S){
                sum += nums[l];
                l++;
            }else if(sum > S){
                sum -= nums[f];
                f++;
            }
        }
        if(flag == true){
            System.out.println(-1);   
        }
        
    }
}


//to return the 1-index subarray first and last index having sum equal to S.
