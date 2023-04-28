package com.assignment_03;

import java.util.Scanner;

public class perimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Length of side :");
        int length_of_side = input.nextInt();

        int perimeter = 3*length_of_side;
        System.out.printf("Perimeter of equilateral triangle is "+perimeter);
    }
}
