package com.assignment_04;

import java.util.Scanner;

public class FindingFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.printf("Enter the factorial number: ");
            String fact_num = input.next();
            if (fact_num.equalsIgnoreCase("exit")){
                break;
            }
            System.out.println("Factorial of "+fact_num+" is: "+ factorialOf(Integer.parseInt(fact_num))+"\n");
        }
    }

    private static int factorialOf(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
