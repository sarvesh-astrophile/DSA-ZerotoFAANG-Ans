package com.assignment_03;

import java.util.Scanner;

public class volumeOfCone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the height of cone: ");
        float height = input.nextFloat();
        System.out.printf("Enter the radius of cone: ");
        float radius = input.nextFloat();
        double volume = Math.PI*Math.pow(radius, 2)*height/3;
        System.out.printf("Volume of given cone is "+volume);
    }
}
