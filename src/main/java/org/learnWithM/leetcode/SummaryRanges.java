package org.learnWithM.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

// Problem 228.
// https://leetcode.com/problems/summary-ranges/description/?envType=study-plan-v2&envId=top-interview-150
public class SummaryRanges {

    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) {
            return result;
        }

//        0 1 2 4 5 7
        int first = nums[0];
        int last = nums[0];
        int index = 0;

        while (index < nums.length - 1) {
            if (last + 1 == nums[index + 1]) {
                last = nums[index + 1];
            } else {
                result.add(rangeStr(first, last));
                first = nums[index + 1];
                last = nums[index + 1];
            }
            index++;
        }
//        Get the missed last index
        if (last + 1 == nums[index]) {
            last = nums[index];
        } else {
            result.add(rangeStr(first, last));
        }
        return result;
    }

    public static String rangeStr(int first, int last) {
        if (first != last) {
            return first + "=>" + last;
        } else {
            return String.valueOf(first);
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 3, 4, 5, 7};
        System.out.println(summaryRanges(nums));
    }
}
