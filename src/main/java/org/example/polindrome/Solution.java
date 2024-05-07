package org.example.polindrome;

public class Solution {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^\\p{L}]", "");
        result = result.toLowerCase();
        return result.contentEquals(new StringBuilder(result)
                .reverse()
                .toString());
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String result = s.replaceAll("[^\\p{L}]", "");
        String reverse = new StringBuilder(result).reverse().toString();
        System.out.println(reverse);

    }
}
