

import java.util.ArrayList;
import java.util.List;

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
            if(!Character.isLetterOrDigit(str.charAt(l))) { 
                l++;
            } else if (!Character.isLetterOrDigit(str.charAt(r))) { 
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

        while(n > 0) { 
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
        return 0;
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



    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for (char c : moves.toCharArray()) {
            switch (c) {
                case 'U':
                    y--;
                    break;
                case 'D':
                    y++;
                    break;
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
            }
        }
        return x == 0 && y == 0;
    }


    public int countSubstrings(String s) { 
        int count = 0; 
        for(int i = 0; i < s.length(); i++) { 
            count += checkPalindrome(s, i, i); // odd length palindrome
            count += checkPalindrome(s, i, i+1); // even length palindrome
        }
        return count;
    }

    public int checkPalindrome(String str, int s, int e) { 
        int count = 0; 
        while(s >= 0 && e < str.length() && str.charAt(s) == str.charAt(e)) { 
            count++; 
            s--; 
            e++;
        }
        return count;
    } 


    public int longestContunuesIncreasing(int[] nums) { 
        int max = 0; 
        int count = 0; 
        for(int i = 0; i < nums.length; i++) { 
            if(i == 0 || nums[i] > nums[i-1]) { 
                count++; 
            } else { 
                max = Math.max(max, count); 
                count = 1; 
            }
        }
        return Math.max(max, count);
    } 

    public int longestContunuesIncreasing2(int[] nums) { 
        int res = 0; 
        int anchor = 0; 
        for(int i = 0; i < nums.length; i++) { 
            if(i > 0 && nums[i-1] > nums[i]) anchor = i; // update anchor when the continues seq end 
            res = Math.max(res, i - anchor + 1); 
        }
        return res;
    } 


    public ArrayList<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> allrows = new ArrayList<List<Integer>>(); 
        List<Integer> firstRow = new ArrayList<Integer>(); 
        firstRow.add(1); 
        allrows.add(firstRow); 
        
        for(int i = 1; i < numRows; i++) { 
            List<Integer> prev_arr = allrows.get(i-1); 
            List<Integer> row = new ArrayList<>(); 
            
            row.add(1);
            for(int j = 1; j<i; j++) { 
                row.add(prev_arr.get(j-1) + prev_arr.get(j)); 
                
            } 
            row.add(1); 
            allrows.add(row);
        }
        return allrows;
    }
}
}