public class Loop { 

    public boolean isPlindrome(String str) { 

        if(str.length() == 0 || str.length() == 1) { 
            return true;
        }

        int l = 0; 
        int r  = str.length() - 1;
        while(r > l) { 
            if(str.charAt(l) != str.charAt(r)) { 
                return false;
            }
            r--; 
            l++;
        }
        return true;
    }

    public void reverseString(char[] str) { 
        if(str.length == 0 || str.length == 1) { 
            return;
        }

        int l = 0; 
        int r = str.length - 1;
        while(r > l) {  
            swap(str, l, r); 
            l++; 
            r--;
        }
    }

    public void swap(char[] str, int i, int j) { 
        char temp = str[i]; 
        str[i] = str[j]; 
        str[j] = temp;
    } 

    public boolean validPlindrome(String str) { 
        if(str.length() == 0 || str.length() == 1) { 
            return true;
        } 

        int l = 0; 
        int r = str.length() - 1; 
        while(r > l) { 
            if(!Character.isLetterOrDigit(str.charAt(l)) { 
                l++;
            } else if (!Character.isLetterOrDigit(str.charAt(r)) { 
                r--;
            } else { 
                if(Character.toLowerCase(str.charAt(l)) != Character.toLowerCase(str.charAt(r))) 
                    return false; 
                l++; r--; 
            }
        }
        return true;

    }

    int digitSum(int n) { 
        int sum = 0; 

        while(n--) { 
            int lastDigit = n % 10; 
            sum += lastDigit; 
            n /= 10; 
        }
        return sum;

    }

    class Solution {
    public int subtractProductAndSum(int n) {
        return productSum(n) - sumDigit(n);
    } 
    
    public int productSum(int n) { 
        int sum = 1; 
        
        while(n > 0) { 
            int lastDigit = n % 10; 
            sum *= lastDigit; 
            n /= 10;
        } 
        return sum;
    }
    
    public int sumDigit(int n) { 
        int sum = 0; 
        
        while(n >  0) { 
            int lastDigit = n % 10; 
            sum += lastDigit; 
            n /= 10;
        }
        return sum;
    }
    
    // 
    int peakIndexMountainArray2(int[] arr) { 
        for(int i = 1; i+1 < arr.length - 1; i++) { 
            if(arr[i] > arr[i+1]) 
                return i; 
            return 0;
        }
    }
    // O(logn) binary search
    int peakIndexMountainArray(int[] arr) { 
        int l = 0; 
        int r = arr.length - 1; 
        int m = 0;  
        while(r > l) { 
            m = (l+r) / 2; 
            if(arr[m] < arr[m+1])  
                l = m+1;
            else 
                r = m;
        }
        return l;
    }


}
}