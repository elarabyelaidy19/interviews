public class sliding {
    public int subarrayProductLessThan(int[] nums, int k) {
        if (k <= 1)
            return 0;
        int res = 0;
        int l = 0;
        int r = 0;
        int product = 1;
        while (r < nums.length - 1) {
            product *= nums[r];
            while (product >= k && r >= l) product /= nums[l++]; // when product execced k reduce number on the left
            res += r - l + 1; // every step introduce x new subarray (5, 2) => (5, (2, (6))) here we introduced three subarrays (6), (2,6), (5,2,6)
        }
        return res;
    }
}
