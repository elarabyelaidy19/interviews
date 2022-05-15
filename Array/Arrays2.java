package Gem.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays2 {
    
    public void nextPermutations(int[] nums) { 
        int i = nums.length - 2; 
        while(i >= 0 && nums[i] >= nums[i+1]) i--;
    
        if(i >= 0) { 
            int j = nums.length-1;
            while(nums[i] >= nums[j]) j--; 
            swap(nums, i, j);
        }

        reverse(nums, i+1);
    }

    public void reverse(int[]nums, int start) { 
        int end = nums.length-1; 
        while(start < end) { 
            swap(nums, start++, end--);
        }
    }
    public void swap(int[] nums, int i, int j) { 
        int temp = nums[i]; 
        nums[i] = nums[j];
        nums[j] = temp;
    }
    


    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            // skip when duplicates
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int lo = i + 1;
                int hi = nums.length - 1;
                int sum = 0 - nums[i]; // 0 - num == sum of 2 numbers when added together gives 0
                while (hi > lo) {
                    if (nums[lo] + nums[hi] == sum) {
                        res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                        while (hi > lo && nums[lo] == nums[lo + 1])
                            lo++; // skip duplicates
                        while (hi > lo && nums[hi] == nums[hi - 1])
                            hi--; // skip duplicates
                        hi--;
                        lo++;
                    } else if (sum > nums[lo] + nums[hi])
                        lo++;
                    else
                        hi--;
                }
            }
        }
        return res;
    } 


    
}
