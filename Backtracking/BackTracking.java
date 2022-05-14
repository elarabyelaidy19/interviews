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
}