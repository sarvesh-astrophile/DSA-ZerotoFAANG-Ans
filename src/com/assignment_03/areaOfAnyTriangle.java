package com.assignment_03;

import java.util.Scanner;

public class areaOfAnyTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first side :");
        int first_side = input.nextInt();
        System.out.print("Enter the second side :");
        int second_side = input.nextInt();
        System.out.print("Enter the third side :");
        int third_side = input.nextInt();

        int semi = (first_side+second_side+third_side)/2;
        double area = Math.pow(semi*(semi-first_side)*(semi-second_side)*(semi-third_side),0.5);
        System.out.println("Area of the given triaangle is :"+area);
    }
}
