import java.util.ArrayList;

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
        String[] st = s.split(" ");
        int n = st.length;
        for (int i = 0; i < n; i++) {
            sb.append(reverse(st[i]));
            sb.append(" ");
        }
        return sb.toString().trim();
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
}
