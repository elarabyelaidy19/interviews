package Gem.Array;

import java.util.Arrays;

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

    public int maxConsecutiveOnes(int[] nums) { 
        int max = 0; 
        int maxSofar = 0; 
        for(int i = 0; i < nums.length; i++) { 
            if(nums[i] == 1) { 
                maxSofar += 1; 
                max = Math.max(max, maxSofar);
            } else { 
                max = 0;
            }
        }
        return max;
    }


    // ======================================================

    public int findNumbers(int[] nums) {
        int even = 0;
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            if (countDigit(curr) % 2 == 0) {
                even += 1;
            } else {
                continue;
            }
        }
        return even;
    }

    public int countDigit(int n) {
        int cnt = 0;
        while (n != 0) {
            cnt += 1;
            n /= 10;
        }
        return cnt;
    } 

    // ======================================================
    // O(NlogN)
    public int[] squareOfSortedArray(int[] nums) { 
        for(int i = 0; i < nums.length; i++) { 
            nums[i] *= nums[i]; 
        }
        Arrays.sort(nums); 
        return nums;

    } 

    // O(N) 
    public int[] sortedSquares(int[] nums) {
        int n = nums.length; 
        int l = 0; 
        int r = n - 1; 
        int[] res = new int[n]; 
        for(int i = n-1; i >= 0; i--) { 
            if(Math.abs(nums[l]) > Math.abs(nums[r])) { 
                res[i] = nums[l] * nums[l]; 
                l++;
            } else { 
                res[i] = nums[r] * nums[r]; 
                r--;
            }
        }
        return res;
    }
}