package com.assignment_02;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        float first_number = input.nextFloat();
        System.out.print("Enter Second Number: ");
        float second_number = input.nextFloat();

        // todo:compare both numbers
        float result = 0;
        if (first_number>second_number){
            result = first_number;
        } else if (second_number > first_number) {
            result = second_number;
        } else {
            System.out.println("Both number are same");
            result =  first_number;
        }
        System.out.println(result+" is the largest of the two");
    }
}
