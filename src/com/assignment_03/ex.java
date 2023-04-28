package com.assignment_03;

public class ex {
    public static void main(String[] args) {
        GCD(12,9);
    }
    public static void GCD(int a ,int b){
        if (a%b == 0){
            System.out.printf(String.valueOf(b));;
        }
        else {
            GCD(b,a%b);
        }
    }
}
