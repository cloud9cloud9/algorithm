package org.example.remove_element;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }

    public int removeElement1(int[] nums, int val) {
        List<Integer> list = new ArrayList<>(nums.length);
        for (int num : nums) {
            list.add(num);
        }
        return (int) list.stream()
                .filter(i -> i != val)
                .count();
    }
}
