package org.example.makes10;

public class Solution {

    /**
     * Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
     *
     *
     * makes10(9, 10) → true
     * makes10(9, 9) → false
     * makes10(1, 9) → true
     */

    public boolean makes10(int a, int b) {
        if(a + b == 10 || (a == 10 || b == 10)) return true;
        return false;
    }

    public boolean makes10t(int a, int b) {
        return (a + b == 10 || (a == 10 || b == 10));
    }
}
