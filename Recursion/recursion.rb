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
    print arr 
    puts 
    print n 
    puts
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
    puts 
    print n 
    puts
    print str[0..n-1]
    puts 
    print str[n]   
    return str[n] + reverse(str[0..n-1])
end 

puts reverse("string")

