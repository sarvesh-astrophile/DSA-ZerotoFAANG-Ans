package com.assignment_05;

import java.util.Arrays;

public class Leet1252_CellsWithOddValues {
    public static void main(String[] args) {
        int m = 2, n = 3;
        int[][] indices = {{0,1},{1,1}};
        System.out.println(oddCellsOptimized(m, n, indices));
    }

    private static int oddCellsOptimized(int m, int n, int[][] indices) {
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        for (int i = 0; i < indices.length; i++) {
            row[indices[i][0]] ^= true;
            col[indices[i][1]] ^= true;
        }
        int r = 0,c =0;
        for (int i = 0; i < m; i++) {
            if (row[i]) r++;
        }
        for (int i = 0; i < n; i++) {
            if (col[i]) c++;
        }
        return r*n + c*m - 2*r*c;
    }

    private static int oddCells(int m, int n, int[][] indices) {
        // generating matrix
        int[][] answer = new int[m][n];

        // increment rows and columns
        for (int i = 0; i < indices.length; i++) {
            // increment row
            for (int j = 0; j < n; j++) {
                answer[indices[i][0]][j]++;
            }
            
            // increment column
            for (int j = 0; j < m; j++) {
                answer[j][indices[i][1]]++;
            }
        }
        // counting number of odd-valued cells
        int numberOfOdds = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (answer[i][j]%2 != 0) numberOfOdds++;
            }
        }

        return numberOfOdds;
    }

    // optimized approach



}
