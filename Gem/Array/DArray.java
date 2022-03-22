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


    public int[] productOfArrayExceptSelf(int[] nums) { 
        int n = nums.length; 
        int[] res = new int[n]; 

        int left = 1;
        for(int i = 0; i < n; i++) { 
            if(i > 0) 
                left = left * nums[i-1]; 
            res[i] = left;
        }

        int right = 1;
        for(int i = n-1; i >= 0; i--) { 
            if(n-1 > i)  
                right = right * nums[i+1]; 
            res[i] *= right;
        }
        return res;
    }

    public int missingNumber(int[] nums) { 
        int n = nums.length+1; 
        int sum = (n * (n-1))/2; 
        for(int num : nums)  
            sum -= num; 
        return sum;
    } 

    public double findMaxAverage(int[] nums, int k) { 
        int sum = 0; 
        for(int i = 0; i < k; i++)  
            sum += nums[i]; 

        double res = sum; 
        for(int i = k; i < nums.length; i++) { 
            sum += nums[i] - nums[i-k]; 
            res = Math.max(res, sum);
        }

        return res/k;
    }
}