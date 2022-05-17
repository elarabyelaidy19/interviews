package Gem.BinarySearch;

import java.lang.annotation.Target;

public class BinarySearch { 
    // return index of number grater than its lefts and rights 
    int peakIndexMountainArray(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        int m = 0;
        while (r > l) {
            m = (l + r) / 2;
            if (arr[m] < arr[m + 1])
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

}
