package com.assignment_03;

import java.util.Scanner;

public class checkVowelOrConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the alphabet to check: ");
        String  check_ch = input.next();

        boolean isVowel = false;
        String vowel = "aeiou";
        for (int i = 0; i < 5; i++) {
            if (check_ch.equalsIgnoreCase(String.valueOf(vowel.charAt(i)))){
                isVowel = true;
                break;
            } else {
                isVowel = false;
            }
        }
        if (isVowel){
            System.out.printf(check_ch+" is vowel");
        }else {
            System.out.printf(check_ch+" is consonant");
        }
    }
}
