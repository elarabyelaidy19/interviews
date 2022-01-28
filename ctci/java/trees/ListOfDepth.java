package ctci.trees;

import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.tree.TreeNode;

public class ListOfDepth {
    ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root) { 
        ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>(); 
        LinkedList<TreeNode> current = new LinkedList<TreeNode>(); 
        if(root != null) { 
            current.add(root);
        }

        while(current.size() > 0) { 
            result.add(current); 
            LinkedList<TreeNode> parents = current; 
            current = new LinkedList<TreeNode>();
            for(TreeNode parent : parents) { 
                if(parent.left != null) { 
                    current.add(parent.left);
                }
                if(parent.right != null) { 
                    current.add(parent.right);
                }
            }

        }
        return result;
    }
}
