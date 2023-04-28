package com.assignment_04;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        {
            a = 100;
            System.out.println(a);
        }

        System.out.println(a);
    }

//    static void random(){
//        int num = 89;
//        System.out.println(a);
//    }
}
