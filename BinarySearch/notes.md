# Binary Search 
- sorted  

```java

List<Integer> list = Arrays.asList(5, 7, 9, 13, 17, 22);
        
// Collections.binarySearch returns index of an element in a list if it's present there,
// or (-(position where the element would be inserted) - 1) if the element is not in the list.
// You can just regard negative result as element missing in a list.
System.out.println(Collections.binarySearch(list, 13)); // prints 3
System.out.println(Collections.binarySearch(list, 15)); // -5 (- (4) - 1 ) => -5
System.out.println(Collections.binarySearch(list, 22)); // 5
System.out.println(Collections.binarySearch(list, 5));  // 0

```