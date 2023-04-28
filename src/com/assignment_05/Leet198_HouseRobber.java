package com.assignment_05;

public class Leet198_HouseRobber {
    public static void main(String[] args) {
        int[] nums = {2,1,1,2};
        System.out.println(rob(nums));
    }

    private static int rob(int[] nums) {
        int[] maxNums = new int[nums.length];
        maxNums[0] = nums[0];
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        maxNums[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            maxNums[i] = Math.max(maxNums[i-2] + nums[i], maxNums[i-1]);
        }
        return maxNums[nums.length - 1];
    }
}
