package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class BackTracking { 
    // generate all "non-duplicates" subsets of a given array
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> out = new ArrayList<>();
        backtrack(out, new ArrayList<>(), nums, 0);
        return out;
    }

    public void backtrack(List<List<Integer>> outList, List<Integer> subList, int[] input, int start) {
        outList.add(new ArrayList<>(subList));
        for (int i = start; i < input.length; i++) {
            
            subList.add(input[i]);
            backtrack(outList, subList, input, i + 1);
            subList.remove(subList.size() - 1);
        }

    } 

    // ========================================================================= 
    // genertae all balnced parenthsis of length n 
    public List<String> generateParenthsis(int n) { 
        List<String> out = new ArrayList<>();
        backtrack(out, "", 0, 0, n); 
        return out;
    }

    public void backtrack(List<String> out, String str, int open, int close, int max) { 
        // base case when open and close parenthes is complete add to out return
        if(str.length() == 2 * max) { 
            out.add(str); 
            return;
        }

        if(open < max) { 
            backtrack(out, str+"(", open+1, close, max); 
        } 
        if(open > close) { 
            backtrack(out, str+")", open, close+1, max);
        }
    }
}