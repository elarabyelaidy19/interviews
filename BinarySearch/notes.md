# Binary Search 
- sorted Or Partial Sorted 



# Templete 1  
 used to search for an element or condition which can be determined by accessing a single index in the array. 

- hi = len - 1 
- termination hi >= lo 
- search right lo = mid + 1 
- search left hi = mid - 1 

- end condition when lo > hi 
```java
int binarySearch(int[] nums, int target){
  if(nums == null || nums.length == 0)
    return -1;

  int left = 0, right = nums.length - 1;
  while(left <= right){
    // Prevent (left + right) overflow
    int mid = left + (right - left) / 2;
    if(nums[mid] == target){ return mid; }
    else if(nums[mid] < target) { left = mid + 1; }
    else { right = mid - 1; }
  }

  // End Condition: left > right
  return -1;
}
```
# Templete 2  
used to search for an element or condition which requires accessing the current index and its immediate right neighbor's index in the array.
- hi = len 
- termination hi > lo 
- search right lo = mid + 1
- search left hi = mid

- end condition when lo == hi
- loop ends when you have 1 element left
- post proccessing needed to check if the remaining elment meets the condition 


```java  
int binarySearch(int[] nums, int target){
  if(nums == null || nums.length == 0)
    return -1;

  int left = 0, right = nums.length;
  while(left < right){
    // Prevent (left + right) overflow
    int mid = left + (right - left) / 2;
    if(nums[mid] == target){ return mid; }
    else if(nums[mid] < target) { left = mid + 1; }
    else { right = mid; }
  }

  // Post-processing:
  // End Condition: left == right
  if(left != nums.length && nums[left] == target) return left;
  return -1;
} 
```

# Templete 3  
used to search for an element or condition which requires accessing the current index and its immediate left and right neighbor's index in the array.

- Initial Condition: left = 0, right = length-1
- Termination: left + 1 == right
- Searching Left: right = mid
- Searching Right: left = mid


```java 

public int bsearch(int[] nums, int k) { 
  int lo = 0; 
  int hi = nums.length - 1; 
  while(lo + 1 < hi) { 
    int mid = (hi + lo) >>> 1; 
    if(nums[mid] == k) { 
      return mid;
    } else if(nums[mid] < k) { 
      lo = mid;
    } else { 
      hi = mid;
    }
  } 
  if(nums[lo] == k) return lo;
  if(nums[hi] == k) return hi;
  return -1;
}
```


# Notes 
- when find minimum or maximum, upper bound and lower bound are needed. or range. 

```java 
public int findMinIndex(int[] nums) { 
        int lo = 0; 
        int hi = nums.length - 1; 
        int res = -1; 
        while(hi >= lo) { 
            int mid = (hi + lo) >> 1; 
            if(nums[mid] == mid) { 
                res = mid; 
                hi = mid - 1; // search in left for minimum element if there that satisfy  
            } else if(nums[mid] > mid) { 
                hi = mid - 1;
            } else { 
                lo = mid + 1;
            }
        }
        return res;
    }
```
 
# [Anlysis for the three templets](https://leetcode.com/explore/learn/card/binary-search/136/template-analysis/935/)
![differnces](https://leetcode.com/explore/learn/card/binary-search/136/template-analysis/Figures/binary_search/Template_Diagram.png) 
