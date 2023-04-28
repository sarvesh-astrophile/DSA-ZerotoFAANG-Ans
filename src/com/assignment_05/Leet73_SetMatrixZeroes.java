package com.assignment_05;

import java.util.ArrayList;
import java.util.Arrays;

public class Leet73_SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    private static void setZeroes(int[][] matrix) {
        // making matrix and put 1 when we get a 0
        int[] forRow = new int[matrix.length];
        int[] forCol = new int[matrix[0].length];

        // running the loop
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0){
                    forRow[i] = 1;
                    forCol[j] = 1;
                }
            }
        }

        // making zeros col
        for (int i = 0; i < forRow.length; i++) {
            if (forRow[i] == 1){
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // making zeros row
        for (int i = 0; i < forCol.length; i++) {
            if (forCol[i] == 1){
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
    }
}
