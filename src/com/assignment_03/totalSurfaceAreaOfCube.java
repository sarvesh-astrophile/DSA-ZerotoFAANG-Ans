package com.assignment_03;

import java.util.Scanner;

public class totalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the cube side: ");
        float side = input.nextInt();

        double surface_area = 6*Math.pow(side,2);
        System.out.printf("Surface area of cube is: "+surface_area);
    }
}
