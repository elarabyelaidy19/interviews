package Gem.Trees;

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

    // =========================================== 
    class RecoverTree {
        TreeNode first = null;
        TreeNode second = null;
        TreeNode prev = null;

        public void recoverTree(TreeNode root) {
            inorder(root);
            int temp = first.val;
            first.val = second.val;
            second.val = temp;
        }

        void inorder(TreeNode root) {

            if (root == null)
                return;
            inorder(root.left);
            if (first == null && (prev == null || prev.val >= root.val))
                first = prev;
            if (first != null && prev.val >= root.val)
                second = root;
            prev = root;
            inorder(root.right);
        }
    } 


    // ============================================================================== 
    // max depth of a tree 

    public int maxDepth(TreeNode root) {

        if (root == null)
            return 0;

        Stack<TreeNode> nodes = new Stack<>();
        Stack<Integer> depths = new Stack<>();
        int max = 1;

        nodes.push(root);
        depths.push(1);
        while (!nodes.empty()) {
            TreeNode current = nodes.pop();
            int depth = depths.pop();
            
            if (current.left == null && current.right == null) {
                max = Math.max(depth, max);
            }
            if (current.left != null) {
                nodes.push(current.left);
                depths.push(depth + 1);
            }
            if (current.right != null) {
                nodes.push(current.right);
                depths.push(depth + 1);
            }
        }
        return max;
    }
} 
