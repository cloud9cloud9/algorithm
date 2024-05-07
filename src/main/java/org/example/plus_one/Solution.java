package org.example.plus_one;

public class Solution {
    public int[] plusOne(int[] digits) {
        if (digits.length == 0) return new int[]{1};
        for (int i = digits.length - 1; i >= 0 ; i--) {
            if (digits[i] == 9) {
                int[] newDigits = new int[digits.length + 1];
                digits[i] = 0;
                if(i == 0) {
                    newDigits[0] = 1;
                    return newDigits;
                }
            } else {
                digits[i]++;
                return digits;
            }
        }
        return digits;
    }
}