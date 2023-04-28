package com.assignment_04;

import java.util.Scanner;

public class FindingGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("Enter the marks you got: ");
            int marks = input.nextInt();
            if (marks == 0){
                break;
            }
            System.out.println("Your Grade will be: "+findGrade(marks));
        }
    }

    private static String findGrade(int marks) {
        switch ((int)(marks-1)/10){
            case 9:
                return "AA";
            case 8:
                return "AB";
            case 7:
                return "BB";
            case 6:
                return "BC";
            case 5:
                return "CD";
            case 4:
                return "DD";
            case 3,2,1:
                return "Fail";
        }

        return "Not a valid number";
    }
}
