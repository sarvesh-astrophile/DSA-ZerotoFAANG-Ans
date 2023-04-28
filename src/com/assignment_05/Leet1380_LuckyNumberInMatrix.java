package com.assignment_05;

import java.util.ArrayList;
import java.util.List;

public class Leet1380_LuckyNumberInMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 10, 4, 2}, {9, 2, 8, 7}, {15, 16, 17, 12}};
        System.out.println(luckyNumbers(matrix));
    }

    private static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> answer = new ArrayList<>();
        // find minimum in row
        for (int row = 0; row < matrix.length; row++) {
            int minCol = minInRow(matrix, row);
            int value = matrix[row][minCol];
            if (isMaxInCol(matrix, row, minCol)) answer.add(matrix[row][minCol]);
        }
        return answer;
    }

    private static boolean isMaxInCol(int[][] matrix, int row, int minCol) {
        for (int rowcheck = 0; rowcheck < matrix.length; rowcheck++) {
            if (matrix[row][minCol] < matrix[rowcheck][minCol]) return false;
        }
        return true;
    }

    private static int minInRow(int[][] matrix, int row) {
        int min = matrix[row][0];
        int minCol = 0;
        for (int col = 0; col < matrix[0].length; col++) {
            if (min > matrix[row][col]){
                min = matrix[row][col];
                minCol = col;
            }
        }
        return minCol;
    }

}
