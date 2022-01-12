# @param {Integer[]} nums
# @param {Integer} target
# @return {Integer[]}
def two_sum(nums, target)
    hash = {}
    len = nums.length - 1
    for i in(0..len) 
        diff = target - nums[i] 
        if hash.include?(diff) 
            return [i, hash[diff]] 
        end  
        hash[nums[i]] = i  
    end 
    return 
end