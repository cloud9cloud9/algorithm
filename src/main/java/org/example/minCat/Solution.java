package org.example.minCat;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Solution {

    /**
     *
     *Given two strings, append them together (known as "concatenation") and return the result.
     * However, if the strings are different lengths, omit chars from the longer string so it is the
     * same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.
     *
     *
     * minCat("Hello", "Hi") → "loHi"
     * minCat("Hello", "java") → "ellojava"
     * minCat("java", "Hello") → "javaello"
     */

    public String minCat(String a, String b) {

        if(b.length() < a.length()) {

            return a.substring(a.length() - b.length()) + b;
        } else if(a.length() < b.length()) {

            return a + b.substring(b.length() - a.length());
        }
        return a + b;
    }
}
