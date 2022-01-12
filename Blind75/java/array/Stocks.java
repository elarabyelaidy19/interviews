package Blind75.java.array;

public class Stocks {
    public int maxProfit(int[] prices) {
        int l, r; 
        l = 0; 
        r = 1;
        int maxProfit = 0; 
        while(r < prices.length){ 
            if(prices[l] < prices[r]) {
                int profit = prices[r] - prices[l]; 
                maxProfit = Math.max(maxProfit, profit); 
            } else { 
                l = r; 
            } 
             r++;   
        }
        return maxProfit;
            
    } 


    public int maxProfit2(int[] prices) { 
        int max = 0; 
        int min = Integer.MAX_VALUE; 
        for(int i = 0; i < prices.length; i++) { 
            if(prices[i] < min) { 
                min = prices[i]; 
            }else { 
                max = Math.max(max, prices[i] - min);
            }
        }
        return max;
    }
}
