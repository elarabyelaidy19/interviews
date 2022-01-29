package ctci.java.ArrayString;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.print.FlavorException;

public class Strings {
    
    boolean isUnique(String str) { 
        if (str.length() > 128) 
            return false; 
        
        boolean[] char_set = new boolean[128]; 

        for(int i = 0; i < str.length(); i++) { 
            int flag = str.charAt(i);
            if(char_set[flag]) 
                return false;
            char_set[flag] = true;  
        }
        return true;
    }

    boolean isUnique2(String str) { 
        HashSet<Character> set = new HashSet<>();

        for(int i = 0; i < str.length(); i++) { 
            set.add(str.charAt(i));
        }
        return set.size() == str.length();
    }


    //////////////////////////////////////////////////////// 

    boolean permutation(String s, String t) {  
        if(s.length() != t.length()) 
            return false;

        return sort(s).equals(sort(t));
    }

    String sort(String s) { 
        char[] chars = s.toCharArray(); 
        Arrays.sort(chars); 
        return new String(chars);
    }

    boolean permutation2(String s, String t) { 
        if(s.length() != t.length()) 
            return false; 

        int[] counter = new int[128]; 

        for(int i = 0; i < s.length(); i++) { 
            counter[s.charAt(i)]++;
        }

        for(int i = 0; i < t.length(); i++) { 
            int curr = (int) t.charAt(i);
            counter[curr]--; 
            if(counter[curr] < 0) 
                return false;
        }
        return true;
    } 



    
}
