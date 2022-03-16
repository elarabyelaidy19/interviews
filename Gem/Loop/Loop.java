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
}