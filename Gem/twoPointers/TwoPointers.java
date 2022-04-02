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
}