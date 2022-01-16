package Blind75.java.array;

public class ProductOfArrayExceptItSelf {
    public int[] productExceptSelf(int[] nums) {
        int N = nums.length;
        int[] result = new int[N]; 
        int pre = 1;  // 1,2,6,24,
        // [1,2,3,4,5]
        for(int i = 0; i < N; i++) { 
            result[i] = nums[i] * pre; 
            pre *= nums[i];
        }
        // result =>[1,2,6,24,120]
        
        int post = 1; // 1, 2
        for(int i = N-1; i > 0; i--) { 
            result[i] = post * result[i-1]; 
            post *= nums[i];
        }
        // [120,24,12,]
        result[0] = post; 
        return result;
    } 


    public int[] productExceptSelf2(int[] nums) {
        int N = nums.length;
        int[] result = new int[N]; 
        int[] left = new int[N]; 
        int[] right = new int[N]; 
        
        left[0] = 1; 
        right[N-1] = 1; 
        
        for(int i = 1; i < N; i++) { 
            left[i] = left[i-1] * nums[i-1];
        }
        
        for(int i = N-2; i >= 0; i--) { 
            right[i] = right[i+1] * nums[i+1]; 
        }
        
        for(int i = 0; i < N; i++) { 
            result[i] = left[i] * right[i]; 
        }
        return result;
    }
}
