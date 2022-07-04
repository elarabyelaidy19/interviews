# Traverse a Tree 

## - Preorder: Root, Left, Right
```ruby 
def preorder_traversal(root) 
    return [] if root.nil?
    res = [] 
    pre(root, res)
end

def pre(root, res) 
    return res if root.nil? 
    res << root.val 
    pre(root.left, res) 
    pre(root.right, res) 
end 


def preorder_traversal(root) 
    return [] if root.nil?
    stack = [root] 
    res = [] 
    while !stack.empty? 
        first = stack.pop 
        res << first.val  
        stack << first.right if first.right
        stack << first.left if first.left
      
    end 
    res 
end 
```

## - Inorder: Left, Root, Right 

```ruby 
def inorder_traversal(root)
    return [] if root.nil? 
    res = [] 
    inorder(root, res) 
    res
end

def inorder(root, res) 
    return res if root.nil? 
    inorder(root.left, res) 
    res << root.val 
    inorder(root.right, res)
end 


def inorder_traversal(root)
    return [] if root.nil? 
    stack = [] 
    res = [] 
    while !stack.empty? || root 
        while root
            stack << root
            root = root.left 
        end  
        root = stack.pop 
        res << root.val
        root = root.right
    end     
    res
end  
```
- Postorder: Left, Right, Root
    - when deleting 
    - in mathematical expression, it is called postorder 


```ruby 
    def postorder(root) 
        return [] if root.nil? 
        res = [] 
        post(root, res)
    end 

    def post(root, res) 
        return res if root.nil? 

        post(root.left, res) 
        post(root.right, res) 
        res << root.val
    end  



    # Iterative 
    def postorder_traversal(root)
        res = [] 
        return res if root.nil?
        stack = [root]  
        while stack.any? 
            curr = stack.pop   
            next if curr.nil?
            res << curr.val  
            stack << curr.left
            stack << curr.right 
            
        end 
        res.reverse
    end 
```


- inorder traversal of binary search tree is sorted. 
- deleting a node process happen in postorder. left child is deleted first and then right child.


## Level Order Traversal 

```ruby 
def level_order(root)
    res = [] 
    return res if root.nil?
    queue = [root] 
    while queue.any?  
        curr_level = []
        queue.size.times do 
            ele = queue.shift 
            curr_level << ele.val  
            queue.push(ele.left) if ele.left 
            queue.push(ele.right) if ele.right
        end  
        res << curr_level 
    end 
    res
end
```