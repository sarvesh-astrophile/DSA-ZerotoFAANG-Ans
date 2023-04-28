package com.assignment_05;

import java.util.Arrays;

public class Leet1480_RunningSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    private static int[] runningSum(int[] nums) {
//        int[] ans = new int[nums.length];
//        ans[0] = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            ans[i] = ans[i-1] + nums[i];
//        }
//        return ans;


        int[] arr = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            arr[i] = sum;
        }
        return arr;
    }
}
