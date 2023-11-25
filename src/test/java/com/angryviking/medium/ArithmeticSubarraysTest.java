package com.angryviking.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class ArithmeticSubarraysTest {

    private static Stream<Arguments> checkArithmeticSubarraysProvider() {
        return Stream.of(
                Arguments.of(
                        new int[]{4,6,5,9,3,7},
                        new int[]{0,0,2},
                        new int[]{2,3,5},
                        Arrays.asList(true, false, true)
                ),
                Arguments.of(
                        new int[]{-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10},
                        new int[]{0,1,6,4,8,7},
                        new int[]{4,4,9,7,9,10},
                        Arrays.asList(false,true,false,false,true,true)
                )
        );
    }

    @ParameterizedTest
    @MethodSource("checkArithmeticSubarraysProvider")
    void checkArithmeticSubarraysTest(int[] nums, int[] l, int[] r, List<Boolean> expectedResult) {
        ArithmeticSubarrays algorithm2 = new ArithmeticSubarrays();
        List<Boolean> result = algorithm2.checkArithmeticSubarrays(nums, l, r);

        assertIterableEquals(expectedResult, result, "Wrong output");
    }

}
