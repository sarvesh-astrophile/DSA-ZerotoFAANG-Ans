package com.assignment_03;

import java.util.Scanner;

public class perimeterOfSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the side length of square: ");
        int side_length = input.nextInt();
        int perimeter = side_length*4;
        System.out.printf("Perimeter of square is "+perimeter);
    }
}
