package com.assignment_05;

public class Leet1732_HigestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        System.out.println(largestAltitude(gain));
    }

    private static int largestAltitude(int[] gain) {
        int result = 0;
        int ans = 0;
        for (int i = 0; i < gain.length; i++) {
            ans += gain[i];
            result = Math.max(ans, result);
        }
        return result;
    }
}
