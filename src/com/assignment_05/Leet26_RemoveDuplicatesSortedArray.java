package com.assignment_05;

public class Leet26_RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = removeDuplicates(nums);
        System.out.print("[");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]+", ");
        }
        System.out.print("]");
    }

    private static int removeDuplicates(int[] nums) {
        int k = 0;
        int unique = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (unique != nums[i]){
                unique = nums[i];
                nums[k] = unique;
                k++;
            }
        }
        return k;
    }
}
