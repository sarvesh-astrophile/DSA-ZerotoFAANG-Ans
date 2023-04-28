package com.assignment_05;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExamples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // syntax
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(32);
//        list.add(324);
//        list.add(12);
//        list.add(234);
//        System.out.println(list.contains(234));
//        list.set(0,99);
//        list.remove(2);
//        System.out.println(list);

        // input
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));// pass index here, list[list] syntax will not work here
        }// we will use list.get method
    }
}
