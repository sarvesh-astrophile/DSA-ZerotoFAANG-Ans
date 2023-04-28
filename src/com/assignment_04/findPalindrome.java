package com.assignment_04;

import java.util.Scanner;

public class findPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the number to check: ");
        int number_check = input.nextInt();

        if (isPalindrome(number_check)){
            System.out.printf(number_check+" is Palindrome");
        } else {
            System.out.printf(number_check+" is not Palindrome");
        }
    }

    private static boolean isPalindrome(int number_check) {
        String reverse = "";
        for (int i = 0; i < Integer.toString(number_check).length(); i++) {
            char single_character = Integer.toString(number_check).charAt(i);
            reverse = single_character + reverse;
        }
        System.out.println(reverse);
        return Integer.toString(number_check).equalsIgnoreCase(reverse);
    }

}
