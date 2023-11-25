package com.angryviking.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AddTwoNumbersTest {

    private static Stream<Arguments> addTwoNumbersProvider() {
        return Stream.of(
                Arguments.of(new int[]{2,4,3}, new int[]{5,6,4}, new int []{7,0,8}),
                Arguments.of(new int[]{0}, new int[]{0}, new int[]{0}),
                Arguments.of(new int[]{9,9,9,9,9,9,9}, new int[]{9,9,9,9}, new int[]{8,9,9,9,0,0,0,1})
        );
    }

    @ParameterizedTest
    @MethodSource("addTwoNumbersProvider")
    void addTwoNumbersTest(int[] arr1, int[] arr2, int[] expectedResultArr) {
        AddTwoNumbers algorithm = new AddTwoNumbers();

        AddTwoNumbers.ListNode l1 = algorithm.createList(arr1);
        AddTwoNumbers.ListNode l2 = algorithm.createList(arr2);

        AddTwoNumbers.ListNode result = algorithm.addTwoNumbers(l1, l2);

        AddTwoNumbers.ListNode expectedResult = algorithm.createList(expectedResultArr);
        assertTrue(algorithm.areListsEquals(expectedResult, result), "Wrong result");
    }

}
