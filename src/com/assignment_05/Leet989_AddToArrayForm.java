package com.assignment_05;

import java.util.ArrayList;
import java.util.List;

public class Leet989_AddToArrayForm {
    public static void main(String[] args) {
        int[] num = {9,9,9};
        int k = 1;
        System.out.println(addToArrayForm(num, k));
    }

    private static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> answer = new ArrayList<>();
        for (int i = num.length; i > 0 || k % 10 == 0; i--) {
            answer.add(0, (k+num[i])%10);
            k /= 10;
        }
        return answer;
    }
}
