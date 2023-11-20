package com.example.codingtest.array;

import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate {
    /*
        https://www.notion.so/hohwan/Contains-Duplicate-f6b172cfdb5a4fe89cb532b81eec6d6d
     */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (numSet.contains(nums[i])) return true;
            numSet.add(nums[i]);
        }

        return false;
    }
}
