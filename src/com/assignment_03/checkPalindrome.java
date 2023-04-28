package com.assignment_03;

import java.util.Scanner;

public class checkPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the string to check: ");
        String check_string = input.next();
        String reverse = "";
        for (int i = 0; i < check_string.length(); i++) {
            reverse = check_string.charAt(i) + reverse;
        }

        if (check_string.equalsIgnoreCase(reverse)){
            System.out.printf(check_string+" is palindrome");
        } else {
            System.out.printf(check_string+" is not palindrome");
        }
    }
}
