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

        System.out.println("Reversed array : " + Arrays.toString(reversedArr));
    }

    //    Solution 2: Two pointers
    public static void reverseArrayWithTwoPointers(int[] arr) {
        int arrLen = arr.length;
        int left = 0;
        int right = arrLen - 1;

        while (left < right) {
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;
        }

        System.out.println("Reversed array : " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 3, 2, 6, 5};
        reverseArrayUsingTempArray(arr);

        reverseArrayWithTwoPointers(arr);
    }
}
