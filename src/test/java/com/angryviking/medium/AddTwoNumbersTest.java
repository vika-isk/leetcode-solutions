package com.angryviking.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AddTwoNumbersTest {

    @Test
    void addTwoNumbersTest() {
        AddTwoNumbers algorithm = new AddTwoNumbers();
        int[] arr1 = {9,9,9,9,9,9,9};
        int[] arr2 = {9,9,9,9};

        AddTwoNumbers.ListNode l1 = algorithm.createList(arr1);
        AddTwoNumbers.ListNode l2 = algorithm.createList(arr2);

        AddTwoNumbers.ListNode result = algorithm.addTwoNumbers(l1, l2);

        int[] expectedResultArr = {8,9,9,9,0,0,0,1};
        AddTwoNumbers.ListNode expectedResult = algorithm.createList(expectedResultArr);
        assertTrue(algorithm.areListsEquals(result, expectedResult), "Wrong result");
    }

    @Test
    void addTwoNumbersTest2() {
        AddTwoNumbers algorithm = new AddTwoNumbers();
        int[] arr1 = {0};
        int[] arr2 = {0};

        AddTwoNumbers.ListNode l1 = algorithm.createList(arr1);
        AddTwoNumbers.ListNode l2 = algorithm.createList(arr2);

        AddTwoNumbers.ListNode result = algorithm.addTwoNumbers(l1, l2);

        int[] expectedResultArr = {0};
        AddTwoNumbers.ListNode expectedResult = algorithm.createList(expectedResultArr);
        assertTrue(algorithm.areListsEquals(result, expectedResult), "Wrong result");
    }

    @Test
    void addTwoNumbersTes3() {
        AddTwoNumbers algorithm = new AddTwoNumbers();
        int[] arr1 = {2,4,3};
        int[] arr2 = {5,6,4};

        AddTwoNumbers.ListNode l1 = algorithm.createList(arr1);
        AddTwoNumbers.ListNode l2 = algorithm.createList(arr2);

        AddTwoNumbers.ListNode result = algorithm.addTwoNumbers(l1, l2);

        int[] expectedResultArr = {7,0,8};
        AddTwoNumbers.ListNode expectedResult = algorithm.createList(expectedResultArr);
        assertTrue(algorithm.areListsEquals(result, expectedResult), "Wrong result");
    }

}
