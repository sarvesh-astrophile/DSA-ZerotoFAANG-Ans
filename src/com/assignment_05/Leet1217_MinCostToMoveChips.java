package com.assignment_05;

import java.util.ArrayList;
import java.util.Arrays;

public class Leet1217_MinCostToMoveChips {
    public static void main(String[] args) {
        int[] position = {2,2,2,3,3};
        System.out.println("Cost is: "+minCostToMoveChips1(position));
    }

    private static int minCostToMoveChips1(int[] position) {
        int odd = 0, even = 0, pos = 0;
        for (int i = 0; i < position.length; i++){
            pos = position[i];
            if (pos%2 == 0) even++;
            else odd++;
        }
        if (odd<even) return odd;
        else return even;
    }

    // designing with finding max position
    private static int minCostToMoveChips(int[] position) {

        // sorting position
        Arrays.sort(position);

        // getting max no of the pos
        int[] max_pos = new int[2];
        int[] count = new int[2];
        count[0] = position[0];
        for (int i = 0; i < position.length; i++) {
            if (count[0] == position[i]){
                count[1]++;
            } else {
                if (max_pos[1] <= count[1]) {
                    max_pos[0] = count[0];
                    max_pos[1] = count[1];
                }
                // reset the count with current
                count[0] = position[i];
                count[1] = 1;
            }
        }

        if (max_pos[1] <= count[1]) {
            max_pos[0] = count[0];
            max_pos[1] = count[1];
        }

        // estimating the cost
        int cost = 0;
        for (int i = 0; i < position.length; i++) {
            if ((position[i] - max_pos[0])%2 != 0) {
                cost++;
            }
        }

        return cost;
    }

}
