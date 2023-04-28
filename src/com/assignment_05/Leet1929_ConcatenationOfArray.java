package com.assignment_05;

import java.util.Arrays;

public class Leet1929_ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    private static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            ans[i+nums.length] = nums[i];
        }

        System.arraycopy(nums, 0, ans, 0, nums.length);
        System.arraycopy(nums, 0, ans, 0 + nums.length, nums.length);

        return ans;
    }
}
