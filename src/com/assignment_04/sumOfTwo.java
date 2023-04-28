package com.assignment_04;

import java.util.Scanner;

public class sumOfTwo {
    public static void main(String[] args) {
//        int ans = sum2();
//        System.out.println(ans);

        int ans = sum3(20,40);
        System.out.print(ans);
    }

    // pass the vale of numbers when you are calling the method in main()
    static int sum3(int a, int b){
        int sum = a+b;
        return sum;
    }

    // return the value
    static int sum2() {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.printf("Enter number 2: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        return sum;

//        System.out.printf("This will never execute");
    }
    static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.printf("Enter number 2: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("The Sum ="+sum);
    }

    /*
        access modifier return_type name() {
        //body
        }
     */
}
