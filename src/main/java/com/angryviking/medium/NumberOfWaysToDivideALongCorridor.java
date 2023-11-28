package com.angryviking.medium;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Issue 2147 - Number of Ways to Divide a Long Corridor
 * https://leetcode.com/problems/number-of-ways-to-divide-a-long-corridor/
 */
public class NumberOfWaysToDivideALongCorridor {

    String corridor;
    private static final int mod = (int) 1e9 + 7;

    public int numberOfWays(String corridor) {
        this.corridor = corridor;
        List<Integer> amountOfDividersPosition = new LinkedList<>();
        int seatsPast = 0;
        Boolean atLeastTwoSeats = false;

        for (int i = 0; i < corridor.length(); i++) {
            if (seatsPast == 2) {
                int plantsAmount = countPlants(i);
                if (plantsAmount == -1) {
                    break;
                }
                amountOfDividersPosition.add(plantsAmount + 1);
                seatsPast = 0;

                i += plantsAmount;
                if (i >= corridor.length()) {
                    break;
                }
            }

            if (corridor.charAt(i) == 'S') {
                seatsPast++;
                if (seatsPast == 2) {
                    atLeastTwoSeats = true;
                }
            }
        }

        if (seatsPast == 1) {
            return 0;
        }
        if (!atLeastTwoSeats) {
            return 0;
        }

        if (amountOfDividersPosition.size() == 0) {
            return 1;
        }

        Iterator<Integer> iter = amountOfDividersPosition.iterator();
        long result = iter.next();
        while (iter.hasNext()) {
            result = (result * iter.next()) % mod;
        }

        return (int) result;
    }

    private int countPlants(int startPosition) {
        int plantCounter = 0;
        for (; startPosition < corridor.length(); startPosition++) {
            if (corridor.charAt(startPosition) == 'P') {
                plantCounter++;
            }
            else return plantCounter;
        }
        return -1;
    }

}
