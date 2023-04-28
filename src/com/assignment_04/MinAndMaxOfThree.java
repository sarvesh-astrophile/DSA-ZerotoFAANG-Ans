package com.assignment_04;

import java.util.Scanner;

public class MinAndMaxOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter 1st number: ");
        float first_num = input.nextFloat();
        System.out.printf("Enter 2nd number: ");
        float second_num = input.nextFloat();
        System.out.printf("Enter 3rd number: ");
        float third_num = input.nextFloat();

        float max = maxOfThree(first_num, second_num, third_num);
        float min = minOfThree(first_num, second_num, third_num);

        System.out.println("Max of Three is: "+max);
        System.out.println("Min of Three is: "+min);

    }

    private static float minOfThree(float first_num, float second_num, float third_num) {
        float min = first_num;
        if (second_num < min){
            min = second_num;
        }

        if (third_num < min) {
            min = third_num;
        }

        return min;
    }

    private static float maxOfThree(float first_num, float second_num, float third_num) {
        float max = first_num;
        if (second_num > max){
            max = second_num;
        }

        if (third_num > max) {
            max = third_num;
        }

        return  max;
    }
}
