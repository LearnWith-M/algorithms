package org.learnWithM.arraysAndStrings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

        System.out.println("Reversed array(temp array method) : " + Arrays.toString(reversedArr));
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

        System.out.println("Reversed array(two pointer method) : " + Arrays.toString(arr));
    }

    //    Solution 3: Swap elements
    public static void reverseArraySwapElements(int[] arr) {
        int arrLen = arr.length;

        for (int i = 0; i < arrLen / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arrLen - 1 - i];
            arr[arrLen - 1 - i] = temp;
        }

        System.out.println("Reversed array(swap element method) : " + Arrays.toString(arr));
    }

    //    Solution 4: Inbuilt methods
    public static void reverseArrayInbuilt(List<Integer> arr) {
        Collections.reverse(arr);

        System.out.println("Reversed array(inbuilt methods) : " + arr.toString());
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 3, 2, 6, 5};
        reverseArrayUsingTempArray(arr);
        reverseArrayWithTwoPointers(arr);

        int[] arrForSwap = new int[]{1, 4, 3, 2, 6, 5};
        reverseArraySwapElements(arrForSwap);

        List<Integer> arrList = Arrays.asList(1, 4, 3, 2, 6, 5);
        reverseArrayInbuilt(arrList);
    }
}
