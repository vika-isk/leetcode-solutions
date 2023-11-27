package com.angryviking.medium;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Issue 935 - Knight Dialer
 * https://leetcode.com/problems/knight-dialer/
 */
public class KnightDialer {

    int[][] mapping = {
            {4, 6},
            {6, 8},
            {7, 9},
            {4, 8},
            {0, 3, 9},
            {},
            {0, 1, 7},
            {2, 6},
            {1, 3},
            {2, 4}
    };

    int n = 0;

    int[][] answers;
    int mod = (int) 1e9 + 7;

    public int knightDialer(int n) {
        this.n = n;
        AtomicInteger possibleAmountOfNumbers = new AtomicInteger(0);

        int depth = 0;
        for (int digit = 0; digit <= 9; digit++) {
            goIn(digit,   depth + 1, possibleAmountOfNumbers);
        }

        return possibleAmountOfNumbers.get();
    }

    private void goIn(int currentDigit, int currDepth, AtomicInteger possibleAmountOfNumbers) {
        if (currDepth == n) {
            possibleAmountOfNumbers.incrementAndGet();
            return;
        }
        for (int i = 0; i < mapping[currentDigit].length; i++) {
            goIn(mapping[currentDigit][i], currDepth + 1, possibleAmountOfNumbers);
        }
    }

    public int knightDialerOptimized(int n) {
        this.n = n;
        answers = new int[n][10];

        int amount = 0;
        for (int digit = 0; digit <= 9; digit++) {
            amount += getDeeper(digit, n - 1) % mod;
            amount = amount % mod;
        }

        return amount;
    }

    int getDeeper(int digit, int depth) {
        if (depth == 0) {
            return 1;
        }

        if (answers[depth][digit] != 0) {
            return answers[depth][digit];
        }

        int amount = 0;
        for (int i = 0; i < mapping[digit].length; i++) {
            amount += getDeeper(mapping[digit][i], depth - 1) % mod;
            amount = amount % mod;
        }
        answers[depth][digit] = amount;
        return amount;
    }

}
