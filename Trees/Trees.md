## [trim tree](https://leetcode.com/problems/trim-a-binary-search-tree/)
- goes left or right depending on the value of the current node 

## [convert bst to greater tree](https://leetcode.com/problems/convert-bst-to-greater-tree/)
-  

## [kth smallest element in bst](https://leetcode.com/problems/kth-smallest-element-in-a-bst/)
- 

## [recover binary search tree](https://leetcode.com/problems/recover-binary-search-tree/) 
-  

## [has path sum](https://leetcode.com/problems/path-sum/) 
- recurively check if the current node has the sum of the path pathSum - currentNode.val.
- base case: if currentNode if both left and right are null and the sum of the path is 0, return true. 

## [construct binary tree from postorder and inorder traversal](https://leetcode.com/problems/construct-binary-tree-from-postorder-and-inorder-traversal/) 
- find root from postorder(last element) and inorder traversal. map each node to its index in the inorder traversal. 
- recursively find the left and right subtrees. left subtree is the subarray from inorder[start] to inorder[rootIndex-1], right subtree is the subarray from inorder[rootIndex+1] to inorder[end]. 
- recursively find the left and right subtrees for postorder[start] to postorder[start+leftlen], postorder[end-rightLen-1] to postorder[end-1].
- leftLen = rootIndex - startInorder - 1, rightLen = Inorderend - rootIndex - 1. 

## [construct binary tree from inorder and preorder traversal](https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/) 
- same as postorder and inorder traversal. but the difference is that the preorder[first] traversal is the root.

## [populating next right pointers in each node](https://leetcode.com/problems/populating-next-right-pointers-in-each-node/) 
- traverse level by level every root.left.next = root.right. and root.right.next = root.next.left.
- keep of the root node.

## [populating next right pointers in each node II](https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/)
- every change to dummy node is also reflected on the end node.
- 

## [lowest common ancestor](https://leetcode.com/problems/lowest-common-ancestor/)
- if root is null, return root. base case 
- if root == p or root == q, return root. base case 
- traverse left and right subtree. the retunrn value from both is the lowest common ancestor. left and right should not be null **there some value return which is either p or q.** 