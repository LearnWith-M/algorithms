package org.learnWithM.arraysAndStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> threeSumIterative(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();

        // Iterative Method : Usage of three nested loops for every permutation
        // This gives every possible zero-sum values including the duplicated values
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        res.add(List.of(new Integer[]{nums[i], nums[j], nums[k]}));
                    }
                }
            }
        }
        System.out.println(res);
        return res;
    }

    public static List<List<Integer>> threeSumPointer(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int endPointer = nums.length - 1;
            for (int j = i + 1; j < nums.length; j++) {
                while (j <= endPointer) {
                    if (nums[i] + nums[j] + nums[endPointer] == 0) {
                        res.add(List.of(new Integer[]{nums[i], nums[j], nums[endPointer]}));
                    }
                    endPointer -= 1;
                }
            }
        }

        System.out.println(res);
        return res;
    }

    public static List<List<Integer>> threeSumHashMap(int[] nums) {
        return null;
    }

    public static void main(String[] args) {
        int[] inputArr = new int[]{-1, 0, 1, 2, -1, -4};
        threeSumIterative(inputArr);  // Return [[-1, 0, 1], [-1, 2, -1], [0, 1, -1]]
        threeSumPointer(inputArr); // Return [[-1, 0, 1], [0, 1, -1]]
    }
}
