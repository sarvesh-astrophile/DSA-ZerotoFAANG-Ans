package com.assignment_03;

import java.util.Scanner;

public class CGPAcalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalCreditHours = 0;
        double totalGradePoints = 0.0;

        System.out.printf("Enter the number of courses: ");
        int numCourses = input.nextInt();

        for (int i = 0; i < numCourses; i++) {
            System.out.printf("Enter the credit hours for course "+(i+1)+": ");
            int creditHours = input.nextInt();
            totalCreditHours += creditHours;

            System.out.printf("Enter the grade for course "+(i+1)+": ");
            String grade = input.next();
            double gradePoints = getGradePoints(grade);
            totalGradePoints += gradePoints * creditHours;
        }

        double CGPA = totalGradePoints/totalCreditHours;
        System.out.printf("Your CGPA is: "+CGPA);
    }

    private static double getGradePoints(String grade) {
        if (grade.equalsIgnoreCase("A")){
            return 4.0;
        } else if (grade.equalsIgnoreCase("B")) {
            return 3.0;
        } else if (grade.equalsIgnoreCase("C")) {
            return 2.0;
        } else if (grade.equalsIgnoreCase("D")) {
            return 1.0;
        } else if (grade.equalsIgnoreCase("F")) {
            return 0.0;
        } else {
            return 0.0;
        }
    }
}
