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



    //==================================================================================================== 
    // combination sum 

    public List<List<Integer>> combinationSum(int[] nums, int target) { 
        List<List<Integer>> subs = new ArrayList<>();
        List<Integer> sub = new ArrayList<>(); 
        int[] candidates = new int[nums.length];
        solve(subs, sub, candidates, 0, target);
        return subs;
    } 

    private void solve(List<List<Integer>> subs, List<Integer> sub, int[] nums, int i, int target) {  
        if(target == 0) { 
            subs.add(new ArrayList<>(sub));
            return;
        }
        if(target < 0 || i >= nums.length) { 
            return;
        } else { 
            sub.add(nums[i]); 
            solve(subs, sub, nums, i, target-nums[i]);

            sub.remove(sub.get(sub.size()-1)); 
            solve(subs, sub, nums, i+1, target);
        }
    } 



    // =========================================================================================== 
    public List<List<Integer>> subsets1(int[] nums) { 
        List<List<Integer>> subsets = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        backtrack(nums, 0, subset, subsets);
        return subsets;
    } 

    private void backtrack(int[] nums, int start, List<Integer> subset, List<List<Integer>> subsets) { 
        if(start >= nums.length) { 
            subsets.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[i]); 
        backtrack(nums, start+1, subset,subsets); 

        subset.remove(subset.get(subset.size()-1)); 
        backtrack(nums, start+1, subset, subsetss);
    }

}