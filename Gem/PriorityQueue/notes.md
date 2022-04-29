# Priority Queue 

## [find kth largest element in an array](https://leetcode.com/problems/kth-largest-element-in-an-array/)
- build max heap of array, pool k largest elements. **O(NLogn)**

## [find median from data stream](https://leetcode.com/problems/find-median-from-data-stream/)
- maintain two heaps, one for smaller half and one for larger half. **O(NLogN)** 
- maintain a max heap of size k, and a min heap of size k+1. 
- if the size of the two heaps is equal, then the median is the average of the top of the two heaps. 
- if the size of the two heaps is not equal, then the median is the top of the larger heap.


## [kth smallest element in a matrix](https://leetcode.com/problems/kth-smallest-element-in-a-matrix/)
- **O(N*M Logk)**
- build max heap of matrix, pool k smallest elements.  

## [top k frequent elements](https://leetcode.com/problems/top-k-frequent-elements/) 
- **O(NLogK)**
- map each element to its frequency, min heap of most frequent heapifyied by val. 
- keep most frequent k elements only in the heap. 
- output array of heap elements.

## [top k frequent words] (https://leetcode.com/problems/top-k-frequent-words/)
- **O(NLogK)** 
- map each word to its frequency, min heap of most frequent words sorted lex. 
- 