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


    
}