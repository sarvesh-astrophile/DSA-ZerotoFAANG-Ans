package com.assignment_04;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the year: ");
        int year = input.nextInt();
        if (isLeapYear(year)){
            System.out.printf(year+" is a leap year");
        } else {
            System.out.printf(year+" is not a leap year");
        }
    }

    private static boolean isLeapYear(int year) {
       if (year % 4 == 0){
           if (year % 100 == 0){
               if (year % 400 == 0){
                   return true;
               } else {
                   return false;
               }
           } else {
               return true;
           }
       } else  {
           return false;
       }
    }
}
