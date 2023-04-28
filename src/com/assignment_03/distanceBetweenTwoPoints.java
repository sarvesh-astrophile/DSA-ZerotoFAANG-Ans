package com.assignment_03;

import java.util.Scanner;

public class distanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input: 1st point
        System.out.printf("Enter the x1: ");
        int x1 = input.nextInt();
        System.out.printf("Enter the y1: ");
        int y1 = input.nextInt();

        // input: 2nd point
        System.out.printf("Enter the x2: ");
        int x2 = input.nextInt();
        System.out.printf("Enter the y2: ");
        int y2 = input.nextInt();

        double distance = Math.pow(Math.abs((Math.pow(x2-x1,2)+Math.pow(y2-y1,2))),0.5);
        System.out.printf("The distance: "+distance);
    }
}
