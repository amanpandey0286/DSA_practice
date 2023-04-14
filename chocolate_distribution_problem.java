import java.util.*;
public class solution {

    public static int minDiff(int [] arr, int m){
        Arrays.sort(arr);
        int minm = Integer.MAX_VALUE;
        for(int i = 0; i< (arr.length-(m-1));i++){
            int j = i+m-1;
            minm = Math.min(minm, (arr[j]-arr[i]));
        }
        return minm;
    }
    public static void main(String[] args){
        int[] nums = {3,4,1,9,56,7,9,12};
        System.out.println(minDiff(nums, 5));
    }
}

//https://www.geeksforgeeks.org/chocolate-distribution-problem/
