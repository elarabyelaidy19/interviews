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
}