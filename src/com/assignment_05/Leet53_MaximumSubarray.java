package com.assignment_05;

public class Leet53_MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray2(nums));
    }

    private static int maxSubArray2(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum < 0) sum = 0;
            if (sum > max) max = sum;
        }
        return max;
    }


    private static int maxSubArray(int[] nums) {
        int answer = Integer.MIN_VALUE;
        int len = nums.length;
        int start = 0;
        while (start != len){
            int sum = 0;
            for (int i = start; i < len; i++){
                sum += nums[i];
                if (answer < sum) answer = sum;
            }
            start++;
        }
        return answer;
    }
}
