package com.assignment_05;

import java.util.Arrays;

public class Leet1304_UniqueToZero {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(sumZero(n)));
    }

    private static int[] sumZero(int n) {
        int[] answer = new int[n];
        if (n%2 == 0){
            for (int i = 1; i < n; i+=2) {
                answer[i-1] = i;
                answer[i] = i*-1;
            }
        } else {
            answer[0] = 0;
            for (int i = 1; i < n; i+=2) {
                answer[i] = i;
                answer[i+1] = i*-1;
            }
        }
        return answer;
    }
}
