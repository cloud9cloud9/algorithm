package org.example.icy_hot;

public class Solution {

    /**
     * Given two temperatures, return true if one is less than 0 and the other is greater than 100.
     *
     *
     * icyHot(120, -1) → true
     * icyHot(-1, 120) → true
     * icyHot(2, 120) → false
     */

    public boolean icyHot(int temp1, int temp2) {
        if(temp1 > 100) {
            return temp2 < 0;
        } else if(temp1 < 0) {
            return temp2 > 100;
        }
        return false;
    }
}
