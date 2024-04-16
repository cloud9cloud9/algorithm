package org.example.del_del;

public class Solution {

    /**
     * Given a string, if the string "del" appears starting at index 1, return a string where that
     * "del" has been deleted. Otherwise, return the string unchanged.
     *
     *
     * delDel("adelbc") → "abc"
     * delDel("adelHello") → "aHello"
     * delDel("adedbc") → "adedbc"
     */

    public String delDel(String str) {
        if(str.length() <= 3) return str;
        String sub = str.substring(1, 4);
        if(sub.equals("del")) {
            return str.charAt(0) + str.substring(4);
        }
        return str;
    }
}
