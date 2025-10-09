package org.learnWithM.arraysAndStrings;

public class CountCornerOneSubstringsProblem {

    public static int countCornerOneStrings(String s) {
        int n = s.length();
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == '1') {
                for (int j = i + 1; j < n; j++) {
                    if (s.charAt(j) == '1') {
                        count++;
                    }
                }
            }

        }
        return count;
    }

//     Other solution by calculating this equation ones* (ones -1 ) /2

    public static void main(String[] args) {
        String s = "00100101";
        System.out.println(countCornerOneStrings(s));
    }
}
