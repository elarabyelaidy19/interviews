import java.util.HashMap;

public class Trees2 {  

    // ==========================================================
    // construct a binary tree from postorder and inorder traversal. 

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null || inorder.length != postorder.length)
            return null;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTreeNode(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1, map);

    }

    public TreeNode buildTreeNode(int[] inorder, int[] postorder, int startIn, int endIn, int startPost, int endPost,
            HashMap<Integer, Integer> map) {
        if (endPost < startPost || startIn > endIn)
            return null;
        TreeNode root = new TreeNode(postorder[endPost]);
        int rootIndex = map.get(postorder[endPost]);
        TreeNode leftTree = buildTreeNode(inorder, postorder, startIn, rootIndex - 1, startPost,
                startPost + rootIndex - startIn - 1, map);
        TreeNode rightTree = buildTreeNode(inorder, postorder, rootIndex + 1, endIn, startPost + rootIndex - startIn,
                endPost - 1, map);
        root.left = leftTree;
        root.right = rightTree;
        return root;

    } 


    // ============================================================================================================== 
    // construct a binary tree from preorder and inorder traversal. 

    public TreeNode buildTree2(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        TreeNode root = buildTreeNode(preorder, inorder, 0, inorder.length - 1, 0, preorder.length - 1, map);
        return root;
    }

    public TreeNode buildTreeNode2(int[] preorder, int[] inorder, int inStart, int inEnd, int preStart, int preEnd,
            HashMap<Integer, Integer> map) {
        if (inStart > inEnd || preStart > preEnd)
            return null;
        TreeNode root = new TreeNode(preorder[preStart]);
        int rootIndex = map.get(root.val);
        int numsLeft = rootIndex - inStart;
        root.left = buildTreeNode(preorder, inorder, inStart, rootIndex - 1, preStart + 1, preStart + numsLeft, map);
        root.right = buildTreeNode(preorder, inorder, rootIndex + 1, inEnd, preStart + numsLeft + 1, preEnd, map);
        return root;
    } 


    // ============================================================================================================== 
    // Invert Binary Tree 

    public TreeNode invertBinaryTree(TreeNode root) { 
        if(root == null) return null; 
        TreeNode temp = root.left; 
        root.left = root.right; 
        root.right = temp; 
        invertBinaryTree(root.left); 
        invertBinaryTree(root.right); 
        return root;
    } 


    // =============================================================================================================== 
    // search binary search tree  
    public TreeNode searhBST(TreeNode root, int val) { 
        while(root != null && root.val != val) { 
            root = root.val > val ? root.left : root.right;
        }
        return root;
    } 

    // =============================================================================================================== 
    // validate binary search tree
    public boolean isValidBST(TreeNode root) { 
        return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE); 
    }

    public boolean isValidBST(TreeNode root, int min, int max) { 
        if(root == null) return true; 
        if(root.val <= min || root.val >= max) return false; 
        return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max); 
    } 


    // =============================================================================================================== 

    public TreeNode connect(TreeNode root) { 
        TreeNode curr = root; 
        while(curr != null) { 
            TreeNode curr_level = curr; 
            while(curr_level != null) { 
                if(curr_level.left != null) curr_level.left.next = curr_level.right; 
                if(curr_level.right != null && curr_level.next != null) curr_level.right.next = curr_level.next.left; 

                curr_level = curr_level.next;
            } 
            curr = curr.left;
        }
        return root;
    }
}
