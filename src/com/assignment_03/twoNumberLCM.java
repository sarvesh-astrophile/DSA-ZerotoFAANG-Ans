package com.assignment_03;

import java.util.Scanner;

public class twoNumberLCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the first number: ");
        int first_num = input.nextInt();
        System.out.printf("Enter the second number: ");
        int second_num = input.nextInt();

        int LCM = first_num;
        int i = 1;
        while (true){
            if (LCM%first_num == 0 && LCM%second_num == 0){
                break;
            }
            LCM = first_num * i;
            i++;
        }


        System.out.printf("LCM is: "+LCM);
    }
}
