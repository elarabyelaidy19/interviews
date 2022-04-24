package Gem.LinkedList;

import java.util.List;

import javax.imageio.plugins.tiff.FaxTIFFTagSet;

public class LinkedList {  

    class ListNode {
      int val;
      ListNode next;
      public ListNode(int x) { val = x; }
    }
    public void deleteNode(ListNode node) {
        if (node == null || node.next == null)
            return;
        node.val = node.next.val;
        node.next = node.next.next;
    } 


    public ListNode reversLinkedList(ListNode head) { 
        if(head == null) return head; 
        ListNode prevNode = null; 
        while(head != null) { 
            ListNode nextNode = head.next; 
            head.next = prevNode; 
            prevNode = head;  
            head = nextNode; 
        }
        return head;
    }

    // ================================================== 
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        curr.next = l1 != null ? l1 : l2;
        return dummy.next;
    } 


    // ========================================================= 
    // detct if linked list has cycle
    public boolean hasCycle(ListNode head) { 
        ListNode slow = head; 
        ListNode fast = head; 
        while(fast != null && fast.next != null) { 
            fast = fast.next.next; 
            slow = slow.next; 
            if(fast == slow) 
                return true;
        }
        return false;
    }

    // =========================================================== 
    // start point of cycle

    public ListNode detectCycle(ListNode head) { 
        ListNode slow = head; 
        ListNode fast = head; 
        while(fast != null && fast.next != null) { 
            fast = fast.next.next; 
            slow = slow.next; 
            if(slow == fast) { 
                ListNode slow2 = head;
                while(slow == slow2) { 
                    slow = slow.next; 
                    slow2 = slow2.next;
                }
            }
            return slow;
        }
        return null;
    } 


    //===================================================================== 
    // partition linkedlist every node less than x left, greater than goes right 
    public ListNode partition(ListNode head, int x) { 
        ListNode beforeHead = new ListNode(0); // save left list head
        ListNode before = beforeHead; 
        ListNode afterHead = new ListNode(0); // save right list head
        ListNode after = afterHead;  

        while(head != null) { 
            if(head.val < x) { 
                before.next = head; 
                before = before.next; 
            } else { 
                after.next = head; 
                after = after.next;
            }
            head = head.next;
        }

        after.next = null; 
        before.next = afterHead.next; 
        return beforeHead.next;

    }
}