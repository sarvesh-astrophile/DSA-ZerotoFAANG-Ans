package com.assignment_05;

import java.util.Arrays;

public class Leet885_SpiralMatrix3 {
    public static void main(String[] args) {
        int rows = 5, cols = 6, rStart = 1, cStart = 4;
        int[][] answer = spiralMatrixIII2(rows, cols, rStart, cStart);
        for (int i = 0; i < answer.length; i++) {
            System.out.printf(Arrays.toString(answer[i]));
            System.out.printf(",");
        }
    }

    private static int[][] spiralMatrixIII2(int rows, int cols, int rStart, int cStart) {
        int res[][] = new int[rows*cols][2];
        int idx=0;
        int rEnd = rStart;
        int cEnd = cStart;
        while(true){

            //topRow
            if(rStart>=0){
                for(int i=cStart ; i<=cEnd ; i++){
                    if(0<=i && i<cols){
                        res[idx][0] = rStart;
                        res[idx++][1] = i;
                    }
                }
            }
            cEnd++;
            if(idx==res.length) break;

            //rightCol
            if(cEnd<cols){
                for(int i=rStart ; i<=rEnd ; i++){
                    if(0<=i && i<rows){
                        res[idx][0] = i;
                        res[idx++][1] = cEnd;
                    }
                }
            }
            rEnd++;
            if(idx==res.length) break;

            //downRow
            if(rEnd<rows){
                for(int i=cEnd ; i>=cStart ; i--){
                    if(0<=i && i<cols){
                        res[idx][0] = rEnd;
                        res[idx++][1] = i;
                    }
                }
            }
            cStart--;
            if(idx==res.length) break;

            //leftcol
            if(cStart>=0){
                for(int i=rEnd ; i>=rStart ; i--){
                    if(0<=i && i<rows){
                        res[idx][0] = i;
                        res[idx++][1] = cStart;
                    }
                }
            }
            rStart--;
            if(idx==res.length) break;

        }
        return res;
    }

}
