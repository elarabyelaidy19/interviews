package Blind75.java.array;

public class ProductOfArrayExceptItSelf {
    public int[] productExceptSelf(int[] nums) {
        int N = nums.length;
        int[] result = new int[N]; 
        int pre = 1; 
        for(int i = 0; i < N; i++) { 
            result[i] = nums[i] * pre; 
            pre *= nums[i];
        }
        
        int post = 1; 
        for(int i = N-1; i > 0; i--) { 
            result[i] = post * result[i-1]; 
            post *= nums[i];
        }
        result[0] = post; 
        return result;
    }
}
