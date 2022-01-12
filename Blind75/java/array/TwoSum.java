package Blind75.java.array;

import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) { 
        int len = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>(len); 
        for(int i = 0; i < len; i++) { 
            int diff = target - nums[i]; 
            if(map.containsKey(diff)) { 
                return new int[]{i, map.get(diff)};
            }
            map.put(nums[i], i);
        }  
       return new int[0];
    }
}
