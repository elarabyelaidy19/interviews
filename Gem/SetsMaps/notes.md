# Sets 
## two variations of sets
### HashSet 
- Hashtable based 
- constant time operations 

```java 
Set<Integer> set = new HashSet<>(); 
set.add(7); 
set.contains(7); 
set.remove(7); 
set.size(); 
```
### TreeSet 
- balanced binary search tree based
- logaritmic time operations
- keeps elements in sorted order


```java
Set<Integer> set = new TreeSet<>(); 
set.add(7);
set.add(3);
set.add(5);

set.first(); // smallest element
set.last(); // largest element

set.higher(5); // smallest element greater than 5
set.lower(5); // largest element smaller than 5
set.ceiling(5); // smallest element greater than or equal to 5
```

# Maps 
- <key, vlaue> pairs

## two variations of maps

### HashMap
- Hashtable based
- constant time operations

```java 

Map<Integer, String> map = new HashMap<>(); 
map.put(1, "one");
map.put(2, "two");
map.put(3, "three");

map.containsKey(1); // true 
map.containsValue("one"); // true 
map.remove(1); // removes the key-value pair with key 1

```

### TreeMap
- balanced binary search tree based 
- logaritmic time operations 
- keeps elements in sorted order by key
 
```java

Map<Integer, String> map = new TreeMap<>(); 
map.put(1, "one");
map.put(2, "two");
map.put(3, "three");

map.firstEntry(); // smallest key 
map.lastEntry(); // largest key

map.higherEntry(2); // smallest key greater than 2
map.lowerEntry(2); // largest key smaller than 2
map.ceilingEntry(2); // smallest key greater than or equal to 2
```


## [contains duplicates](https://leetcode.com/problems/contains-duplicate/)
- set 

## [two sum](https://leetcode.com/problems/two-sum/)
- hash map tracking each diff

