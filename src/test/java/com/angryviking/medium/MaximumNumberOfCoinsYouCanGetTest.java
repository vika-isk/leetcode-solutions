package com.angryviking.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumNumberOfCoinsYouCanGetTest {

    @Test
    void maxCoinsTest() {
        int piles[] = {9,8,7,6,5,1,2,3,4};

        MaximumNumberOfCoinsYouCanGet algorithm = new MaximumNumberOfCoinsYouCanGet();
        int maxCoins = algorithm.maxCoins(piles);

        int expectedAmountOfCoins = 18;
        assertEquals(maxCoins, expectedAmountOfCoins, "Maximum amount of money must be " + expectedAmountOfCoins);
    }

}
