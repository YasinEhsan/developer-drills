// 5.8.19

import java.util.*;
import java.io.*; 

public class Main {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray(nums);
    }
    public static int maxSubArray(int[] A) {
        /*PLan
            - find all sum permutations of the array. 
            - not sure how to proceed
        
        */
        
         int n = A.length;
        int[] dp = new int[n];//dp[i] means the maximum subarray ending with A[i];
        dp[0] = A[0];
        int max = dp[0];
        
        for(int i = 1; i < n; i++){
            if(dp[i - 1] > 0 ){
                dp[i] = A[i] + dp[i - 1];
            }
            else{
                dp[i] = A[i];
                System.out.print("BUZZ\t");
            }
            // dp[i] = A[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            System.out.printf("%d %d %d %d\n", i, A[i], dp[i], max );
            max = Math.max(max, dp[i]);
        }
        
        for(int i = 0; i < n; i++){
         System.out.printf("\n%d %d ", i, dp[i]);
        }
        
        return max;
    }
    
    //w/o dp array
    public int maxSubArray(int[] nums) {
    if (nums.length == 0){
        return 0;
    }

    int prev = nums[0];
    int cur = nums[0];
    int max = nums[0];
    
    for (int i = 1; i < nums.length; i++){
        if (prev > 0){
            cur = prev + nums[i];
        }else{
            cur = nums[i];
        }
        max = Math.max(max, cur);
        prev = cur; 
    }
    
    return max;
}
    
}
