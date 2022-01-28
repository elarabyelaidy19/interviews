package ctci.trees;

import javax.swing.tree.TreeNode;

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

    // Q4 CTCI  Sol 1

    int getHeight(TreeNode root) { 
        if(root == null) { 
            return -1;
        }
        return Math.max(getHeight(root.left),getHeight(root.right)) + 1;
    }

    boolean isBalanced(TreeNode root) { 
        if(root == null ){ 
            return true;
        }
        
        int heighDiff = getHeight(root.left) - getHeight(root.right); 

        if(Math.abs(heighDiff) > 1) { 
            return false;
        }else { 
            return isBalanced(root.left) && isBalanced(root.right);
        }

    } 


    // Sol 2
    int checkHeight(TreeNode root) { 
        if(root == null) {
            return -1;
        }

        int leftHeight = checkHeight(root.left); 
        if(leftHeight == Integer.MIN_VALUE) { 
            return Integer.MIN_VALUE;
        }

        int rightHeight = checkHeight(root.right); 
        if(rightHeight == Integer.MIN_VALUE) { 
            return Integer.MIN_VALUE;
        }

        int heighDiff = leftHeight - rightHeight;
        if(Math.abs(heighDiff) > 1) { 
            return Integer.MIN_VALUE;
        }else { 
            return Math.max(rightHeight, leftHeight) + 1;
        }
    }

    boolean isBalanced2(TreeNode root) { 
        return checkHeight(root) != Integer.MIN_VALUE;
    }
    
}
