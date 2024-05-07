package org.example.needle_haystack;

public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) return -1;
        char[] charOfHay = haystack.toCharArray();
        char[] charOfNeed = needle.toCharArray();
        for (int i = 0; i < charOfHay.length; i++) {
            if(charOfHay[i] == charOfNeed[0]) {
                int j = i;
                int k = 0;
                while(j < charOfHay.length && k < charOfNeed.length && charOfHay[j] == charOfNeed[k]) {
                    j++;
                    k++;
                }
                if(k == charOfNeed.length) {
                    return i;
                }
            }
        }
        return -1;
    }
}
