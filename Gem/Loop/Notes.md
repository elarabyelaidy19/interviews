# converging pointers 
- two pointers moving towards each other.
```java 
    int l = 0, r = s.length() - 1;
    while (l < r) {
        if (s.charAt(l) != s.charAt(r))
            return false;
        l++; r--;
    }
```

- alphanumeric values test if the char is letter or number. 
``` java 
    Character.isLetterOrDigit(c)
```