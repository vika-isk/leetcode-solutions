package com.angryviking.medium;

import java.util.Arrays;

// Issue 1561 - Maximum Number of Coins You Can Get
public class MaximumNumberOfCoinsYouCanGet {

    public int maxCoins(int[] piles) {
        int maxCoins = 0;
        Arrays.sort(piles);
        int j = piles.length - 1;
        for (int i = 0; i < piles.length / 3; i++) {
            maxCoins += piles[j - 1];
            j -= 2;
        }

        return maxCoins;
    }

}
