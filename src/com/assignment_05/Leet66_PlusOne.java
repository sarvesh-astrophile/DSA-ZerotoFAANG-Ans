package com.assignment_05;

import java.util.Arrays;

public class Leet66_PlusOne {
    public static void main(String[] args) {
        int[] digits = {9, 9, 9, 1};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    private static int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0 ; i--) {
            digits[i] = digits[i] + carry;
            carry = digits[i] / 10;
            digits[i] = digits[i] % 10;
//            System.out.println(digits[i]);
        }
        if (carry != 0) {
            int len = digits.length + 1;
            int[] ans = new int[len];
            ans[0] = carry;
            for (int i = 1; i < len; i++) {
                ans[i] = digits[i - 1];
            }
            return ans;
        } else return digits;
    }
}
