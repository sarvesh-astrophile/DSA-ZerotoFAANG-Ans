package com.assignment_05;

import java.util.Arrays;

public class MergeSortOwn {
    public static void main(String[] args) {
        int[] arr = { 6, 5, 12, 10, 9, 1 };
        System.out.println("unsorted array: "+Arrays.toString(arr));

        // running mergeSort
        mergeSort(arr, 0, arr.length - 1);

        System.out.println("sorted array: "+Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int start_index, int end_index) {
        if (end_index > start_index){
            int mid_index = (end_index + start_index)/2;

            mergeSort(arr, start_index, mid_index);
            mergeSort(arr, mid_index+1, end_index);

            // running merge
            mergeMain(arr, start_index, mid_index, end_index);
        }
    }

    private static void mergeMain(int[] arr, int start_index, int mid_index, int end_index) {

        // creating two arrays for reference and comparing
        int n1 = mid_index - start_index + 1;
        int n2 = end_index - mid_index;

        int[] left = new int[n1];
        int[] right = new int[n2];

        // filling with same values
        for (int i = 0; i < n1; i++) {
            left[i] = arr[start_index + i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = arr[mid_index + i + 1];
        }

        // Maintaining the current index of sub array and main array
        int i, j, k;
        i = 0;
        j = 0;
        k = start_index;

        // Until we reach either end of either left or right, pick larger among
        // elements left and right and place in the correct position at arr[start_index..end_index]

        while (i < n1 && j < n2){
            if (left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // When we run out of elements in either left or right,
        // pick up the remaining elements and put in arr[start_index..end_index]

        while (i < n1){
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < n2){
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
