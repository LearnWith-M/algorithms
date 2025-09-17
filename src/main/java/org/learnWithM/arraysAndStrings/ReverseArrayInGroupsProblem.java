package org.learnWithM.arraysAndStrings;

import java.util.Arrays;

public class ReverseArrayInGroupsProblem {

    public static void reverseArrayInGroups(int[] arr, int k) {
        int arrLen = arr.length;

        for (int i = 0; i < arrLen; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, arrLen - 1);
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        System.out.println("Reversed in Groups array : " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;
        reverseArrayInGroups(arr, k);
    }
}
