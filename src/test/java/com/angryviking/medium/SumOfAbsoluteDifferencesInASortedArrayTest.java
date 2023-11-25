package com.angryviking.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SumOfAbsoluteDifferencesInASortedArrayTest {


    @Test
    void getSumAbsoluteDifferencesTest() {
        int nums[] = {2,3,5};

        SumOfAbsoluteDifferencesInASortedArray algorithm = new SumOfAbsoluteDifferencesInASortedArray();
        int[] result = algorithm.getSumAbsoluteDifferences(nums);

        int[] expectedResult = {4,3,5};
        assertArrayEquals(expectedResult, result, "Wrong result");
    }


    @Test
    void getSumAbsoluteDifferencesTest2() {
        int nums[] = {1,4,6,8,10};

        SumOfAbsoluteDifferencesInASortedArray algorithm = new SumOfAbsoluteDifferencesInASortedArray();
        int[] result = algorithm.getSumAbsoluteDifferences(nums);

        int[] expectedResult = {24,15,13,15,21};
        assertArrayEquals(expectedResult, result, "Wrong result");
    }

}
