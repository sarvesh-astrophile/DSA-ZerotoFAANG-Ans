package com.assignment_04;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // create an array
        int[] arr = {1, 3, 2, 45, 8};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void change(int[] nums) {
        nums[0] = 99;
    }
}
