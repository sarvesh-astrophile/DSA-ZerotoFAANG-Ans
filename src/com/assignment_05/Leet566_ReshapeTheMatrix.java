package com.assignment_05;

import java.util.Arrays;

public class Leet566_ReshapeTheMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1, 2}, {3, 4}};
        int r = 1, c = 4;
        int[][] result = matrixReshape(mat, r, c);
        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
            System.out.println("\n");
        }
    }

    private static int[][] matrixReshape(int[][] mat, int r, int c) {
        // checking legality of the matrix
        int r1 = mat.length;
        int c1 = mat[0].length;
        if (r*c == r1*c1) {
            int[][] answer = new int[r][c];
            int row = 0, col = 0;
            for (int j = 0; j < r; j++) {
                for (int i = 0; i < c; i++) {
                    if (col == c1) {
                        row++;
                        col = 0;
                    }
                    answer[j][i] = mat[row][col];
                    col++;
                }
            }
            return answer;
        } else return mat;
    }
}
