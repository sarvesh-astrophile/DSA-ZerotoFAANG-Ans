package com.assignment_02;

import java.util.Scanner;

public class FindArmstrongBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int start = input.nextInt();
        System.out.print("Enter the end number :");
        int end = input.nextInt();

        //todo:finding armstrong number between range
        for (int i = start; i <= end; i++) {
            ouputOnlyArmstong(i);
        }
    }

    public static void ouputOnlyArmstong (int check_number){
        int temp = check_number;
        int sum_of_squares = 0;
        while (temp != 0){
            sum_of_squares = sum_of_squares + (temp%10)*(temp%10)*(temp%10);
            temp = temp/10;
        }
        if (sum_of_squares == check_number){
            System.out.println(check_number);
        }
    }
}
