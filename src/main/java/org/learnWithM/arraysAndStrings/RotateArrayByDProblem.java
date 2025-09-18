package org.learnWithM.arraysAndStrings;

import java.util.Arrays;

public class RotateArrayByDProblem {

    //    Solution 1. Rotate array one by one
    public static void rotateArrayIterative(int[] arr, int d) {
        int arrLen = arr.length;
        for (int i = 0; i < d; i++) {

            int first = arr[0];
            for (int j = 0; j < arrLen - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arrLen - 1] = first;
        }

        System.out.println("Rotated array :" + Arrays.toString(arr));
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        rotateArrayIterative(arr, 3);
    }
}
