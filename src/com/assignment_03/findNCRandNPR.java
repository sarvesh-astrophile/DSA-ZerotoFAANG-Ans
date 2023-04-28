package com.assignment_03;

import java.util.Scanner;

public class findNCRandNPR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter what you want to find:");
        System.out.println("1.nPr \n2.nCr");
        int option = input.nextInt();

        if(option == 1){
            System.out.printf("Enter the value of n: ");
            int n = input.nextInt();
            System.out.printf("Enter the value of r: ");
            int r = input.nextInt();

            // check n<r
            while (n<r){
                System.out.println("Value of r should be smaller than n");
                System.out.println("Enter the new value of r: ");
                r = input.nextInt();
            }

            System.out.printf(n+"P"+r+" is: "+ (fact(n)/fact(n-r)));
        }

        if(option == 2){
            System.out.printf("Enter the value of n: ");
            int n = input.nextInt();
            System.out.printf("Enter the value of r: ");
            int r = input.nextInt();

            // check n<r
            while (n<r){
                System.out.println("Value of r should be smaller than n");
                System.out.println("Enter the new value of r: ");
                r = input.nextInt();
            }

            System.out.printf(n+"C"+r+" is: "+ (fact(n)/(fact(n-r)*fact(r))));
        }
    }

    private static int fact(int num) {
        int multiply = 1;
        for (int i = 1; i <= num; i++) {
            multiply *= i;
        }
        return multiply;
    }
}
