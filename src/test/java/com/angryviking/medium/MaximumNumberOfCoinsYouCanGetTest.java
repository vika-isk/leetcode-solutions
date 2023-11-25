package com.angryviking.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumNumberOfCoinsYouCanGetTest {

    private static Stream<Arguments> maxCoinsProvider() {
        return Stream.of(
                Arguments.of(new int[]{2,4,1,2,7,8}, 9),
                Arguments.of(new int[]{2,4,5}, 4),
                Arguments.of(new int[]{9,8,7,6,5,1,2,3,4}, 18)
        );
    }

    @ParameterizedTest
    @MethodSource("maxCoinsProvider")
    void maxCoinsTest(int[] piles, int expectedAmountOfCoins) {
        MaximumNumberOfCoinsYouCanGet algorithm = new MaximumNumberOfCoinsYouCanGet();
        int maxCoins = algorithm.maxCoins(piles);

        assertEquals(expectedAmountOfCoins, maxCoins, "Maximum amount of money must be " + expectedAmountOfCoins);
    }

}
