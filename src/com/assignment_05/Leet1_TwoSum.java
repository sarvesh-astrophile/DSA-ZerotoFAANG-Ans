package com.assignment_05;

import java.util.Arrays;
import java.util.List;

public class Leet1_TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    private static int[] twoSum(int[] nums, int target) {
        int space  = 1;
        // adjacent sum check
        while (true){
            for (int i = 0; i < nums.length - space; i++) {
                if (nums[i] + nums[i+space] == target) return new int[]{i, i+space};
            }
            space++;
        }
    }
}
