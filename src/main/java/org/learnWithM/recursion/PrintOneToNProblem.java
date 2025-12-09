package org.learnWithM.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintOneToNProblem {

    public static List<Integer> printN(int n, List<Integer> res) {
        if (n == 0) {
            return res;
        } else {
            printN(n - 1, res);
            res.add(n);
            return res;
        }

    }

    public static void main(String[] args) {

        int input = 3;
        List<Integer> res = new ArrayList<>();
        System.out.println(printN(input, res));
    }
}
