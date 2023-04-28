package com.assignment_05;

import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 12};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void change(int[] arr) {
        arr[0]  = 99;
    }
}
