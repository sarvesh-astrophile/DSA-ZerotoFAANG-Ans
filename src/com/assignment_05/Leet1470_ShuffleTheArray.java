package com.assignment_05;

import java.util.Arrays;

public class Leet1470_ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7}; //
        int n = 3; // no. of elements in each array or size of array
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }

    private static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        for (int i = 0, j = 0; i < nums.length; ++i) {
            ans[i] = nums[j++];
            ans[++i] = nums[n++];
        }
        return ans;
    }
}
