package com.angryviking.medium;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Issue 1727 - Largest Submatrix With Rearrangements
 * https://leetcode.com/problems/largest-submatrix-with-rearrangements/
 */
public class LargestSubmatrixWithRearrangements {

    public int largestSubmatrix(int[][] matrix) {
        int result = 0;

        int mLen = matrix.length;
        int nLen = matrix[0].length;

        List<Integer> currNIndexes = new LinkedList<>();
        List<Integer> nextNIndexes = new LinkedList<>();

        for (int m = 0; m < mLen; m++) {
            currNIndexes.clear();
            if ((mLen - m) * nLen <= result) {
                return result;
            }
            // Take all columns with 1 in matrix[m] line
            for (int n = 0; n < nLen; n++) {
                if (matrix[m][n] == 1) {
                    currNIndexes.add(n);
                }
            }
            result = Math.max(currNIndexes.size(), result);
            if ((mLen - m) * currNIndexes.size() <= result) {
                continue;
            }

            // Go down
            for (int m2 = m + 1; m2 < mLen; m2++) {
                Iterator<Integer> nIter = currNIndexes.iterator();
                while (nIter.hasNext()) {
                    int column = nIter.next();
                    if (matrix[m2][column] == 1) {
                        nextNIndexes.add(column);
                    }
                }
                result = Math.max(nextNIndexes.size() * (m2 - m + 1), result);

                currNIndexes = nextNIndexes;
                nextNIndexes = new LinkedList<>();

                if ((mLen - m) * currNIndexes.size() <= result) {
                    break;
                }
            }
        }

        return result;
    }

    public int largestSubmatrixOptimized(int[][] matrix) {
        int result = 0;

        return result;
    }

}
