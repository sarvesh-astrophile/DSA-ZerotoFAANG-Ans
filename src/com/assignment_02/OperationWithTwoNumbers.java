package com.assignment_02;

import java.util.Scanner;

public class OperationWithTwoNumbers {
    public static void main(String[] args) {

        // todo: taking inputs
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number:");
        float first_number = input.nextFloat();
        System.out.print("Enter the Second Number:");
        float second_number = input.nextFloat();

        //todo: asking for operation
        System.out.print("Enter the operation -,+,*,/  :");
        char operation = input.next().charAt(0);
        float result = 0;

        //todo: doing operation using if
        if (operation == '+'){
            result = first_number+second_number;
            System.out.println(first_number+" + "+second_number+" = "+result);
        } else if (operation == '-') {
            result = first_number-second_number;
            System.out.println(first_number+" - "+second_number+" = "+result);
        }else if (operation == '*') {
            result = first_number-second_number;
            System.out.println(first_number+" * "+second_number+" = "+result);
        }else if (operation == '/') {
            result = first_number/second_number;
            System.out.println(first_number+" / "+second_number+" = "+result);
        }

    }
}
