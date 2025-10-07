package org.learnWithM.leetcode;

public class ValidPalindromeProblem {

    public static boolean isValid(String s) {
        int len = s.length();
        int startIdx = 0;
        int endIdx = len - 1;

        while (startIdx < endIdx) {
            if (s.charAt(startIdx) != s.charAt(endIdx)) {
                return false;
            }
            startIdx++;
            endIdx--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "acaca";

        System.out.println(isValid(str));



    }
}
