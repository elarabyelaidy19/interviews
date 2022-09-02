# Backtracking 
Backtracking is a technique for solving problems by exploring all possible solutions.
The solution of a Backtracking problem can be represented in form of **state spece tree**. 
Backtracking follows Depth-First Search method. 


- **Choice**: decision space
- **Constraint**: Constraint satisfaction 
- **Goal**: Finding a solution

## [backtracking general approach](https://tinyurl.com/56a3wx9j) 

# General Approach for subsets problems
- "pick", "unpick" approach, we either pick the element and explore the remaining elements or we unpick the element and explore the remaining elements.
![backtracking](https://assets.leetcode.com/users/images/1ca8ad88-a0dc-4995-82e0-ce6822177b98_1621218217.2663536.png)  

```ruby 
def subsets(nums) 
    sub = [] 
    res = [] 
    solve(nums, 0, sub, res) 
    return res
end 


def solve(nums, i, sub, res) 
    if i == nums.length 
        res << sub.dup 
        return
    end 
    # pick element
    sub << nums[i] 
    solve(nums, i+1, sub, res) 

    # unpick 
    sub.pop
    solve(nums, i+1, sub, res)

end 


```