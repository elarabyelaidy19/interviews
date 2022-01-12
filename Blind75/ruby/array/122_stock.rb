def max_profit(prices) 
    l, r = 0, 1 
    max_profit = 0 
    while r < prices.length 
        if prices[l] < prices[r] 
            profit = prices[r] - prices[l] 
            max_profit = [profit, max_profit].max 
        else 
            l = r 
        end 
        r += 1 
    end 
    max_profit
end 

def max_profit(prices) 
    min = 100**100 
    max = 0 
    len = prices.length - 1

    for i in 0..len 
        if(prices[i] < min) 
            min = prices[i] 
        else 
            max = [max, prices[i] - min].max 
        end 
    end 
    max 
end 