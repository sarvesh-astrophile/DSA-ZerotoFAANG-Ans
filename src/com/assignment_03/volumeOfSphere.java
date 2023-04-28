package com.assignment_03;

import java.util.Scanner;

public class volumeOfSphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the radius of sphere: ");
        float radius = input.nextFloat();

        double volume = 4*Math.PI*Math.pow(radius,3)/3;
        System.out.printf("Volume of Sphere is "+volume);
    }
}
