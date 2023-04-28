package com.assignment_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet1389_ArrayInGivenOrder {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }

    private static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < index.length; i++) {
            ans.add(index[i], nums[i]);
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}
