package org.example.start_oz;

public class Solution {

    /**
     * Given a string, return a string made of the first 2 chars (if present),
     * however include first char only if it is 'o' and include the second only if it is
     * 'z', so "ozymandias" yields "oz".
     * <p>
     * <p>
     * startOz("ozymandias") → "oz"
     * startOz("bzoo") → "z"
     * startOz("oxx") → "o"
     */

    public String startOz(String str) {
        String res = "";
        if (!str.isEmpty() && str.charAt(0) == 'o') {
            if (str.length() >= 2 && str.charAt(1) == 'z') {
                res = res + str.charAt(0) + str.charAt(1);
                return res;
            }
            res = res + str.charAt(0);
        } else {
            return str.length() >= 2 && str.charAt(1) == 'z' ? "z" : res;
        }
        return res;
    }
}
