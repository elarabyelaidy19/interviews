package ctci.arrstring;

import java.util.Arrays;

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

    public boolean isPermutauion(String s, String t) { 
        if(s.length() != t.length()) 
            return false;

        return sort(s).equals(sort(t));
    }

    public String sort(String s) { 
        char[] chars = s.toCharArray(); 
        Arrays.sort(chars); 
        return new String(chars);

    } 

    boolean isPermutauion2(String s, String t) { 
        if(s.length() != t.length()) 
            return false; 

        int[] letters = new int[128]; 
        char[] char_set = s.toCharArray(); 

        for(char c : char_set) 
            letters[c]++;  // frquency array
        
        for(int i = 0; i < t.length(); i++) { 
            int c = (int) t.charAt(i); 
            letters[c]--; 
            if(letters[c] < 0) {
                return false;
        
            }
        }
        return true;

    }


} 
