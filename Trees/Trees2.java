
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
}
