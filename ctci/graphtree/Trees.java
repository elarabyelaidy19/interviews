package ctci.graphtree;

public class Trees { 
    TreeNode createMinimalBST(int[] array) { 
        createMinimalBST(array, 0, array.length - 1);
    }

    TreeNode createMinimalBST(int[] array, int start, int end) { 
        if(start > end) { 
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(array[mid]); 
        node.left = createMinimalBST(array, start, mid); 
        node.right = createMinimalBST(array, mid+1, end); 
        return node;

    }
    
}
