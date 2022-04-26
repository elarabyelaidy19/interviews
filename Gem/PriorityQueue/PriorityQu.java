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

    public int kthLargestElement2(int[] nums, int k) { 
        PriorityQueue<Integer> pq = new PriorityQueue<>(); 
        for(int num : nums) { 
            pq.add(num); 
            if(pq.size() > k) // maintains the size of pq to be equal k
                pq.poll();
        }
        return pq.peek();
    }

    // ================================================================= 
    // find median from data stream.
    class MedianFinder { 
        private PriorityQueue<Integer> small = new PriorityQueue<>((a, b) -> b - a);
        private PriorityQueue<Integer> large = new PriorityQueue<>();

        public void addNum(int num) {
            large.offer(num);
            small.offer(large.poll());
            if (small.size() > large.size())
                large.offer(small.poll());
        }

        public double findMedian() {
            return large.size() > small.size() ? large.peek() : (small.peek() + large.peek()) / 2.0;
        }
    } 

    class MedianFinder2 {

        private PriorityQueue<Integer> firstHalf;
        private PriorityQueue<Integer> secondHalf;

        public MedianFinder2() {
            firstHalf = new PriorityQueue<Integer>((a, b) -> b - a);
            secondHalf = new PriorityQueue<Integer>();
        }

        public void addNum(int num) {
            if (firstHalf.size() == 0 || num <= firstHalf.peek()) {
                firstHalf.add(num);
                if (firstHalf.size() > secondHalf.size() + 1)
                    secondHalf.add(firstHalf.poll());
            } else {
                secondHalf.add(num);
                if (secondHalf.size() > firstHalf.size())
                    firstHalf.add(secondHalf.poll());
            }
        }

        public double findMedian() {
            if (firstHalf.size() > secondHalf.size()) {
                return 1.0 * firstHalf.peek();
            } else {
                double sum = firstHalf.peek() + secondHalf.peek();
                return sum / 2;
            }
        }
    }
}
