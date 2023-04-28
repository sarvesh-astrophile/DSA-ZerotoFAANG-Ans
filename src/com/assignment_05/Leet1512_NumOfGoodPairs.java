package com.assignment_05;

public class Leet1512_NumOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        System.out.println(numIdenticalPairs(nums));
        System.out.println(optimizedNumIdenticalPairs(nums));
    }

    public static int numIdenticalPairs(int[] nums) {
        int[] numOfIdentical = new int[102];
        int total_num_of_pairs = 0;
        for(int i = 0; i < nums.length; i++){
            total_num_of_pairs += numOfIdentical[nums[i]]++;
        }
        return total_num_of_pairs;
    }
    private static int optimizedNumIdenticalPairs(int[] nums){
        int[] numOfIdentical = new int[102];
        for (int unique_position : nums) {
            numOfIdentical[unique_position]++;
        }
        int total_num_of_pairs = 0;
        for (int n : numOfIdentical) {
            total_num_of_pairs += n*(n-1)/2;
        }
        return total_num_of_pairs;
    }
}
