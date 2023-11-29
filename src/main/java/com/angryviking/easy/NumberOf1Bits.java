package com.angryviking.easy;

/**
 * Issue 191 - Number of 1 Bits
 * https://leetcode.com/problems/number-of-1-bits/
 */
public class NumberOf1Bits {

    public int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

}
