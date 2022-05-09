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

}   