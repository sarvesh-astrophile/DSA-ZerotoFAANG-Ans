package com.assignment_03;

import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        int radius_of_circle = input.nextInt();
        // Finding area of circle
        double areaOfCircle = Math.PI*Math.pow(radius_of_circle,2);
        System.out.println("Area of circle: "+areaOfCircle);
    }
}
