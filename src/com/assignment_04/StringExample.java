package com.assignment_04;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.next();
        String personalised = myGreet(name);
        System.out.printf(personalised);
    }

    private static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }

    static String greet() {
        String greeting = "how are you";
        return greeting;
    }
}
