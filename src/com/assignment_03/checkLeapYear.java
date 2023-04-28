package com.assignment_03;

import java.util.Scanner;

public class checkLeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the year to check leap year: ");
        int year = input.nextInt();
        if( (year%4 == 0)&&((year%100 != 0)|| (year%400 == 0))){
            System.out.printf(year+" is a leap year");
        } else {
            System.out.printf(year+" is not a leap year");
        };
    }
}
