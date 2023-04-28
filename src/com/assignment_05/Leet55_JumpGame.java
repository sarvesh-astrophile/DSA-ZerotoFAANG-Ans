package com.assignment_05;

import java.util.ArrayList;

public class Leet55_JumpGame {
    public static void main(String[] args) {
        int[] nums = {2,0,0};
        System.out.println(canJump2(nums));
    }

    private static boolean canJump2(int[] nums) {
        int reach = 0;
        for (int i = 0; i <= reach; i++) {
            reach = Math.max(reach, i + nums[i]);
            if (reach >= nums.length - 1) return true;
        }
        return false;
    }


}
