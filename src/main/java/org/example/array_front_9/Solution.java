package org.example.array_front_9;

import java.util.Arrays;

public class Solution {

    /**
     *
     * Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array
     * length may be less than 4.
     *
     *
     * arrayFront9([1, 2, 9, 3, 4]) → true
     * arrayFront9([1, 2, 3, 4, 9]) → false
     * arrayFront9([1, 2, 3, 4, 5]) → false
     */

    public boolean arrayFront9(int[] nums) {
        String str = "sdsd";
        char[] chArr = new char[str.length() * 2];
        String string = Arrays.toString(chArr);
        char[] toCharFromStr = str.toCharArray();
        for(int i = 0, j = 0; i < toCharFromStr.length; i++, j+=2) {
            chArr[j] = toCharFromStr[i];
        }

        boolean isHave9 = false;
        for(int i = 0; i < nums.length && i < 4; i++) {
            if (nums[i] == 9) {
                isHave9 = true;
                break;
            }
        }
        return isHave9;
    }
}
