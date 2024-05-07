package org.example.close10;

public class Solution {

    public int close10(int a, int b) {
        int aMinusTen = Math.abs(10 - a);
        int bMinusTen = Math.abs(10 - b);
        if(aMinusTen > bMinusTen) {
            return bMinusTen;
        } else if(aMinusTen < bMinusTen) {
            return aMinusTen;
        } else {
            return 0;
        }
    }
}
