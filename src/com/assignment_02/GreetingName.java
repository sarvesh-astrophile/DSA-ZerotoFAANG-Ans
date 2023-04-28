package com.assignment_02;

import java.util.Scanner;

public class GreetingName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Name = input.next();
        System.out.println(Name+", How are you?");
    }
}
