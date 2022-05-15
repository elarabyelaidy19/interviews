import java.util.ArrayList;
import java.util.List;

public class Subsets { 
    // // generate all "non-duplicates" subsets of a given array
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        output.add(new ArrayList<Integer>());

        for (int num : nums) {
            int size = output.size();
            for (int i = 0; i < size; i++) {
                List<Integer> subset = new ArrayList<>(output.get(i));
                subset.add(num);
                output.add(subset);
            }
        }
        return output;
    }
}