package com.assignment_02;

public class OnlineFindingArmstrong {
    public static void main(String[] args) {
        // The range of number to check for Armstrong numbers
        int start = 100;
        int end = 999;

        // Iterate over the range of numbers
        for (int i = start; i < end; i++) {
            // Convert the number to a string
            String numString = String.valueOf(i);

            // Calculate the sum of the cubes of each digit in the number
            int sum = 0;
            for (int j = 0; j < numString.length(); j++) {
                int digit = Character.getNumericValue(numString.charAt(j));
                sum += Math.pow(digit,3);
            }

            // If the sum is equal to the original number, it is an Armstrong number
            if (sum == i){
                System.out.println(i+" is an Armstrong number");
            }
        }
    }
}
