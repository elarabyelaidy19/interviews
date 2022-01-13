package Blind75.java.array;

import java.util.HashMap;
import java.util.Set;

public class ConatinDuplicates {
    public boolean ConatinDuplicates(int[] nums) { 
        // Map
        HashMap<Integer, Boolean> map = new HashMap<>(); 
        int len = nums.length - 1; 
        for(int i = 0; i < len; i++) { 
            if(map.containsKey(nums[i])) 
                return true; 
            map.put(nums[i], true);
        }
        return false;
    } 


    // Using set     
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> map = new HashSet<>(); 
        for(int num : nums) {
            if(map.contains(num)){ 
                return true; 
            }
            map.add(num);
        }
        return false;
    }

}
