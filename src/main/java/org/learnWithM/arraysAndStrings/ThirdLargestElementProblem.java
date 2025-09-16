package org.learnWithM.arraysAndStrings;

import java.util.Arrays;

public class ThirdLargestElementProblem {
    //    Solution 1: From Sorted Array
    public static void findThirdLargeElementBySort(int[] arr) {
        int arrLen = arr.length;
        Arrays.sort(arr);
        System.out.println("Third Largest element : " + arr[arrLen - 3]);
    }

    //    Solution 2: Using three loops
    public static void findThirdLargeElementBySeparateLoops(int[] arr) {
        int arrLen = arr.length;

        int largest = -1;
        int secondLargest = -1;
        int thirdLargest = -1;

        for (int i = 0; i < arrLen; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        for (int j = 0; j < arrLen; j++) {
            if (arr[j] > secondLargest && arr[j] < largest) {
                secondLargest = arr[j];
            }
        }

        for (int k = 0; k < arrLen; k++) {
            if (arr[k] > thirdLargest && arr[k] < secondLargest) {
                thirdLargest = arr[k];
            }
        }

        System.out.println("Third Largest element : " + thirdLargest);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 14, 2, 16, 10, 20};
        findThirdLargeElementBySort(arr);
        findThirdLargeElementBySeparateLoops(arr);
    }


}
