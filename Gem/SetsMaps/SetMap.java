import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetMap { 
    
    public boolean containsDuplicates(int[] nums) { 
        Set<Integer> set = new HashSet<>(); 
        for(int num : nums) { 
            if(set.contains(num)) 
                return true; 

            set.add(num);
        }
        return false;
    }
 
    public int[] twoSum(int[] nums, int target) { 
        if(nums == null || nums.length < 2) 
            return null; 

        Map<Integer, Integer> map = new HashMap<>(); 
        for(int i = 0; i < nums.length; i++) { 
            int diff = target - nums[i]; 
            if(map.containsKey(diff)) {  
                int[] res = {i, map.get(diff)}; 
                return res; 
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public int[] intersectionOfTwoArrays(int[] nums1, int[] nums2) { 
        Set<Integer> set1 = new HashSet<>(); 
        for(int n : nums1) 
            set1.add(n);

        Set<Integer> set2 = new HashSet<>();
        for(int n : nums2) { 
            if(set1.contains(n)) 
                set2.add(n);
        }

        int[] res = new int[set2.size()]; 
        int pos = 0; 
        for(int n : set2)  
            res[pos++] = n; 
    return res;
    }
}