package org.example.valid_polindrome;

public class Solution {

    public boolean isPalindrome(String s) {
        if(s.isEmpty()) return true;
        String result = s.replaceAll("[^a-zA-Z0-9]", "");
        result = result.toLowerCase();
        return result.contentEquals(new StringBuilder(result)
                .reverse()
                .toString());
    }
}
