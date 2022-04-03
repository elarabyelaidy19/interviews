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
    

}
