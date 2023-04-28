package com.assignment_03;

import java.util.Scanner;

public class volumeOfPrism {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the Apothem length of a triangular prism: ");
        float apothem_length = input.nextFloat();
        System.out.printf("Enter the base length: ");
        float base_length = input.nextFloat();
        System.out.printf("Enter the height of triangular prism: ");
        float height = input.nextFloat();

        // volume of prism
        double volume = 0.5*apothem_length*base_length*height;
        System.out.printf("Volume of prism is "+volume);
    }
}
