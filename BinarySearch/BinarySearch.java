package Gem.BinarySearch;

public class BinarySearch { 
    // 
    int peakIndexMountainArray(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        int m = 0;
        while (r > l) {
            m = (l + r) / 2;
            if (arr[m] < arr[m + 1])
                l = m + 1;
            else
                r = m;
        }
        return l;
    }
}
