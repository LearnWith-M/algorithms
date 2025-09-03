package org.learnWithM.arraysAndStrings;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {

    public static List<List<Integer>> twoSumIterative(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    res.add(List.of(nums[i], nums[j]));
                }
            }
        }
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        int[] inputValues = new int[] {0, -1, 2, -3, 1};
        twoSumIterative(inputValues, 2);
    }
}
