package com.assignment_05;

public class Leet1295_EvenNumberDigits {
    public static void main(String[] args) {
        int[] nums = {12, 325, 2, 6, 7896};
        int[] nums2 = {555, 901, 482, 1771};
        System.out.println(findNumbers(nums));
        System.out.println(findNumbers(nums2));
    }

    private static int findNumbers(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            while (nums[i] != 0) {
                nums[i] /= 10;
                count++;
            }
            if (count % 2 == 0) ans++;
        }
        return ans;
    }
}
