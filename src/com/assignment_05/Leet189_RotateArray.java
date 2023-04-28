package com.assignment_05;

import java.util.Arrays;

public class Leet189_RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    private static void rotate(int[] nums, int k) {
        while (nums.length < k) k = k - nums.length;
        int[] num_part_1 = Arrays.copyOfRange(nums, nums.length - k, nums.length);
        int[] num_part_2 = Arrays.copyOfRange(nums, 0, nums.length - k);
        System.arraycopy(num_part_1, 0, nums, 0, num_part_1.length);
        System.arraycopy(num_part_2, 0, nums, num_part_1.length, num_part_2.length);
    }
}
