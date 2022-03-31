package Gem.Sorting;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Sorting {

    // O(NlogN), O(N)
    public boolean isAnagram(String s, String t) { 
        if(s.length() != t.length()) 
            return false; 

        char[] sArray = s.toCharArray(); 
        char[] tArray = t.toCharArray(); 

        Arrays.sort(sArray); 
        Arrays.sort(tArray);

        for(int i = 0; i < sArray.length; i++) { 
            if(sArray[i] != tArray[i]) 
                return false;
        }
        return true;

    }

    // O(N) freq array
    public boolean isAnagram2(String s, String t) { 
        int[] freqArray = new int[26];
        for(int i = 0; i < s.length(); i++) { 
            freqArray[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < t.length(); i++) { 
            freqArray[t.charAt(i) - 'a']--;
        }

        for(int i = 0; i < freqArray.length; i++) { 
            if(freqArray[i] != 0) 
                return false;
        }
        return true;
    }
    // ============================================================================
    // O(nlogn), O(1)
    public boolean containsDuplcates(int[] nums) { 
        Arrays.sort(nums); 
        for(int i = 1; i < nums.length; i++) { 
            if(nums[i] == nums[i-1]) 
                return true;
        }
        return false;
    }

    public boolean containsDuplcates2(int[] nums) { 
        Set<Integer> set = new HashSet<>(); 
        for(int num : nums) { 
            if(set.contains(num)) 
                return true; 
            set.add(num);
        }
        return false;
    }

    // ============================================================================
    // O(nlogn), O(1)
    public int maximumProduct(int[] nums) { 
        Arrays.sort(nums); 
        int max1 = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]; 
        int max2 = nums[0] * nums[1] * nums[nums.length - 1]; 
        return Math.max(max1, max2);
    }

    // ============================================================================ 

    public int[][] mergeIntervals(int[][] intervals) { 
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0])); 
        LinkedList<int[]> list = new LinkedList<>(); 

        for(int[] interval : intervals) { 
            if(list.isEmpty() || list.getLast()[1] < interval[0]) { 
                list.add(interval); 
            } else { 
                list.getLast()[1] = Math.max(list.getLast()[1], interval[1]);
            }
        }
        return list.toArray(new int[list.size()][]);
    }

    // ============================================================================

    public String largestNumber(int[] nums) { 
        String[] str_num = new String[nums.length];
        for(int i = 0; i < nums.length; i++) { 
            str_num[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(str_num, (a, b) -> (b + a).compareTo(a + b));
        if(str_num[0].charAt(0) == '0') 
            return "0";
        
        StringBuilder sb = new StringBuilder(); 
        for(String s : str_num) { 
            sb.append(s);
        }
        return sb.toString();
    }
}
