package com.assignment_05;

import java.util.Arrays;

public class Leet238_ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        int[] answer = productExceptSelf(nums);
        System.out.println(Arrays.toString(answer));
    }

    private static int[] productExceptSelf2(int[] nums) {
        // defining variables
        int[] answer = new int[nums.length];

        // running loop to multiply
        for (int i = 0; i < nums.length; i++) {
            int multiply = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;
                multiply *= nums[j];
            }
            answer[i] = multiply;
        }
        return answer;
    }

    private static int[] productExceptSelf(int[] nums) {
        // defining hasZero for zero cases
        int hasZero = 0;
        int multiply = 1;

        // getting the multiplication value
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                multiply *= nums[i];
            } else hasZero++;
        }

        // making the answer array
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (hasZero > 0){
                if (nums[i] == 0) {
                    if (hasZero == 1) answer[i] = multiply;
                    else answer[i] = 0;
                } else answer[i] = 0;
            } else answer[i] = multiply/nums[i];
        }

        return answer;
    }
}
