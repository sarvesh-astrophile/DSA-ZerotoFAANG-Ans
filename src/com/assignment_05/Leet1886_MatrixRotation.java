package com.assignment_05;

import java.util.Arrays;

public class Leet1886_MatrixRotation {
    public static void main(String[] args) {
        int[][] mat = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        int[][] target = {{1, 1, 1}, {0, 1, 0}, {0, 0, 0}};
        System.out.println(findRotation(mat, target));
    }

    private static boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
           if (check2Darray(mat, target)) return true;
           else mat = rotate90(mat);
        }
        return false;
    }

    private static int[][] rotate90(int[][] mat) {
        int temp = 0;
        // getting transpose
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < i; j++) {
                temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // mirroring from middle
        int start = 0;
        int end = mat.length - 1;
        while (start <= end){
            for (int i = 0; i < mat.length; i++) {
                temp = mat[i][start];
                mat[i][start] = mat[i][end];
                mat[i][end] = temp;
            }
            start++;
            end--;
        }
        return mat;
    }

    private static boolean check2Darray(int[][] mat, int[][] target) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] != target[i][j]) return false;
            }
        }
        return true;
    }
}
