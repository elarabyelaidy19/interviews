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
}