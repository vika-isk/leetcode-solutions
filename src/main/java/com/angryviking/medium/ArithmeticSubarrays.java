package com.angryviking.medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// Issue 1630 - Arithmetic Subarrays
public class ArithmeticSubarrays {

    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> output = new LinkedList<>();

        for (int i = 0; i < l.length; i++) {
            int[] rangedNums = Arrays.copyOfRange(nums, l[i], r[i] + 1);
            Arrays.sort(rangedNums);
            output.add(isArrayArithmetic(rangedNums));
        }

        return output;
    }

    private Boolean isArrayArithmetic(int[] array) {
        int diff = array[0] - array[1];
        for(int i = 1; i < array.length - 1; i++) {
            if (array[i] - array[i + 1] != diff) {
                return false;
            }
        }
        return true;
    }

}
