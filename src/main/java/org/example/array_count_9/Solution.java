package org.example.array_count_9;

public class Solution {

    /**
     *
     * Given an array of ints, return the number of 9's in the array.
     *
     *
     * arrayCount9([1, 2, 9]) → 1
     * arrayCount9([1, 9, 9]) → 2
     * arrayCount9([1, 9, 9, 3, 9]) → 3
     */

    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 9) count++;
        }
        return count;
    }
}
