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

require 'set'
def is_uniqu?(str) 
    set = Set.new
    len = str.length

    str.each_char do |i| 
        set.add(i) 
    end 
    return len == set.length
end 



def is_uniqu?(str) 
    arr = str.chars.sort! 
    arr.each_cons(2) { |a, b| return false if a == b }   
    true
end 



def permutaion(s, t) 
    sorted_s = s.chars.sort! 
    sorted_t = t.chars.sort!

    sorted_s == sorted_t
end

puts permutaion('fff', 'ff') 


def permutaion(s,t) 
    return false if s.length != t.length 
    nums_of_chars = [0] * 128 

    for i in 0..s.length - 1 
        curr = s[i].ord - 'a'.ord 
        nums_of_chars[curr] += 1 
    end 
    for i in 0..t.length - 1 
        curr = t[i].ord - 'a'.ord 
        nums_of_chars[curr] -= 1 

        return false if nums_of_chars[curr] < 0  
    end 
    true 
end 

puts permutaion('fel', 'lef')  



def urlify(str) 
    c = str.chars 
    len = c.length
    spaces = c.count(' ')   
    new_length = len + spaces*2 
    c1 = ""
    for i in (len-1..0) 
        if (c[i] == ' ') 
            c1[new_length - 1] = '0'
            c1[new_length - 2] = '2'
            c1[new_length - 3] = '%'
            new_length -= 3 
        else 
            c1[new_length] = c[i] 
            new_length -= 1 
        end 
    end 
    return c1
end 

puts urlify('Mr John Smith') 
