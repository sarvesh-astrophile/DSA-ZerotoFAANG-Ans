package com.assignment_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet1773_CountMatching {
    public static void main(String[] args) {
        List<String> inner1 = new ArrayList<String>(Arrays.asList("phone","blue","pixel"));
        List<String> inner2 = new ArrayList<String>(Arrays.asList("computer","silver","lenovo"));
        List<String> inner3 = new ArrayList<String>(Arrays.asList("phone","gold","iphone"));
        List<List<String>> items = new ArrayList<>();
        items.add(inner1);
        items.add(inner2);
        items.add(inner3);
        //System.out.println(items);

        String ruleKey = "color";
        String ruleValue = "silver";
        System.out.println(countMatches(items, ruleKey, ruleValue));
    }

    private static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        // getting check_index to check at execution
        int check_index = 0;
        if(ruleKey.equalsIgnoreCase("type")){
            check_index = 0;
        } else {
            if (ruleKey.equalsIgnoreCase("color")){
                check_index = 1;
            } else {
                if (ruleKey.equalsIgnoreCase("name")){
                    check_index = 2;
                }
            }
        }


        // checking ruleValue in the ArrayList of ArrayList
        int ans = 0;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(check_index).equals(ruleValue)){
                ans++;
            }
        }

        return ans;
    }
}
