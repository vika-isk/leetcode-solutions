package com.angryviking.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestSubmatrixWithRearrangementsTest {

    private static Stream<Arguments> largestSubmatrixProvider() {
        return Stream.of(
                Arguments.of(
                        new int[][]{
                                new int[]{0,0,1},
                                new int[]{1,1,1},
                                new int[]{1,0,1}
                        }, 4
                ),
                Arguments.of(
                        new int[][]{
                                new int[]{0,0,1,1,1,1},
                                new int[]{1,0,1,0,1,1},
                                new int[]{1,1,1,0,0,1},
                                new int[]{0,1,0,1,1,0}
                        }, 6
                ),
                Arguments.of(
                        new int[][]{
                                new int[]{1,1,0,0,1,0,1,1,0,1,1,1,1,0,1,1,1,0,1,1,1,0,1,0,0,1,1,1,1,1,0,1,0,1,1},
                                new int[]{1,1,1,1,1,1,0,1,0,1,1,1,0,1,1,1,1,0,1,1,0,1,1,1,1,1,1,0,1,0,0,1,1,1,1},
                                new int[]{1,1,1,0,1,1,1,1,1,0,0,0,1,1,1,0,1,1,1,1,1,1,1,1,1,0,1,1,1,0,1,1,1,1,0}
                        }, 40
                ),
                Arguments.of(
                        new int[][]{
                                new int[]{1,0,1},
                                new int[]{1,0,0},
                                new int[]{1,1,1},
                                new int[]{1,1,1},
                                new int[]{1,1,1},
                                new int[]{1,1,1},

                                new int[]{1,0,0},
                                new int[]{1,1,1},
                                new int[]{1,1,1},
                                new int[]{1,1,1},
                                new int[]{1,1,1},
                                new int[]{1,1,1},
                                new int[]{1,1,1},
                                new int[]{1,1,1}
                        }, 21
                )
        );
    }
    @ParameterizedTest
    @MethodSource("largestSubmatrixProvider")
    void largestSubmatrixTest(int[][] array2D, int expectedResult) {
        LargestSubmatrixWithRearrangements algorithm = new LargestSubmatrixWithRearrangements();
        int result = algorithm.largestSubmatrix(array2D);

        assertEquals(expectedResult, result);
    }

}
