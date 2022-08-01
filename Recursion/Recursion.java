package Recursion;
import java.util.List;

import javax.swing.tree.TreeNode;

import org.w3c.dom.Node;

import java.util.ArrayList;;
public class Recursion {
    // claculate power base recursively 
    public int pow(int base, float exp) { 
        if(exp == 0) return 1; 
        return base * pow(base, exp-1);
    } 

    // calculate lucas number => 2, 1, 3, 4, 7, 11, 
    public int lucas(int n) { 
        if(n == 0) return 2; 
        if(n == 1) return 1; 
        return lucas(n-1) + lucas(n-2);
    } 


    // sum Array recursively 
    public int sumArray(List<Integer> nums) {  
        int n = nums.size()-1;
        if(nums.isEmpty()) return 0;
        return nums.remove(n) + sumArray(nums);
    } 

    // reverse string recusrsivly 
    public String reveString(String Str) { 
        if(Str.length() <= 1) return Str; 
        int n = Str.length()-1; 
        return Str.charAt(n) + reveString(Str.substring(0, n-1));
    }

    // print reverse string recursively 

    public void printReverse(char[] chars) { 
        helper(0, chars);
    } 
    
    public void helper(int index, char[] chars) { 
        if (index == chars.length || chars == null) return; 
        helper(index+1, chars); 
        System.out.println(chars[index]);
    } 


    // ================================================================
    // reverse linked list recursively 
    public TreeNode reverse(TreeNode head) { 
        if(head == null || head.next == null) return head; 
        TreeNode newHead = reverse(head.next); 
        head.next.next = head; 
        head.next = null; 
        return newHead;
    }
    // ================================================================
    public TreeNode reverseLisNode(TreeNode head) { 
        return helperReverse(head, null);
    }
    
    private TreeNode helperReverse(TreeNode curr, TreeNode pre) { 
        if(curr == null) { 
            return pre;
        }

        ListNode nxt = curr.next; 
        curr.next = pre; 
        return helperReverse(nxt, pre);
    } 


    // ====================================================================== 
    // search binary search tree 
    public TreeNode searh_bst(TreeNode head, int val) { 
        if (root == null) return null; 
        if (root.val == val) return head; 
        return root.val > val ? searh_bst(head.left, val) : searh_bst(head.right, val);
    }
}
