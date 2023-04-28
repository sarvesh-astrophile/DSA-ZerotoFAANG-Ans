package com.assignment_04;

public class Shadowing {
    static int x = 90;
    public static void main(String[] args) {
        int x;
    }

    static void fun(){
        System.out.println(x);
    }
}
