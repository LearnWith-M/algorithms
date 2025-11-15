package org.learnWithM.intervals;

import java.util.*;

public class MergeIntervalsProblem {

    public static int[][] mergeIntervals(int[][] intervals) {
        // Sorting intervals by start of interval
        Arrays.sort(intervals, Comparator.comparing(a -> a[0]));

        LinkedList<int[]> result = new LinkedList<>();
        result.add(intervals[0]);


        for (int i = 1; i < intervals.length; i++) {
            //  Overlapping condition
            if(intervals[i][0] <= result.getLast()[1]){
                result.getLast()[1]= Math.max(intervals[i][1], result.getLast()[1]);
            }
            //  No overlapping
            else{
                result.add(new int[]{intervals[i][0], intervals[i][1]});
            }
        }
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][][] all_intervals = {
                {{3, 7}, {1, 5}, {4, 6}},
                {{1, 5}, {6, 8}, {4, 6}, {11, 15}},
                {{3, 7}, {10, 12}, {6, 8}, {11, 15}},
                {{1, 5}},
                {{1, 9}, {4, 4}, {3, 8}},
                {{1, 2}, {8, 8}, {3, 4}},
                {{1, 5}, {1, 3}},
                {{1, 5}, {6, 9}},
                {{0, 0}, {1, 18}, {1, 3}}
        };

        for(int[][] interval : all_intervals){
            int[][] res = mergeIntervals(interval);
            System.out.println(Arrays.deepToString(res));
        }
    }
}
