# converging pointers 
- two pointers moving towards each other.
```java 
    int l = 0, r = s.length() - 1;
    while (l < r) {
        if (s.charAt(l) != s.charAt(r))
            return false;
        l++; r--;
    }
``` 

# [subtract the product and sum of two integers](https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/) 
- split the number into digits.  
- two function to get the product and sum of digits. 
- subtract the product and sum.


# [valid plindrome](https://leetcode.com/problems/valid-palindrome/description/)
- alphanumeric values test if the char is letter or number. if it is not skip it. 
- if the char at index l to lower case is equal to the char at index r to lower case, then move the pointers to the next char. 
``` java 
    Character.isLetterOrDigit(c)
``` 

# [PeakMountainIndexArray](https://leetcode.com/problems/peak-index-in-a-mountain-array/) 
- search for the first number that is greater than its neighbors. arr[i] > arr[i+1] 
- binary search array, return the index of the number at left if it is greater than its neighbors. 

# [ robot return to origin](https://leetcode.com/problems/robot-return-to-origin/) 
- robot return to origion when i'ts x and y == 0. 
- left --x , right ++x 
- up --y , down ++y 

# [Palindromic Substrings](https://leetcode.com/problems/palindromic-substrings/) 
- check for plindrome using two converging pointers, this gives us the number of odd palindromes.
- to check for even plindrome, add one to the right pointer. 


# [longest continues increasing subsequence](https://leetcode.com/problems/longest-continuous-increasing-subsequence/) 
- sliding window, keep track of the longest increasing subsequence. 
- if the condition fails, update anchor to the current index, and start new sequence, check if the current sequnce is greater than the previous one. 

# [pascal triangle](https://leetcode.com/problems/pascals-triangle/) 
- use a 2d array to store the triangle. 
- the first and last element of every row is 1. 
- the current element is the sum of the two elements above. element at index i is prev[i-1] + prev[i]. 

# [implement strStr()](https://leetcode.com/problems/implement-strstr/) 
- if the needle is empty, return 0.
- if the needle is not empty, check if the needle is in the haystack. 
- chech if the current char is equal to the needle char at index i, then substr the hystack form i to i+ length of needle and compare it with needle. 

# [best time to buy and sell stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) 
- using kadane's algorithm, use tow variable max and min, loop through array and update min, max.  
- min is the minimum of the current element and the current min.
- max is the max between the current max and the current value - min. 



