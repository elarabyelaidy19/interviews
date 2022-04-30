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
}
