package com.assignment_05;

public class Leet1672_RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(accounts));
    }

    private static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int[] account = accounts[i];
            int sum = 0;
            for (int j = 0; j < account.length; j++) {
                int single_balance = account[j];
                sum += single_balance;
            }
            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }
}
