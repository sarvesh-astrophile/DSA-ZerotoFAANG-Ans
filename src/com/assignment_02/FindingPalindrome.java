package com.assignment_02;

import java.util.Scanner;

public class FindingPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string to check palindrome");
        String check = input.next();

        //todo:check palindrome
        //todo: making reverse
        String reverse="";
        for (int i = (check.length()-1); i >= 0; --i) {
            reverse = reverse + check.charAt(i);
        }

        if (reverse.toLowerCase().equals(check.toLowerCase())){
            System.out.println(check+" is palindrome");
        } else {
            System.out.println(check+" is not a palindrome");
        }
    }
}
