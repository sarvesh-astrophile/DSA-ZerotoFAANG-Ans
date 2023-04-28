package com.assignment_03;

import java.util.Scanner;

public class perimeterOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the radius of circle: ");
        int radius = input.nextInt();
        double perimeter = Math.PI*2*radius;
        System.out.printf("The Perimeter of circle is :"+perimeter);
    }
}
