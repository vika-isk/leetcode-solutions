package com.angryviking.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class ArithmeticSubarraysTest {

    @Test
    void checkArithmeticSubarraysTest() {
        int[] nums = {4,6,5,9,3,7};
        int[] l = {0,0,2};
        int[] r = {2,3,5};

        ArithmeticSubarrays algorithm2 = new ArithmeticSubarrays();
        List<Boolean> result = algorithm2.checkArithmeticSubarrays(nums, l, r);

        List<Boolean> expectedResult = Arrays.asList(true, false, true);
        assertIterableEquals(result, expectedResult, "Wrong output");
    }

}
