package com.assignment_03;

import java.util.Scanner;

public class factorOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int num = input.nextInt();

        for (int i = 1; i <= num/2; i++) {
            if (num%i == 0){
                System.out.printf(i+" ");
            }
        }
        System.out.printf(Integer.toString(num));
    }
}
