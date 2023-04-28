package com.assignment_05;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 1, 9, 18};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start<end){
            //swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    private static int max(int[] arr) {
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++ ){
            if (arr[i]>maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
