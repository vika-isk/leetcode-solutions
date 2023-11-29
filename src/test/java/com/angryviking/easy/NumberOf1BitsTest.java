package com.angryviking.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOf1BitsTest {

    @ParameterizedTest
    @CsvSource({"11, 3",    // 00000000000000000000000000001011
            "128, 1",       // 00000000000000000000000010000000
            "-3, 31"        // 11111111111111111111111111111101
    })
    void hammingWeightTest(int n, int expectedResult) {
        NumberOf1Bits algorithm = new NumberOf1Bits();
        int result = algorithm.hammingWeight(n);

        assertEquals(expectedResult, result);
    }

}
