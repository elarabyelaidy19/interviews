
public class LList {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
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
        if (index >= size)
            return -1;

        ListNode curr = head;
        while (index > 0) {
            curr = curr.next;
            index--;
        }
        return curr.val;
    }

    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
        if (tail == null)
            tail = head;
        size++;

    }

    public void addAtTail(int val) {
        if (head == null) {
            addAtHead(val);
            return;
        }
        tail.next = new ListNode(val);
        tail = tail.next;
        size++;
    }

    public void addAtIndex(int index, int val) {

        if (index > size)
            return;

        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index == size) {
            addAtTail(val);
            return;
        }

        ListNode newNode = new ListNode(val);
        ListNode curr = head;
        while (curr != null && index > 1) {
            curr = curr.next;
            index--;
        }

        newNode.next = curr.next;
        curr.next = newNode;
        size++;
    }

    public void deleteAtIndex(int index) {

        if (index >= size) {
            return;
        }

        if (index == 0) {
            deleteHead();
            return;
        }

        ListNode curr = head;
        while (curr != null && index > 1) {
            curr = curr.next;
            index--;
        }

        curr.next = curr.next.next;
        if (curr.next == null)
            tail = curr;
        size--;
    }

    public void deleteHead() {
        head = head.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */