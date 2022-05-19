# Binary Search 
- sorted  

```java

List<Integer> list = Arrays.asList(5, 7, 9, 13, 17, 22);
        
// Collections.binarySearch returns index of an element in a list if it's present there,
// or (-(position where the element would be inserted) - 1) if the element is not in the list.
// You can just regard negative result as element missing in a list.
System.out.println(Collections.binarySearch(list, 13)); // prints 3
System.out.println(Collections.binarySearch(list, 15)); // -5 (- (4) - 1 ) => -5
System.out.println(Collections.binarySearch(list, 22)); // 5
System.out.println(Collections.binarySearch(list, 5));  // 0

``` 



# Templete 1 
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



# Tricks 
```java 
while(hi-lo > 1) { 
    if(check(mid)) { 
        lo = mid; 
    } else { 
        hi = mid; 
    } 
}
```

