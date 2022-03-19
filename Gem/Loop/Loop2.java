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
}