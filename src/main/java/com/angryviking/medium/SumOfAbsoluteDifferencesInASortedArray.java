package com.angryviking.medium;

/**
 * Issue 1685 - Sum of Absolute Differences in a Sorted Array
 * https://leetcode.com/problems/sum-of-absolute-differences-in-a-sorted-array/
 */
public class SumOfAbsoluteDifferencesInASortedArray {

    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] result = new int[nums.length];

        int sum = 0;
        for (int n : nums) {
            sum += n;
        }

        int leftSum = 0;
        int rightSum = sum;
        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];
            result[i] = (nums[i] * i - leftSum) + (rightSum - nums[i] * (nums.length - i - 1));
            leftSum += nums[i];
        }

        return result;
    }

}
