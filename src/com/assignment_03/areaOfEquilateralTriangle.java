package com.assignment_03;

import java.util.Scanner;

public class areaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter length of triangle side: ");
        int length_of_side = input.nextInt();
        double area = Math.pow(3,0.5)*Math.pow(length_of_side,2)/4;
        System.out.printf("Area of given equilateral triangle is "+area);
    }
}
