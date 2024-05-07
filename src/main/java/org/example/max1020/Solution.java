package org.example.max1020;

public class Solution {

    /**
     *Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
     *  or return 0 if neither is in that range.
     *
     *
     * max1020(11, 19) → 19
     * max1020(19, 11) → 19
     * max1020(11, 9) → 11
     */

    public int max1020(int a, int b) {
        boolean isARange = isInRange(a);
        boolean isBRange = isInRange(b);
        int aRange = isARange ? a : 0;
        int bRange = isBRange ? b : 0;
        return Math.max(aRange, bRange);
    }

    public boolean isInRange(int a) {
        return a >= 10 && a <= 20;
    }
}
