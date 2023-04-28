package com.assignment_05;

import java.util.Arrays;

public class Leet857_TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}};
        for (int[] mat: transpose(matrix)) {
            System.out.println(Arrays.toString(mat));
        }
        System.out.println("\n");
        for (int[] mat: transpose(matrix2)) {
            System.out.println(Arrays.toString(mat));
        }
    }

    private static int[][] transpose(int[][] matrix) {
        int mat_len = matrix.length, mat_each = matrix[0].length;
        int[][] ans = new int[mat_each][mat_len];
        for (int i = 0; i < mat_len; i++) {
            for (int j = 0; j < mat_each; j++) {
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}
