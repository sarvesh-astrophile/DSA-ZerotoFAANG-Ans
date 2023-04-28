package com.assignment_05;

import java.util.Arrays;

public class Leet832_FlippingImage {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        print2D(flipAndInvertImage(image));
    }

    private static int[][] flipAndInvertImage(int[][] image) {
        int[][] ans = new int[image.length][image.length];
        // horizontal flip of matrix
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image.length; j++) {
                ans[i][j] = invertNum(image[i][(image.length-1)-j]);
            }
        }
        return ans;
        // inversion of matrix
    }

    private static int invertNum(int i) {
        if (i == 0) return 1;
        else return 0;
    }

    public static void print2D(int mat[][]) {
        // Loop through all rows
        for (int i = 0; i < mat.length; i++) {
            // Loop through all elements of current row
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
