package Gem.Array;

public class DArray {
    class NumArray {

        private int prefixSum[];

        public NumArray(int[] nums) {
            prefixSum = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                prefixSum[i] = nums[i];
                if (i > 0)
                    prefixSum[i] += prefixSum[i - 1];
            }
        }

        public int sumRange(int i, int j) {
            int sum = prefixSum[j];
            if (i > 0)
                sum -= prefixSum[i - 1];
            return sum;
        }
    }

    // ====================================================== 


    public int maxSubArray(int[] nums) { 
        int max = nums[0]; 
        int maxSoFar = nums[0]; 
        for(int i = 1; i < nums.length; i++) { 
            max = Math.max(max + nums[i], nums[i]);
            maxSoFar = Math.max(max, maxSoFar);
        }
        return maxSoFar;
    } 


    // ======================================================

    public void mergeSortedArray(int[] nums1, int m, int[] nums2, int n) { 
        int p1 = m - 1; 
        int p2 = n - 1; 
        int p = m + n - 1; 

        while(p2 >= 0) { 
            if(p1 >= 0 && nums1[p1] > nums2[p2]) { 
                nums1[p--] = nums1[p1--];
            } else { 
                nums1[p--] = nums2[p2--];
            }
        }
    }
}