package com.assignment_03;

import java.util.Scanner;

public class areaOfRhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter first diagonal length: ");
        int first_diagonal = input.nextInt();
        System.out.printf("Enter second diagonal length: ");
        int second_diagonal = input.nextInt();

        int area = first_diagonal*second_diagonal/2;
        System.out.printf("Area os Rhombus: "+area);
    }
}
