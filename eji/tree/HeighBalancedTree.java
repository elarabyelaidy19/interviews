package eji.tree;

public class HeighBalancedTree { 
    private static class BalancedWithHeight { 
        public boolean balanced; 
        public int height;

        public BalancedWithHeight(boolean balanced, int height) { 
            this.balanced = balanced; 
            this.height = height; 
        }


    }

    public static boolean isBalanced(BinaryTreeNode<Integer> tree) { 
        return isBalanced(tree).balanced; 
    }


    private static BalancedWithHeight isBalanced(BinaryTreeNode<Integer> tree) { 
        if(tree == null) { 
            return new BalancedWithHeight(true, -1);
        }

        BalancedWithHeight leftTree = isBalanced(tree.left); 
        if(!leftTree.balanced) { 
            return leftTree;
        }

        BalancedWithHeight rightTree = isBalanced(tree.right); 
        if(!rightTree.balanced) { 
            return rightTree;
        }

        boolean balanced= Math.abs(leftTree.height - rightTree.height) <= 1; 
        int height = Math.max(leftTree.height, rightTree.height) + 1; 
        return new BalancedWithHeight(balanced, height);
        
    }

}