import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
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

    public List<List<String>> groupAnagram(String[] strs) { 
        List<List<String>> groupedAnagram = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs) { 
            char[] chars = str.toCharArray(); 
            Arrays.sort(chars); 
            String word = new String(chars); 
            if(!map.containsKey(word)) 
                map.put(word, new ArrayList<>()); 
            map.get(word).add(str); 
        }
        groupedAnagram.addAll(map.values());
        return groupedAnagram;
    } 

    // ================================================================

    public boolean wordpattern(String pattern, String words) { 
        String[] strs = words.split(" "); 
        if(strs.length != pattern.length()) return false; 
        Map<Character, String> map = new HashMap<>(); 
        
        for(int i = 0; i < pattern.length(); i++) { 
            char curr = pattern.charAt(i); 
            if(map.containsKey(curr)) { 
                if(!map.get(curr).equals(strs[i])) 
                    return false;
            } else { 
                if(map.containsValue(strs[i])) { 
                    return false;
                }  
                map.put(curr, strs[i]);
            }
        }
        return true;
    }  

    // =============================================================== 

    public boolean containsDuplicates2(int[] nums, int k) { 
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) { 
            if(map.containsKey(nums[i])) 
                if((i - map.get(nums[i])) <= k) 
                    return true; 
            map.put(nums[i], i);
        }
        return false;
    }
    

    // ===============================================================
    // number of subarrays with sum k
    public int numOfSubarrays(int[] nums, int k) { 
        int count = 0; 
        int sum = 0; 
        Map<Integer, Integer> map = new HashMap<>(); 
        map.put(0, 1);
        for(int i = 0; i < nums.length; i++) { 
            sum += nums[i]; 
            if(map.containsKey(sum - k)) 
                count += map.get(sum-k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }


    // ========================================================================================== 
    // check if number is happy number, happy number is 19 -> 1^2 + 9^2 -> 82 -> split number sum quare and repeat until it gives 1 
    public boolean happyNumber(int n) { 
        Set<Integer> set = new HashSet<>(); 
        while(n != 1 && !set.contains(n)) { 
            set.add(n); 
            n = sumDigits(n);
        }
        return n == 1;
    }

    int sumDigits(int n) { 
        int sum = 0; 
        while(n != 0) { 
            int s = n % 10; 
            n /= 10; 
            sum = s*s;
        }
        return sum;
    }


    // =================================================================================== 
    


}