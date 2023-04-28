package com.assignment_05;

public class leet1854_MaximumPopulation {
    public static void main(String[] args) {
        int[][] logs = {{1950, 1961}, {1960, 1971}, {1970, 1981}};
        System.out.println(maximumPopulation(logs));
    }

    private static int maximumPopulation(int[][] logs) {
        int[] answer_year = new int[101];
        // increasing each in array
        for (int i = 0; i < logs.length; i++) {
            answer_year[logs[i][0]-1950]++;
            answer_year[logs[i][1]-1950]--;
        }
        
        // running sum 
        for (int i = 1; i < 101; i++) {
            answer_year[i] += answer_year[i-1];
        }
        
        // getting maximum
        int max_pop = 0;
        int year = 1950;
        for (int i = 0; i < 101; i++) {
            if (max_pop < answer_year[i]){
                max_pop = answer_year[i];
                year = 1950 + i;
            }
        }

        return year;
    }
}
