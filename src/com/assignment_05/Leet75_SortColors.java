package com.assignment_05;

import java.util.Arrays;

public class Leet75_SortColors {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void sortColors(int[] nums) {
        int j = 0, i = 0, k = nums.length - 1;
        while (i <= k){
            if (nums[i] == 0) swap(nums, j++, i++);
            else if (nums[i] == 2) swap(nums, i++, k--);
            else i++;
        }
    }

    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
