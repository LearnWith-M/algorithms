package org.learnWithM.leetcode;

import java.util.ArrayList;
import java.util.List;

public class MergeIntervalsProblem {

    public static List<int[]> mergeIntervals(int[][] intervals) {
        List<int[]> merged = new ArrayList<>();

        int rangeFirst = intervals[0][0];
        int rangeLast = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
//            check if it is overlapped
            if (rangeLast >= intervals[i][0] && rangeFirst <= intervals[i][1]) {
                rangeLast = intervals[i][1];
            } else {
                merged.add(new int[]{rangeFirst, rangeLast});
                rangeFirst = intervals[i][0];
                rangeLast = intervals[i][1];
            }
        }
        merged.add(new int[]{rangeFirst, rangeLast});
        return merged;
    }

    public static void main(String[] args) {
        int[][] intervals = new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        System.out.println(mergeIntervals(intervals));
    }
}
