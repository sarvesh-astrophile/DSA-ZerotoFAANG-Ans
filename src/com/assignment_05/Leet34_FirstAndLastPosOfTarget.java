package com.assignment_05;

import java.util.Arrays;

public class Leet34_FirstAndLastPosOfTarget {
    public static void main(String[] args) {
        int[] nums = {2,2,2};
        int target = 2;
        int[] ans = searchRange(nums,target);
        System.out.println(Arrays.toString(ans));

    }

    private static int[] searchRange(int[] nums, int target) {

        // using binary search to find the element
        int targetIndex = -1;
        int l = 0, r = nums.length - 1;
        while (l <= r){
            int m = (l + r)/2;

            // check if target is at mid
            if (nums[m] == target) {
                targetIndex = m;
                break;
            }

            // if target is greater, ignore left hand side
            if (nums[m] < target) {
                l = m + 1;
            }

            // if target is smaller, ignore right hand side
            if (nums[m] > target) {
                r = m - 1;
            }
        }

        // checking if target is found
        if (targetIndex == -1){
            return new int[]{-1, -1};
        } else {
            int startIndex = targetIndex;
            int endIndex = targetIndex;
            // if targetIndex != 0
            if (startIndex != 0) {
                // scanning left side for find starting point
                while (nums[startIndex - 1] == target && startIndex != 0) {
                    startIndex--;
                    if (startIndex == 0) break;
                }
            }

            // if endIndex == nums.length - 1
            if (endIndex != nums.length - 1) {
                // scanning right side for finding end point
                while (nums[endIndex + 1] == target) {
                    endIndex++;
                    if (endIndex == nums.length) break;
                }
            }

            return new int[] {startIndex, endIndex};
        }
    }
}
