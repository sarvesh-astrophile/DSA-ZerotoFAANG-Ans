package com.assignment_03;

import java.util.Scanner;

public class perimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the length of first side: ");
        int first_side = input.nextInt();
        System.out.printf("Enter the length of adjacent second side: ");
        int second_side = input.nextInt();

        int perimeter = 2*(first_side+second_side);
        System.out.printf("Perimeter of Rectangle: "+perimeter);
    }
}
