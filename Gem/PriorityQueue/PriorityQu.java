package Gem.PriorityQueue;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

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
        private PriorityQueue<Integer> small = new PriorityQueue<>((a, b) -> b - a); // max heap
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
    // 2
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

    // ================================================================ 
    // find kth largest element in sorted matrix 
    // O(N*M Logk) 
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> b - a);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                int curr = matrix[i][j];
                pq.offer(curr);
                if (pq.size() > k)
                    pq.poll();
            }
        }
        return pq.peek();
    }


    // ========================================================================== 
    // find top freq elemnts in array 
    public int[] topKFreqElements(int[] nums, int k) { 
        Map<Integer, Integer> count = new HashMap<>();
        // map each val to it's freq
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        // heap maintains the less frequnt first
        Queue<Integer> pq = new PriorityQueue<>((a, b) -> count.get(a) - count.get(b));

        // keep the top frequnt elements only in the heap
        for (int n : count.keySet()) {
            pq.add(n);
            if (pq.size() > k)
                pq.poll();
        }

        // output array of pq elemnt
        int[] topK = new int[k];
        for (int i = 0; i < k; i++)
            topK[i] = pq.poll();

        return topK;
    }

    // =========================================================================================== 
    // top k frequent words sorted lexic
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        Queue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
                (a, b) -> a.getValue() == b.getValue() ? b.getKey().compareTo(a.getKey())
                        : a.getValue() - b.getValue());

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            pq.add(entry);
            if (pq.size() > k)
                pq.poll();
        }

        List<String> res = new ArrayList<>();
        while (!pq.isEmpty()) {
            res.add(0, pq.poll().getKey());
        }
        return res;

    } 

    // ====================================================================== 
    // merge k sorted lists
    public ListNode mergeKSortedList(ListNode[] lists) { 
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(ListNode head : lists) { 
            while(head != null) { 
                pq.offer(head.val); 
                head = head.next; 
            }
        }

        ListNode dummy = new ListNode(0); 
        ListNode curr = dummy;

        while (!pq.isEmpty()) {
            curr.next = new ListNode(pq.poll()); 
            curr = curr.next;
        }
        return dummy.next;
    }

    // ===========================================================
}
