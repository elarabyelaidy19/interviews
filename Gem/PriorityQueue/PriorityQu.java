package Gem.PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQu {
    // find kth largest ele in array
    public int kthLargestElement(int[] nums, int k) { 
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a); 
        
        for(int i = 0; i < nums.length; i++) 
            pq.add(nums[i]); 

        int val = 0; 
        while(k > 0) { 
            val = pq.poll(); 
            k--;
        }
        return val;
    }
}
