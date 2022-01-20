package Blind75.java.array; 

public class MaxSubarraySum { 

    public int maxSumSubArray(int[] nums) { 
        int max = nums[0]; 
        int currentSum = 0; 

        for(int i = 0; i < nums.length; i++) { 
            if(currentSum < 0) 
                currentSum = 0; 
            currentSum += nums[i]; 
            max = Math.max(currentSum, max);
        }
        return max;
    }


    public int maxSumSubArray2(int[] nums) { 
        int[] dp = new int[nums.length]; 
        dp[0] = nums[0]; 
        int max = dp[0]; 
        
        for (int i = 0; i < nums.length; i++) { 
            dp[i] = nums[i] + (dp[i-1] > 0 ? dp[i-1] : 0);
        } 
        return max;
    }
  
}
