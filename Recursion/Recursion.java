package Recursion;
import java.util.List; 

import java.util.ArrayList;;
public class Recursion {
    // claculate power base recursively 
    public int pow(int base, float exp) { 
        if(exp == 0) return 1; 
        return base * pow(base, exp-1);
    } 

    // calculate lucas number => 2, 1, 3, 4, 7, 11, 
    public int lucas(int n) { 
        if(n == 0) return 2; 
        if(n == 1) return 1; 
        return lucas(n-1) + lucas(n-2);
    } 


    // sum Array recursively 
    public int sumArray(List<Integer> nums) {  
        int n = nums.size()-1;
        if(nums.isEmpty()) return 0;
        return nums.remove(n) + sumArray(nums);
    } 

    // reverse string recusrsivly 
    public String reveString(String Str) { 
        if(Str.length() <= 1) return Str; 
        int n = Str.length()-1; 
        return Str.charAt(n) + reveString(Str.substring(0, n-1));
    }
}
