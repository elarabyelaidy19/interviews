## [Recursion Explaination On Leetcode](https://leetcode.com/discuss/study-guide/1733447/Become-Master-In-Recursion) 
> Leeetcode Post on Recursion  

## [Mr Algoritms Course Video](https://www.youtube.com/playlist?list=PLR5x_RGTMNNXHdQp1EorhZq-t3TOWCNis) 


## [Visualize Recursion](https://recursion.vercel.app/) 


# Divide-and-Conquer approach:
It Breaks a problem into subproblems that are similar to the original problem, recursively solves the subproblems, and finally combines the solutions to the subproblems to solve the original problem

# Recursion: 
- the process in which a function calls itself directly or indirectly. 
```ruby 
# direct 
def fun() 
  fun()
end 

# indirect
def fun1 
    fun2()
end 

def fun2 
    fun1()
end 

```
<b>

- leafes nodes in the recursion tree is base case. the construction of the tree is the recursive statement. nums of branches is the number of recursive calls.
- first call is the left part of the tree 
<b> 

```ruby 
def fib(n) 
    return if n == 0 || n == 1 
    fib(n-1) 
    fib(n-2)
end  


```
