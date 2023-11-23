package com.angryviking.medium;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

// Issue 1424
public class DiagonalTraverseII {

    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        int[] output = new int[countElements(nums)];
        AtomicInteger currentOutputNum = new AtomicInteger(0);

        List<Iterator<Integer>> reversedIteratorsL = new LinkedList<>();

        for (int m = 0; m < nums.size(); m++) {
            reversedIteratorsL.add(0, nums.get(m).iterator());
            addElementOrRemoveFinishedIter(reversedIteratorsL, output, currentOutputNum);
        }

        while (reversedIteratorsL.iterator().hasNext()) {
            addElementOrRemoveFinishedIter(reversedIteratorsL, output, currentOutputNum);
        }

        return output;
    }

    private void addElementOrRemoveFinishedIter(List<Iterator<Integer>> iteratorsL, int[] output, AtomicInteger currentOutputNum) {
        Iterator<Iterator<Integer>> mIter = iteratorsL.iterator();
        while (mIter.hasNext()) {
            Iterator<Integer> nIter = mIter.next();
            if (nIter.hasNext()) {
                output[currentOutputNum.getAndIncrement()] = nIter.next();
            }
            else {
                mIter.remove();
            }
        }
    }

    private int countElements(List<List<Integer>> array2D) {
        int counter = 0;
        for (List<Integer> arr : array2D) {
            counter += arr.size();
        }
        return counter;
    }

}
