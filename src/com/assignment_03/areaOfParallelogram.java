package com.assignment_03;

import java.util.Scanner;

public class areaOfParallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base length: ");
        double base = input.nextDouble();
        System.out.print("Enter height length: ");
        double height = input.nextDouble();

        double area =  base*height;
        System.out.println("Area of given parallelogram is "+area);
    }
}
