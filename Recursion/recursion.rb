def sum(n)  
    return 0 if n == 0 
    puts n
    return n + sum(n-1)
end 

# puts sum(5)

def fib(n) 
    return 0 if n == 0 
    return 1 if n == 1 
    return fib(n-1) + fib(n-2) 
end 

# puts fib(5)

def sum_array(arr) 
    n = arr.length-1  
    return 0 if arr.empty? 
    return arr.pop + sum_array(arr)
end 

# puts sum_array([1,2,3,4,5])
def mul(arr) 
    return 1 if arr.empty?
    n = arr.length-1 
    print arr 
    puts 
    return arr.pop * mul(arr)
end 

# print mul([1,2,3,4,5])
def reverse(str) 
    return str if str.length <= 1 
    n = str.length-1    
    return str[n] + reverse(str[0..n-1])
end  

def reverse_array_chars(str) 
    
end 

puts reverse("string")


def count_down(n) 
    return 0 if n < 1  

    return count_down(n-1)  
end 

# p count_down(10)

def count_up(m, n) 
    return  if m >= n 
    count_up(m+1, n)
end 


def foo 
    g = "enclosed var" 
    p "in foo #{g}"
    def foo2 
        f = "local var"  
        p "in foo2 #{f}" 
        f
    end 
    g = foo2 
end 

f = "Iam global"

# p f 
# p foo 


#!n = n * n-1 * n-2 * n-3 * .... 1
def fact(n) 
    return 1 if n <= 1 
    n * fact(n-1)
end 

fact(5)


$frame = 0 
n = 4 
p "global frame #{$frame} and n = #{n}"
def summ(n) 
    $frame+=1 
    p $frame
    if n == 1    
        p "base case frame #{$frame} and n = #{n}"
        return n 
    else   
        p "recursive frame #{$frame} and n = #{n}"
        r = summ(n-1)  
        #$frame-=1 
        p "recursive frame #{$frame} and n = #{n} and r #{r}"
        return n + r 
    end 
end 

# p summ(n)




def decimal_to_binary(n) 
    return 0 if n == 0 
    bin = 10 * decimal_to_binary(n/2) 
    p "bin is  #{bin} "  
    quo = n % 2 
    p "quo is #{quo}" 

    puts 
    return quo + bin
end 

p decimal_to_binary(17) 


def print_rverse(chars) 
    helper(0, chars)
end 

def helper(idx, chars) 
    return if idx >= chars.size || chars.nil?
    p idx
    helper(idx+1, chars) 
    p idx
    p chars[idx]
end 

p print_rverse('hello') 




def subsequence(str) 
    if str.empty?
        return "" 
    else 
        flitter = str[0] 
        restOfword = str[1..-1]

        subsequence_rest = subsequence(restOfword) 

        res = "" 
        subsequence_rest.split(",",-1).each do |sub| 
            res += "," + sub 
            res += "," + flitter + sub 
        end 
        res = res[1..-1] 
        res 
    end  
end


def  helper2(decimal, res) 
    return res if decimal == 0 
    res = (decimal % 2).to_s + res 
    return helper2(decimal/2, res)
end 

p helper2(133, "")


def search(arr, target) 
    bsearch(arr, target, 0, a)
end 


def bsearch(arr, target, l, r) 
    return  -1 if l > r
    mid = (l + r) / 2 
    if arr[mid] == target 
        return mid 
    elsif arr[mid] > target 
        bsearch(arr, target, l, mid-1)
    else 
        bsearch(arr, target, mid+1, r) 
    end
end 