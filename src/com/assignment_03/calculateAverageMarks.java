package com.assignment_03;

import java.util.Scanner;

public class calculateAverageMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the number of subjects: ");
        int num_subjects = input.nextInt();
        int total_marks = 0;
        for (int i = 0; i < num_subjects ; i++) {
            System.out.printf("Enter the marks of subject "+(i+1)+": ");
            total_marks += input.nextInt();
        }
        System.out.printf("Average of all subjects: "+(total_marks/num_subjects));
    }
}
