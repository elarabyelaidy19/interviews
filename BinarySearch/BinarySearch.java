package Gem.BinarySearch;

import java.lang.annotation.Target;

public class BinarySearch { 
    // return index of number grater than its lefts and rights 
    int peakIndexMountainArray(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        while (r > l) {
            int mid = (l + r) / 2;
            if (arr[m] < arr[m + 1]) // until element < elment + 1 shrink, when condition fail we found Peak
                l = m + 1;
            else
                r = m;
        }
        return l;
    }

    // Binary search 
    public int binarySearch(int[] arr, int target) { 
        int l = 0; 
        int r = arr.length-1;  
        
        while(r >= l) { 
            int mid = (l + r) / 2; 
            if(arr[mid] == target) { 
                return mid;
            } else if(arr[mid] > target) { 
                r = mid - 1;
            } else { 
                l = mid + 1;
            }
        }
        return -1;
    } 

    // guess number higher or lower 
    public int guessNumber(int n) { 
        int l = 1; 
        int r = n; 
        while ( r >= l) { 
            int mid  = l + (r - l) / 2; 
            int res = guess(n); 
            if (res == 0) { 
                return mid;
            } else if (res == 1) { 
                l = mid + 1; 
            } else { 
                r = mid - 1;
            }
        }
        return -1;
    }  

    // upper bound function => return the the highest position where the value can be inserted without breaking order or -1 
    /*
     *        v-- lower bound
     * 1 2 3 4 5 5 5 6 7 9
     *              ^-- upper bound
     * 
     */
    public int upperBound(int[] arr, int target) { 
        if(arr == null || arr.length == 0) return -1;
        int l = 0; 
        int r = arr.length-1; 
        while(r > l) { 
            int mid = l + (r - l) / 2; 
            if(arr[mid] <= target) { 
                l = mid + 1;
            } else { 
                r = mid;
            }
        } 
        return arr[l] > target ? l : -1;
    }

    // upper bound function => return the the highest position where the value can
    // be inserted without breaking order or -1
    /*
     *        v-- lower bound
     * 1 2 3 4 5 5 5 6 7 9
     *              ^-- upper bound
     * 
     */ 

    public int lowerBound(int[] nums, int target) { 
        int l = 0; 
        int r = nums.length-1; 
        while ( r > l) { 
            int mid = l + (r - l) / 2; 
            if(nums[mid] < target) { 
            l = mid + 1;
            } else { 
                r = mid;
            }
        } 
        return nums[l] < target ? l : -1;
    } 

    // compute and return the square root of x. 
    public int sqrtX(int x) { 
        if(x == 0) return 0;
        int lo = 1; 
        int hi = x; 
        int res = 0;
        while(hi >= lo) { 
            int mid = lo + (hi - lo) / 2;  
            if(mid <= (x/mid)) { 
                lo = mid + 1; 
                res = mid; 
            } else { 
                hi = mid - 1;
            }
        }
        return res;
    } 

    // ===================================================================  
    // search in a rotated sorted array >>> [4,5,6,7,0,1,2] 3  
    public int search(int[] nums, int target) {
        int minIdx = bsearch(nums); // idx of min num
        if (nums[minIdx] == target)
            return minIdx;
        int n = nums.length - 1;                                                
        int lo = (nums[n] >= target) ? minIdx : 0; //   where to go with lo [[4,5,6,7]  [0,1,2]]  t = 1 => lo = minIdx , hi = n
        int hi = (nums[n] < target) ? minIdx : n;  // where to go with hi       

        while (hi >= lo) {
            int mid = (hi + lo) >> 1;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                hi = mid - 1;
            else
                lo = mid + 1;
        }
        return -1;
    }

    // find index of the minimum num in the array
    public int bsearch(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;
        while (hi > lo) {
            int mid = (hi + lo) >> 1;
            if (nums[mid] > nums[hi])
                lo = mid + 1;
            else
                hi = mid;
        }
        return lo;
    }


    // =============================================================== 
    // given [1..n] product versions find the first bad version which causes all following ones will be bad. 
    public int badVersion(int n) { 
        int lo = 1; 
        int hi = n; 
        while(hi > lo) { 
            int mid = (lo + hi) >>> 1; 
            if(isBadVersion(mid)) hi = mid; 
            else lo = mid + 1;
        }
        return lo;
    }  

    // ================================================================== 
    // find peak element [1,2,3,1] result 3  2 < 3 > 1 
    public int peakElement(int[] nums) { 
        int lo = 0; 
        int hi = nums.length-1; 
        while(hi > lo) { 
            int mid = (hi + lo) >>> 1; 
            if(nums[mid] < nums[mid+1]) lo = mid + 1; 
            else hi = mid;
        }
        return lo;
    }


    // ==================================================================== 
    // find min in rotated sorted array  
    public int findMin(int[] nums) { 
        int lo = 0; 
        int hi = nums.length - 1; 
        while(hi > lo) { 
            int mid = (hi + lo) >>> 1; 
            if(nums[mid] > nums[hi]) lo = mid + 1; 
            else hi = mid;
        }
        return nums[hi];
    } 

    // =========================================================================== 
    // return the minimum i such that nums[i] == i. If there's no solution, return -1. 
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


    // ======================================================================================== 
    // Given an array of integers nums sorted in non-decreasing order, find the
    // starting and ending position of a given target value. If targe is not found in the array,return[-1,-1]. 

    public int[] searchRange(int[] nums, int target) {
        int[] res = { -1, -1 };
        if (nums == null || nums.length == 0) {
            return res;
        }
        res[0] = lower(nums, target);
        res[1] = upper(nums, target);
        return res;
    }

    public int lower(int[] nums, int t) {
        int lo = 0;
        int hi = nums.length - 1;
        int lowr = -1;
        while (hi >= lo) {
            int mid = (hi + lo) >>> 1;
            if (nums[mid] == t) {
                lowr = mid;  // set lowr =  mid and goes left for another value with minimum idx  [5,7,7,8,8,8,10] t =8 
                hi = mid - 1; 
            } else if (nums[mid] > t) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lowr;
    }

    public int upper(int[] nums, int t) {
        int lo = 0;
        int hi = nums.length - 1;
        int uppr = -1;
        while (hi >= lo) {
            int mid = (hi + lo) >>> 1;
            if (nums[mid] == t) {
                uppr = mid; // set upper = mid and goes right seacrh for another value with maximum idx
                lo = mid + 1;
            } else if (nums[mid] > t) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return uppr;
    }

}
