package com.assignment_04;

import java.util.Scanner;

public class FindingPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the number to check Prime: ");
        int check_prime = input.nextInt();
        if (isPrime(check_prime)){
            System.out.printf(check_prime+" is a prime number");
        } else {
            System.out.printf(check_prime+" is not a prime number");
        }
    }

    private static boolean isPrime(int check_prime) {
        if (check_prime < 2) return false;
        for (int i = 2; i < Math.sqrt(check_prime); i++) {
            if (check_prime % i == 0) return false;
        }
        return true;
    }
}
