package com.assignment_03;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the string to reverse: ");
        String original = input.next();
        String reversed = "";
        for (int i = 0; i < original.length() ; i++) {
            reversed = original.charAt(i)+reversed;
        }

        System.out.printf("The reversed string is: "+reversed);
    }
}
