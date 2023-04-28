package com.assignment_03;

import java.util.Scanner;

public class areaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of triangle: ");
        int height = input.nextInt();
        System.out.print("Enter the base of triangle: ");
        int base = input.nextInt();
        double area = 0.5*base*height;
        System.out.println("Area of Triangle: "+area);
    }
}
