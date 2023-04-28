package com.assignment_04;

import java.util.Arrays;

public class OverLoading {
    public static void main(String[] args) {
        fun(2);
        fun("sarvesh");

    }

    static void fun(int ...v){
        System.out.printf(Arrays.toString(v));
    }

    static void fun(String name){

    }
}
