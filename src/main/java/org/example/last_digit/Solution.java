package org.example.last_digit;

public class Solution {

    /**
     * Given two non-negative int values, return true if they have the same
     * last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
     *
     *
     * lastDigit(7, 17) → true
     * lastDigit(6, 17) → false
     * lastDigit(3, 113) → true
     */

    public boolean lastDigit(int a, int b) {
        int difference;
        if(a > b) {
            difference = a - b;
        } else {
            difference = b - a;
        }
        if(difference % 10 == 0) {
            return true;
        }
        return false;
    }
}
