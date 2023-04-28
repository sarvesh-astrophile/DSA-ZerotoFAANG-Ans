package com.assignment_05;

import java.util.ArrayList;
import java.util.List;

public class Leet1431_GreatestNumCandies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        ArrayList<Boolean> ans=new ArrayList<>();
        // boolean[] ans=new boolean[candies.length];
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }


        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return ans;
    }
}
