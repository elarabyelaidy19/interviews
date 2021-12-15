# Binary Tree 

## Binary Trees
- Full Binary Tree
    * A full binary tree is a binary tree in which every node has either zero or two children. That is, no nodes have
only one child. 
- Compplete Binary Tree  
    * complete binary tree are binary heaps. 
    * complete binary tree have all levels filled except for perhabs the last level.
- Perfect Binary Tree 
    * perfect binary tree have all levels filled and on the same level.
## Traversing Binary Trees 
 - inorder traversal 
    * left, node, right     -> `6 8 9 10 11 12 13`
 - preorder traversal   
    * node, left, right     -> `10 8 6 9 12 11 13` 
 - postorder traversal 
    * left, right, node.    -> `16 9 8 11 13 12 10` 

                   10
                  /  \ 
                 8   12  
                / \  / \ 
               6  9 11  13 

- Balanced Binary Tree 
    * |left subtree height - right subtree height| <= 1.
    * height of a tree equal number of edges from the deepest leave to the nodes. 
    * deapth num of edges from the root to deepest leave of the tree. 
    * null root is balanced and height -1
- skewed tree 
    * is a type of binary tree in which all the nodes have only one child or no child. 
