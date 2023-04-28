package com.assignment_03;

import java.util.Scanner;

public class volumeOfPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter base length: ");
        float base_length = input.nextFloat();
        System.out.printf("Enter base width: ");
        float base_width = input.nextFloat();
        System.out.printf("Enter Pyramid height :");
        float pyramid_height = input.nextFloat();

        double volume = (base_length*base_width*pyramid_height)/3;
        System.out.printf("Volume of Pyramid is "+volume);
    }
}
