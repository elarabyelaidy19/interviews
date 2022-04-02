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

    public boolean validMountain(int[] arr) { 
        if(arr.length < 3) return false;
        int l = 0; 
        int r = arr.length-1;  
        while(l+1 < r && arr[l] < arr[l+1]) l++; 
        while(r-1 > 0 && arr[r] < arr[r-1]) r--; 
        return l == r;
    }
}