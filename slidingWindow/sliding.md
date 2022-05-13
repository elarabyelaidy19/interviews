## [subarray product less than k](leetcode.com/problems/subarray-product-less-than-k/) 
- two pointers, one for aqcuiring the product, one for resucin if the product is greater than k. 
- when the product is greater than k, resduce product by divid on left.
- when the product is less than k, increase count by (r-l+1). 
- every step introduce x new subarray (5, 2) => (5, (2, (6))) here we introduced three subarrays (6), (2,6), (5,2,6)