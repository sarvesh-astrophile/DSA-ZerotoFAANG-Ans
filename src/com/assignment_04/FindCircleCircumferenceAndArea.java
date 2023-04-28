package com.assignment_04;

import java.util.Scanner;

public class FindCircleCircumferenceAndArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the radius of circle: ");
        float radius_of_circle = input.nextFloat();

        System.out.println("Circumference is: "+cicumferenceOfCircle(radius_of_circle));
        System.out.println("Area is: "+areaOfCircle(radius_of_circle));
    }

    private static double areaOfCircle(float radius_of_circle) {
        return Math.PI * Math.pow(radius_of_circle, 2);
    }

    private static double cicumferenceOfCircle(float radius_of_circle) {
        return 2 * Math.PI * radius_of_circle;
    }
}
