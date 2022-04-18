package Gem.Trees;

import java.utils.LinkedList;

public class Trees { 

    class TreeNode {
        
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

       TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
        }
    }
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null)
            return root;
        if (root.val < low)
            return trimBST(root.right, low, high);
        if (root.val > high)
            return trimBST(root.left, low, high);

        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);

        return root;
    }

   // =====================================================================
    class Solution {
        private int sum = 0;

        public TreeNode convertBST(TreeNode root) {

            if (root != null) {
                convertBST(root.right);
                sum += root.val;
                root.val = sum;
                convertBST(root.left);
            }
            return root;
        }
    }

    // ===================================================================== 
    public TreeNode increasingBST(TreeNode root) {
        return increasingBST(root, null);
    }

    public TreeNode increasingBST(TreeNode root, TreeNode next) {
        if (root == null)
            return next;
        TreeNode res = increasingBST(root.left, root);
        root.left = null;
        root.right = increasingBST(root.right, next);
        return res;
    }


    // ===================================================================== 

    public int kthSmallest(TreeNode root, int k) {
        LinkedList<TreeNode> stack = new LinkedList<>();

        while (true) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (--k == 0)
                return root.val;
            root = root.right;
        }
    }
} 
