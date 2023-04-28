package com.assignment_02;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number upto which you want Fibonacci Series: ");
        int exit = input.nextInt() -1;
        int first_number = 0;
        int second_number = 1;
        System.out.print(second_number+" ");
        while (exit > 0){
            int next_fib = first_number + second_number;

            //todo:print fibonacci series
            System.out.print(next_fib+" ");

            //todo:next fib
            first_number = second_number;
            second_number = next_fib;
            exit = exit - 1;
        }
    }
}
