## [delete node in a linkedlist](https://leetcode.com/problems/delete-node-in-a-linked-list/)
- change the node val to next val, next to next.next. 

## [reverse a linkedlist](https://leetcode.com/problems/reverse-linked-list/)
- dummy head store prev, and one store next.  
- head point to prev, prev advance, head advance.

## [merge two sorted linkedlists](https://leetcode.com/problems/merge-two-sorted-lists/) 
- dummy head to save start node, while both are not null, compare val, if a < b, add a to result, else add b. 
- if one is null e.g ended before other one, add the other to result.

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

## [delete nth node from end of linkedlist](https://leetcode.com/problems/delete-nth-node-from-end-of-linked-list/)
- two pointer slow and fast, fast ahead of n from slow. 
- when fast.next == null, slow is nth from end. 
- edge case where n is the length of list e.g fast == null return delete head return head.next. 


## [intersect of two linkedlist](https://leetcode.com/problems/intersection-of-two-linked-lists/)
- calc length of each list, align the longer list to the shorter list. 
- return node when headA == headB.

last three problems in interview.school still.