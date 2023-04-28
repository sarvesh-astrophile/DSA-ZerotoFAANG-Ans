package com.assignment_03;

import java.util.Scanner;

public class volumeOfCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the base radius: ");
        float radius = input.nextFloat();
        System.out.printf("Enter the height: ");
        float height = input.nextFloat();

        double volume = Math.PI*Math.pow(radius,2)*height;
        System.out.printf("Volume of cylinder is "+volume);
    }
}
