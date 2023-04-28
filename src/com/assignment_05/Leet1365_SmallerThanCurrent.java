package com.assignment_05;

import java.util.Arrays;

public class Leet1365_SmallerThanCurrent {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    private static int[] smallerNumbersThanCurrent(int[] nums) {
        // taking unique count
        int[] unique_numbers = new int[100];
        for (int i = 0; i < nums.length; i++) {
            unique_numbers[nums[i]]++;
        }

        // unique_number with previous smaller number
        int[] smaller = new int[nums.length];
        for (int i = 1; i < unique_numbers.length; i++) {
            unique_numbers[i] += unique_numbers[i - 1];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                smaller[i] = 0;
            } else {
                smaller[i] = unique_numbers[nums[i] - 1];
            }
        }

        return  smaller;
    }
}
