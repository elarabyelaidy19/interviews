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


# another slo using sorting O(nlogn)  
# @param {Integer[]} nums
# @return {Boolean}
def contains_duplicate(nums)
    len = nums.length - 1
    nums.sort!
    for i in 0..len 
        return true if nums[i] == nums[i+1]
    end 
    false
end 


# Third sol using Hash O(N) Time, O(N) Space

def contains_duplicate(nums) 
    hash = {} 
    len = nums.length - 1 
    for i in 0..len 
        if hash.include?(nums[i]) 
            return true 
        end  
        hash[nums[i]] = true 
    end 
    false
end 

