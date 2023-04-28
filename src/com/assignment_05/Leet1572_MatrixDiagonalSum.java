package com.assignment_05;

public class Leet1572_MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(diagonalSum(mat));
        int[][] mat2 = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        System.out.println(diagonalSumOptimized(mat2));
    }

    private static int diagonalSumOptimized(int[][] mat2) {
        int sum = 0;
        int length = mat2.length;
        for (int i = 0; i < length; i++) {
            sum = sum + mat2[i][i] + mat2[i][length - 1 - i];
        }
        if (length % 2 != 0) sum -= mat2[length/2][length/2];
        return sum;

    }

    private static int diagonalSum(int[][] mat) {
        int sum = 0;
        // primary diagonal sum
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i == j) sum += mat[i][j];
            }
        }

        // secondary diagonal sum
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i+j == mat.length-1) sum += mat[i][j];
            }
        }

        // subtract if odd square matrix
        if (mat.length % 2 != 0) sum -= mat[mat.length/2][mat.length/2];
        return sum;
    }
}
