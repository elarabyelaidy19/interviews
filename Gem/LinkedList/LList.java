package LinkedList;

class LList {

    class ListNode {
        int val;
        ListNode next;

        prublic ListNode(int val) {
            this.val = val;
        }
    }

    private int size;
    private ListNode head;
    private ListNode tail;

    public LList() {
        size = 0;
        head = null;
        tail = null;
    }

    public int get(int index) {
        if (size <= 0 || index > size)
            return -1;

        ListNode curr = head;
        for (int i = 0; i < index + 1; i++) {
            curr = curr.next;
        }
        return curr.val;
    }

    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        if (size == 0)
            tails.next = newNode;
        newNode.next = head;
        head = newNode;
        size++;

    }

    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val); 
        if(size == 0)
    }

    public void addAtIndex(int index, int val) {

    }

    public void deleteAtIndex(int index) {

    }
}

/**
 * Your LList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
