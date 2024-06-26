package org.example.sum_double;

public class Solution {

    /**
     * Given two int values, return their sum. Unless the two values are the same, then return double their sum.
     *
     *
     * sumDouble(1, 2) → 3
     * sumDouble(3, 2) → 5
     * sumDouble(2, 2) → 8
     */

    public int sumDouble(int a, int b) {
        if(a == b) return (a + b) * 2;
        return a + b;
    }
}
