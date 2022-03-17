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