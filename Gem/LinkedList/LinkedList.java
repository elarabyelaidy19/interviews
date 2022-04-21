package Gem.LinkedList;

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
}