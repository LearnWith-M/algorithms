package org.learnWithM.arraysAndStrings;

import java.util.Arrays;

public class ReverseArrayProblem {

    //  Solution 1: Temp array for reversed values
    public static void reverseArrayUsingTempArray(int[] arr) {
        int arrLen = arr.length;
        int[] reversedArr = new int[arrLen];
        int j = 0;
        for (int i = arrLen - 1; i >= 0; i--) {
            reversedArr[j] = arr[i];
            j++;
        }

        System.out.print("Reversed array : " + Arrays.toString(reversedArr));
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 3, 2, 6, 5};
        reverseArrayUsingTempArray(arr);
    }
}
