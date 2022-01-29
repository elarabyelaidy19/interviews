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


    static void URLify(String s) { 
        char[] c = s.toCharArray();
        int length = s.length();
        int spaceCount = 0; 
        int newLength = 0; 

        for(int i = 0; i < c.length; i+=1) { 
            if(c[i] == ' ') 
                spaceCount++;
        }

        newLength = length + (spaceCount * 2); 
        char[] c1 = new char[newLength];
        for(int i = length - 1; i >= 0 ; i--) { 
            if(c[i] == ' ') { 
                c1[newLength-1] = '0'; 
                c1[newLength-2] = '2';
                c1[newLength-3] = '%';
                newLength -= 3;
            } else { 
                c1[newLength-1] = c[i]; 
                newLength--;
            } 
        }
    }

    public static void main(String[] args) {
        URLify("the dog left");
    }

}

