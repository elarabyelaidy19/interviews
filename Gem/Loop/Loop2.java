

public class Loop2 { 

    public int strStr1(String haystack, String needle) { 
        int l1 = haystack.length();  
        int l2 = needle.length(); 

        if(l2 == 0) return 0; 
        if(l2 > l1) return -1; 

        int threshold = l1 - l2; 
        for(int i = 0; i < threshold; i++) { 
            if(haystack.substring(i, i+l2).equals(needle)) return i;
        }
        return -1;
    } 

    public int strStr2(String haystack, String needle) { 
        int l1 = haystack.length();  
        int l2 = needle.length(); 

        if(l2 == 0) return 0; 
        if(l2 > l1) return -1; 

        int threshold = l1 - l2; 
        for(int i = 0; i <= threshold; i++) { 
            for(int j = 0; j < l2-1; j++) { 
                if(haystack.charAt(i) == needle.charAt(j)) { 
                    if(j == l2-1) return i-j; 
                    i++;
                }else { 
                    break;
                }
            }
        } 
        return -1;
    }



    public int bestTimeToBuyAndSellStock(int[] prices) { 
        int max = 0; 
        int min = prices[0]; 
        for(int i = 0; i < prices.length; i++) { 
            if(prices[i] < min) min = prices[i]; 
            if(prices[i] - min > max) max = prices[i] - min;
        }
        return max;
    } 

    // kadane's algorithm
    public int maxProfit(int[] prices) { 
        int max = 0; 
        int min = prices[0]; 
        for(int i = 0; i < prices.length; i++) { 
            min = Math.min(min, prices[i]);
            max = Math.max(max, prices[i] - min);
        }
        return max;
    } 


    public String longestCommonPrefix(String[] strs) { 
        if(strs.length == 0) return ""; 
        String pre = ""; 
        int index = 0; 
        for(char c : strs[0].toCharArray()) { 
            for(int i = 1; i < strs.length; i++) { 
                if(index > strs[i].length() || c != strs[i].charAt(index)) 
                    return pre;
            } 
            pre += c; 
            index++;
        }
        return pre;
    } 

    public String longestCommonPrefix2(String[] strs) { 
        String pre = strs[0]; 
        for(int i = 1; i < strs.length; i++) { 
            while(!strs[i].startsWith(pre)) 
                pre = pre.substring(0, pre.length()-1);
        }
        return pre;
    } 


    public boolean jumpGame(int[] nums) { 
        int goal = nums.length-1; 
        for(int i = nums.length - 2; i >= 0; i--) { 
            if(nums[i] + i >= goal) goal = i; 
        }
        return goal <= 0;
    } 


    public boolean increasingTriplets(int[] nums) { 
        int max1 = Integer.MAX_VALUE; 
        int max2 = Integer.MAX_VALUE; 

        for(int i = 0; i < nums.length; i++) { 
            if(nums[i] <= max1) max1 = nums[i]; 
            else if(nums[i] <= max2) max2 = nums[i]; 
            else return true;
        }
        return false;
    }
}