# Design considerations 
- the data structure that will be used.

## [design undergroundSystem](https://leetcode.com/problems/design-underground-system/) 
- wrapper to store passenger info 
- map each passenger to his info <id , info> 
- concat start+end as key 
- map each key to array store total time(end-start) and count
- getAverageTime(id) = total time / count