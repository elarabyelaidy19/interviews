import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoPointers { 

    public boolean validPlindrome2(String s) { 
        int l = 0; 
        int r = s.length()-1; 
        while(r > l) { 
            if(s.charAt(l) != s.charAt(r)) { 
                return check(s, l+1, r) || check(s, l, r-1);
            }
            l++; 
            r--;
        }
        return true;
    }

    public boolean check(String s, int l, int r) { 
        while(r > l) { 
            if(s.charAt(l) != s.charAt(r)) 
                return false; 
            l++; 
            r--;
        }
        return true;
    } 

    // valid mountain if the there is number it's left increasing and right decreasing
    public boolean validMountain(int[] arr) { 
        if(arr.length < 3) return false;
        int l = 0; 
        int r = arr.length-1;  
        while(l+1 < r && arr[l] < arr[l+1]) l++; 
        while(r-1 > 0 && arr[r] < arr[r-1]) r--; 
        return l == r;
    }

    // remove duplicate from  array inplace
    public int removeDuplicateFromSortedArray(int[] nums) { 
        int l = 0; 
        int r = 0; 
        while(r < nums.length) { 
            if(nums[l] != nums[r]) { 
                l++; 
                nums[l] = nums[r];
            }
        }
        return l+1; 
    }

    // Given an unsorted array of numbers and a target ‘key’, remove all instances of ‘key’ in-place 
    // and return the new length of the array.

    public int removeElement(int[] arr, int k) { 
        int l = 0; 
        int r = 0; 
        while(r < arr.length) { 
            if(arr[r] != k) { 
                arr[l] = arr[r]; 
                l++;
            }
            r++;
        }
        return l;

    }


    // ============================================================================ 
    // count nums of subarray their products less than k
    public int subarrayProductLessThan(int[] nums, int k) { 
        if(k <= 1) return 0;
        int res = 0; 
        int l = 0; 
        int r = 0; 
        int product = 1;
        while(r < nums.length-1) { 
            product *= nums[r]; 
            while(product >= k && r >= l) product /= nums[l++]; // when product execced k reduce number on the left
            res += r - l + 1; // every step introduce x new subarray (5, 2) =>  (5, (2, (6))) here we introduced three subarrays (6), (2,6), (5,2,6) 
            r++;
        }
        return res;
    }

    // =========================================================================== 
    // squaring a sorted array

    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int l = 0;
        int r = nums.length - 1;
        int n = res.length - 1;
        while (r >= l) {
            if (Math.abs(nums[l] * nums[l]) > Math.abs(nums[r] * nums[r])) {
                res[n--] = nums[l] * nums[l];
                l++;
            } else {
                res[n--] = nums[r] * nums[r];
                r--;
            }
        }
        return res;
    } 


    // =============================================================== 
    //find all triplets that there sum is equals to zero 
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // sort 
        List<List<Integer>> res = new ArrayList<>(); 
        for(int i = 0; i < nums.length-2; i++) { 
            if(i == 0 || nums[i] != nums[i-1]) { 
                int sum = -nums[i]; // x + y + z = 0 =>  x + y = -z
                int lo = i+1; 
                int hi = nums.length-1; 
                while(hi > lo) { 
                    if(nums[lo] + nums[hi] == sum) { 
                        res.add(Arrays.asList(nums[i], nums[lo], nums[hi])); 
                        while(hi > lo && nums[lo] == nums[lo+1]) lo++; // skip duplciates
                        while(hi > lo && nums[hi] == nums[hi-1]) hi--; // skip duplicates
                        lo++; 
                        hi--;
                    } else if(nums[lo] + nums[hi] > sum) { 
                        while(hi > lo && nums[hi] == nums[i-1]) hi--; // skip duplicates
                        hi--;
                    } else { 
                        while (hi > lo && nums[lo] == nums[lo + 1]) lo++; // skip duplicates
                        lo++;
                    }   
                }

            }
        }
        return res;
    }

    // ======================================================================================
    // three sum closest 
    // find the closest sum of target
    public int threeSumClosest(int[] nums, int target) {
        int res = nums[0] + nums[1] + nums[nums.length-1];
        Arrays.sort(nums);  
        for(int i = 0; i < nums.length-2; i++) { 
            int lo = i+1; 
            int hi = nums.length-1; 
            while(hi > lo) { 
                int sum = nums[i] + nums[lo] + nums[hi]; 
                if (sum > target) { 
                    hi--;
                } else { 
                    lo++;
                }

                if (Math.abs(sum-target) < Math.abs(res-target)) {  // find the smallest diff 
                    res = sum;
                }
            }
        }
        return res;              
    }  

    // =======================================================================================  
    // find number of triplets with sum less than target
    public int tripletsWithSmaller(int[] nums, int target) { 
        if(nums == null || nums.length < 3) { 
            return 0;
        }

        Arrays.sort(nums); 
        int count = 0; 
        for(int i = 0; i < nums.length-2; i++) { 
            if(i == 0 || nums[i] != nums[i-1]) { 
                int sum = target - nums[i]; // nums[i] + nums[lo] + nums[hi] < target == nums[lo] + nums[hi] < target - nums[i]  
                int lo = i+1; 
                int hi = nums.length-1; 
                while(hi >= lo) { 
                    if(nums[lo] + nums[hi] < sum) { 
                        count += (hi-lo); // if sum less than, this means all number between hi..lo is less than target, array is sorted.  
                        lo++;
                    } else { 
                        hi--;
                    }
                } 
            }
        }
        return count;
    } 

    // =========================================================================================== 
    // sort color Given an array containing 0s, 1s and 2s, sort the array in-place.
    public void sortColors(int[] nums) { 
        int lo = 0; 
        int hi = nums.length-1; 
        int i = 0; 
        while(hi >= i) { 
            if(nums[i] == 0) { 
                int temp = nums[i]; 
                nums[i] = nums[lo]; 
                nums[lo] = temp; 
                lo++; 
                i++;
            } else if(nums[i] == 2) { 
                int temp = nums[i]; 
                nums[i] = nums[lo]; 
                nums[hi] = temp;
                hi--;
            } else { 
                i++;
            }
        }
    }
}   