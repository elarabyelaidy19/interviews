def is_uniqu?(str) 
    arr = [] 
    len = str.length - 1

    for i in 0..len 
        if arr.include?(str[i]) 
            return false 
        end 
        arr << (str[i]) 
    end 
    return true
end  

puts is_uniqu?('slbma')


def is_unique(str) 
    arr = [false] * 128  
    len = str.length - 1
    return false if len > 128 
    
    for i in 0..len 
        curr = str[i].ord - 'a'.ord
        return false if arr[curr]  
        arr[curr] = true 
    end 
    
    return true
end 

puts is_unique('beeby') 
puts is_unique('string') 
puts is_unique('blaha') 


require 'set'
def is_uniqu?(str) 
    set = Set.new
    len = str.length

    str.each_char do |i| 
        set.add(i) 
    end 
    return len == set.length
end 

puts is_uniqu?('bel')


def is_uniqu?(str) 
    arr = str.chars.sort! 
    arr.each_cons(2) { |a, b| return false if a == b }   
    true
end 

puts is_uniqu?('slata')
    