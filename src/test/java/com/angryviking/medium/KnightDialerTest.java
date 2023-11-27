package com.angryviking.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KnightDialerTest {


    @ParameterizedTest
    @CsvSource({"1,10", "2,20", "3,46"})
    void knightDialerTest(int n, int expectedResult) {
        KnightDialer algorithm = new KnightDialer();
        int result = algorithm.knightDialer(n);

        assertEquals(expectedResult, result, "Result have to be " + expectedResult + ", but it was " + result);
    }

    @ParameterizedTest
    @CsvSource({"1,10", "2,20", "3,46", "3131,136006598"})
    void knightDialerOptimizedTest() {
        int n = 3;
        int expectedResult = 46;

        KnightDialer algorithm = new KnightDialer();
        int result = algorithm.knightDialerOptimized(n);
        assertEquals(expectedResult, result, "Result have to be " + expectedResult + ", but it was " + result);
    }

}
