import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;

public class Strings {
    
    // reverse words in string -> reverse phrase

    public String reveString(String s) { 
        String[] strs = s.split(" "); 
        StringBuilder sb = new StringBuilder(); 
        int n = strs.length; 
        for(int i = n-1; i >= 0; i--) { 
            if(strs[i].length() == 0) 
                continue; 
            if(sb.length() > 0) 
                sb.append(' '); 
            sb.append(strs[i]);
        }
        return sb.toString();
    } 

    // ============================================================================ 
    // format string each group of length k seprated by dash
    
    public String formaString(String s, int k) { 
        StringBuilder sb = new StringBuilder();
        int n = s.length(); 
        for(int i = n-1; i >= 0; i--) { 
            if(s.charAt(i) == '-') 
                continue; 
            if(sb.length() % (k+1) == k) // append dash when sb % k == 0 == sb.length (4) % (4+1) == 4 
                sb.append('-'); 
            sb.append(Character.toUpperCase(s.charAt(i))); 
        }
        return sb.reverse().toString();
    }

    // ================================================================================================ 
    // string to integer function
    public int myAtoi(String str) { 
        if(str.length() == 0 || str == null) 
            return 0; 
        
        double result = 0.0; 
        int sign = 1; 
        boolean numStarted = false; 

        for(char c : str.toCharArray()) { 
            if(numStarted && !Character.isDigit(c)) 
                break;
            if(c == '+') { 
                sign = 1; 
                numStarted = true;
            } else if(c == '-') { 
                sign = -1; 
                numStarted = true;
            } else if(Character.isDigit(c)){ 
                result = result*10 + c - '0'; // c-'0' convert char to int
                numStarted = true;
            } else if(c != ' ') { 
                return 0;
            }
        }
        result *= sign; 
        if(result > Integer.MAX_VALUE) { 
            return Integer.MAX_VALUE;
        }
        if(result < Integer.MIN_VALUE) { 
            return Integer.MIN_VALUE;
        } 
        
        return (int)result;
    }

    // ========================================================================================
    // reverse each word in sentence
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] st = split(s);
        int n = st.length;
        for (int i = 0; i < n; i++) {
            sb.append(reverse(st[i]));
            sb.append(" ");
        }
        return sb.toString().trim(); // trim eleminates leading and trailing spaces
    }

    public String[] split(String s) {
        ArrayList<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                res.add(sb.toString());
                sb = new StringBuilder();
            } else {
                sb.append(s.charAt(i));
            }
        }
        res.add(sb.toString());
        return res.toArray(new String[res.size()]);

    }

    public String reverse(String word) {
        int r = word.length() - 1;
        StringBuilder sb = new StringBuilder();
        while (r >= 0) {
            sb.append(word.charAt(r));
            r--;
        }
        return sb.toString();

    } 


    // ================================================================================= 
    // compare version number 
    public int versionNumber(String version1, String Version2) { 
        String[] v1 = version1.split("\\."); 
        String[] v2 = Version2.split("\\."); 

        for(int i = 0; i < Math.max(v1.length, v2.length); i++) { 
            int num1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;  
            int num2 = i < v2.length ? Integer.parseInt(v2[i]) : 0; 

            if(num1 > num2) { 
                return 1;
            } else if (num2 > num1) { 
                return -1;
            }
        }
        return 0;
    } 

    // ==================================================================  
    // return the length of absolute path of file
     public int lengthLongestPath(String input) {
        Stack<Integer> stack = new Stack<>(); 
        String[] arr = input.split("\n"); 
        stack.push(0);
        int maxLen = 0; 

        for(String s :arr) { 
            int numOfTabs = s.lastIndexOf("\t") + 1; // +1 lastindexOf it will return / not /t, and make level 0 if return -1
            int level = numOfTabs + 1; 

            while(stack.size() > level) stack.pop();             
            int curLen = stack.peek() + s.length() - numOfTabs + 1; // + indicates / inth absolute path 
            stack.push(curLen); 
            if(s.contains(".")) maxLen = Math.max(maxLen, curLen-1);
        }
        return maxLen;
    } 

    // ============================================================================= 
    // simplify file given some filesystem movement return the result after doing this commands
    public String simplifyPaths(String s) { 
        Deque<String> stack = new LinkedList<>(); 
        StringBuilder sb = new StringBuilder(); 
        for(String dir : s.split("/")) { 
            if(dir.equals("..") && !stack.isEmpty()) stack.poll(); 
            else if(!dir.equals("") && !dir.equals(".")) stack.push(dir);
        }
        while(stack.size() != 0) sb.append("/").append(stack.pollLast()); 
        return stack.isEmpty() ? "/" : sb.toString();
    }

    // ================================================================= 
    // params sentence, check if word start with vowel append "ma" + i * "a", else append first chars at end + "ma" + i * "a". i => index of word

    public String goatLatin(String s) { 
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')); 
        String[] words = s.split(" "); 
        int count = 0; 
        StringBuilder sb = new StringBuilder(); 

        for(String word : words) {
            count++; 
            if(count > 1) sb.append(" "); // start append spaces after first word 
            if(set.contains(word.charAt(0))) { 
                sb.append(word);
            } else { 
                sb.append(word.substring(1) + word.charAt(0)); // substring from index 1 to end then append first char
            }
            sb.append("ma"); 
            for(int j = 0; j < count; j++) { 
                sb.append("a");
            }
        }
        return sb.toString();
    }
}
