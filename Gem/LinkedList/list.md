## [delete node in a linkedlist](https://leetcode.com/problems/delete-node-in-a-linked-list/)
- change the node val and next. 

## [reverse a linkedlist](https://leetcode.com/problems/reverse-linked-list/)
- dummy head store prev, and onew store next. 

## [merge two sorted linkedlists](https://leetcode.com/problems/merge-two-sorted-lists/) 
- dummy head, while both are not null, compare val, if a < b, add a to result, else add b. 

## [linkedlist cycle](https://leetcode.com/problems/linked-list-cycle/)
- fast and slow pointer, if fast == slow, there is a cycle. 

## [design linkedlist](https://leetcode.com/problems/design-linkedlist/)


## [linkedlist cycle II](https://leetcode.com/problems/linked-list-cycle-ii/)
- fast and slow pointer, if fast == slow, then begin slow2 from head with slow start from meeting point,  if slow2 == slow, when slow == slow2 begining of cycle.

## [partion linkedlist](https://leetcode.com/problems/partition-list/)
- two list after and bfore, save the head of before and after.  
- 4 dummy node. 

## [even odd linkedlist](https://leetcode.com/problems/odd-even-linked-list/)
- odd -> head, even -> head.next. 
- next odd -> odd.next.next, next even -> even.next.next. 
- save the head of even list.