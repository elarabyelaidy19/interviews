edge_list = [[1,2], [2,3], [2,6], [6,7], [6,9], [7,8]] 

# adjacensy_lits = [ 
#     [1], 
#     [0, 2], 
#     [1,3,], 
# ]

# adjacensy_lits = { 
    
# }

class BinaryTree
    attr_accessor  :value
    attr_reader :left, :right
    def initialize(value)
        @value = value
        @left = nil 
        @right = nil
    end 

    def insert_left(value) 
        @left = BinaryTree.new(value)
    end 

    def insert_right(value)
        @right = BinaryTree.new(value)
    end 

end


def balanced_tree?(root)
    return true unless root

    depths = [] 
    nodes = [] 
    nodes << [root, 0] 

    until nodes.empty? 
        node, depth = nodes.pop 

        if !node.left && node.right 
            
            unless depths.include?(depth) 
                depths.push(depth) 
                if depths.length > 2 || depths.length == 2 && (depths[0] - depths[1] > 1) 
                    return false
                end 
            end 

        else 
            nodes << [node.left, depth+1] if node.left 
            nodes << [node.right, depth+1] if node.right
        end 
    end
    true
end 