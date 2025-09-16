package org.learnWithM.arraysAndStrings;

public class SecondLargestElementProblem {

    //    Solution 1: In two passes
    public static void findSecondLargeElement(int[] arr) {
        int len = arr.length;

        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < len - 1; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        for (int j = 0; j < len - 1; j++) {
            if (arr[j] > secondLargest && arr[j] != largest) {
                secondLargest = arr[j];
            }
        }

        System.out.println("Second Largest element : " + secondLargest);

    }

    //    Solution 2 : In one pass
    public static void findSecondLargeElementOnePass(int[] arr) {
        int arrLen = arr.length;

        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < arrLen - 1; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Second Largest element in one pass : " + secondLargest);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{12, 35, 1, 10, 34, 1};
        findSecondLargeElement(arr);
        findSecondLargeElementOnePass(arr);
    }

}
