package com.assignment_03;

import java.util.Scanner;

public class areaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first side of rectangle: ");
        int first_side = input.nextInt();
        System.out.print("Enter second side of rectangle: ");
        int second_side = input.nextInt();
        int area = first_side*second_side;
        System.out.println("Area of required rectangle is "+area);
    }
}
