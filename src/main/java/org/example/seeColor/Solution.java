package org.example.seeColor;

public class Solution {


    /**
     * Given a string, if the string begins with "red" or "blue" return that color string,
     * otherwise return the empty string.
     *
     *
     * seeColor("redxx") → "red"
     * seeColor("xxred") → ""
     * seeColor("blueTimes") → "blue"
     */


    public String seeColor(String str) {
        return str.startsWith("red") ? "red" : str.startsWith("blue") ? "blue" : "";
    }
}
