

public class HashMap {
    class ListNode { 
        int key; 
        int val; 
        ListNode next; 
        public ListNode(int key, int val, ListNode next) { 
            this.key = key; 
            this.val = val; 
            this.next = next; 
        }
    }

    static final int size = 19997; 
    static final int mul = 12582917; 
    
    ListNode[] data; 
    public HashMap() { 
        this.data = new ListNode[size];
    }

    private int hash(int key) { 
        return (int)((long)key * mul % size);
    }

    public void remove(int key) { 
        int i = hash(key); 
        ListNode node = data[i]; 
        if(node == null) return; 
        if(node.key == key) data[i] = node.next; 
        else for(; node.next != null; node = node.next) { 
            if(node.next.key == key) {
                node.next = node.next.next; 
                return; 
            } 
        } 
    }

    public void put(int key, int val) { 
        remove(key); 
        int i = hash(key); 
        ListNode node = new ListNode(key, val, data[i]);
        data[i] = node;
    }

    public int get(int key) { 
        int i = hash(key); 
        ListNode node = data[i]; 
        for(; node != null; node = node.next) { 
            if(node.key == key)  
                return node.val;
        }
        return -1;
    }
}
