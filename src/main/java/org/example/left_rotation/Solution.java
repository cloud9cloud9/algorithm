package org.example.left_rotation;

public class Solution {



    public int[] rotateLeft(int[] a, int d) {
        if(d > a.length) d = d % a.length;
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if(d < a.length) {
                b[i] = a[d];
                d++;
            } else {
                d = 0;
                b[i] = a[d];
                d++;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        Solution solution = new Solution();
        int[] ints = solution.rotateLeft(num, 9);
        printArr(ints);

    }

    public static void printArr(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
