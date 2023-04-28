package com.assignment_05;

public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(secondLargestIn(arr));
    }

    private static int secondLargestIn(int[] arr) {
        // finding first maximum
        int max = Integer.MIN_VALUE;
        int max_index = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
                max_index = i;
            }
        }

        // max for second maximum
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) continue;
            if (max2 < arr[i]) max2 = arr[i];
        }
        return max2;
    }
}
