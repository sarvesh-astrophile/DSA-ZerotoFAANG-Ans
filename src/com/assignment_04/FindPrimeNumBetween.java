package com.assignment_04;

import java.util.Scanner;

public class FindPrimeNumBetween {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the starting number: ");
        int start_num = input.nextInt();
        System.out.printf("Enter the end number: ");
        int end_num = input.nextInt();

        findPrimeBetween(start_num, end_num);
    }

    private static void findPrimeBetween(int start_num, int end_num) {
        for (int i = start_num; i <= end_num; i++) {
            if (isPrime(i)){
                System.out.printf(i+" ");
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num < 2){
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
