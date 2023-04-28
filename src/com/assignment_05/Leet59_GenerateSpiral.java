package com.assignment_05;

import java.util.Arrays;

public class Leet59_GenerateSpiral {
    public static void main(String[] args) {
        int n = 3;
        int[][] answerMatrix = generateMatrix(n);
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(answerMatrix[i]));
        }
    }

    private static int[][] generateMatrix(int n) {
        // generating the empty matrix
        int[][] ansMatrix = new int[n][n];

        // defining variables
        int i = 1;
        int upper_most_row = 0;
        int right_most_col = n-1;
        int lower_most_row = n-1;
        int left_most_col = 0;

        while (i <= n*n+1){
            // upper strip
            for (int j = left_most_col; j <= right_most_col; j++) {
                ansMatrix[upper_most_row][j] = i++;
            }
            upper_most_row++;
            if (i > n*n) return ansMatrix;

            // right strip
            for (int j = upper_most_row; j <= lower_most_row; j++) {
                ansMatrix[j][right_most_col] = i++;
            }
            right_most_col--;
            if (i > n*n) return ansMatrix;

            // bottom strip
            for (int j = right_most_col; j >= left_most_col; j--) {
                ansMatrix[lower_most_row][j] = i++;
            }
            lower_most_row--;
            if (i > n*n) return ansMatrix;

            // left strip
            for (int j = lower_most_row; j >= upper_most_row; j--) {
                ansMatrix[j][left_most_col] = i++;
            }
            left_most_col++;
            if (i > n*n) return ansMatrix;
        }
        return ansMatrix;
    }
}
