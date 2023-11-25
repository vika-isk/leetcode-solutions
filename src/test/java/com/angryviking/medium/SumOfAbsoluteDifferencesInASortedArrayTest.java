package com.angryviking.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SumOfAbsoluteDifferencesInASortedArrayTest {

    private static Stream<Arguments> getSumAbsoluteDifferences() {
        return Stream.of(
                Arguments.of(new int[]{2,3,5}, new int[]{4,3,5}),
                Arguments.of(new int[]{1,4,6,8,10}, new int[]{24,15,13,15,21})
        );
    }

    @ParameterizedTest
    @MethodSource("getSumAbsoluteDifferences")
    void getSumAbsoluteDifferencesTest(int[] nums, int[] expectedResult) {
        SumOfAbsoluteDifferencesInASortedArray algorithm = new SumOfAbsoluteDifferencesInASortedArray();
        int[] result = algorithm.getSumAbsoluteDifferences(nums);

        assertArrayEquals(expectedResult, result, "Wrong result");
    }

}
