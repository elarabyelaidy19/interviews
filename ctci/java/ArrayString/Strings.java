package ctci.java.ArrayString;

import java.util.HashSet;
import java.util.Set;

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


    
}
