def max_subarray_sum(nums) 
    max_so_far = nums[0] 
    current_sum = 0 
    len = nums.length - 1 
    # [-2,1,-3,4,-1,2,1,-5,4]
    for i in 0..len 
        if current_sum < 0 
            current_sum = 0 
        end 
        current_sum += nums[i]  
        max_so_far = [max_so_far, current_sum].max 
    end  