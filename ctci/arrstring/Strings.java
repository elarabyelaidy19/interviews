package ctci.arrstring;


public class Strings { 
    public boolean isUnique(String str) { 
        if(str.length() > 128) // 128 indecates the number of unique chars in ascii code  
            return false; 
        
        boolean[] charSet = new boolean[128]; // array of boolean values indecates the presence of a char 
        for(int i = 0; i < str.length(); i+= 1) { 
            int val = str.charAt(i); // 
            if(charSet[val]) { // if the value at the given index is true return false 
                return false; 
            }
            charSet[val] = true; // set the value of the index to true 
        } 
        return true;
    }


} 
