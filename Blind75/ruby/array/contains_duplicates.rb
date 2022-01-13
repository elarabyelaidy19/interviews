# @param {Integer[]} nums
# @return {Boolean}
# brute force slution O(n^2) Time, O(1) space
def contains_duplicate(nums)
    len = nums.length
    for i in 0..len 
        for j in i+1..len 
            return true if nums[i] == nums[j] 
        end 
    end 
    false
end


