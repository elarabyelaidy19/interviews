# @param {Integer[]} nums
# @return {Integer[]}
def product_except_self(nums)
    result = [] 
    pre = 1 
    len = nums.length - 1
    0.upto(len) do |i|
        result[i] = pre * nums[i] 
        pre *= nums[i] 
    end  
    post = 1 
    len.downto(1) do |i|
        result[i] = result[i - 1] * post 
        post *= nums[i] 
    end 
    result[0] = post 
    result
end


