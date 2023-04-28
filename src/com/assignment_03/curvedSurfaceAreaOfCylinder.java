package com.assignment_03;

import java.util.Scanner;

public class curvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the radius of cylinder: ");
        float radius = input.nextFloat();
        System.out.printf("Enter the height of cylinder: ");
        float height = input.nextFloat();

        double volume = 2*Math.PI*radius*height;
        System.out.printf("Curved Surface Area of Cylinder is "+volume);
    }
}
