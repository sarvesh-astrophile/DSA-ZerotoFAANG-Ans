package com.assignment_05;

import java.util.ArrayList;
import java.util.List;

public class Leet54_SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Matrix: ");
        System.out.println(spiralOrder(matrix));
    }

    private static List<Integer> spiralOrder(int[][] matrix) {
        // we have to use slicing for completing this
        ArrayList<Integer> answer = new ArrayList<>();

        // lengths of matrix
        int m = matrix.length;
        int n = matrix[0].length;

        int top_most_row = 0;
        int right_most_col = n-1;
        int bottom_most_row = m-1;
        int left_most_col = 0;

        // defining
        int i = 0;
        while (i <= m*n){
            // Upper execution
            for (int j = left_most_col; j <= right_most_col; j++) {
                answer.add(matrix[top_most_row][j]);
                i++;
            }
            if (i == m*n) return answer;
            top_most_row++;

            // Right execution
            for (int j = top_most_row; j <= bottom_most_row; j++) {
                answer.add(matrix[j][right_most_col]);
                i++;
            }
            if (i == m*n) return answer;
            right_most_col--;

            // Bottom execution
            for (int j = right_most_col; j >= left_most_col; j--) {
                answer.add(matrix[bottom_most_row][j]);
                i++;
            }
            if (i == m*n) return answer;
            bottom_most_row--;

            // Left execution
            for (int j = bottom_most_row; j >= top_most_row; j--) {
                answer.add(matrix[j][left_most_col]);
                i++;
            }
            if (i == m*n) return answer;
            left_most_col++;
        }

        return answer;
    }
}
