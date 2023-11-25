package com.angryviking.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DiagonalTraverseIITest {

    private static Stream<Arguments> findDiagonalOrderProvider() {
        List<List<Integer>> array2D_1 = new ArrayList<>();
        array2D_1.add(Arrays.asList(1,2,3));
        array2D_1.add(Arrays.asList(4,5,6));
        array2D_1.add(Arrays.asList(7,8,9));

        List<List<Integer>> array2D_2 = new ArrayList<>();
        array2D_2.add(Arrays.asList(1, 2, 3, 4, 5));
        array2D_2.add(Arrays.asList(6, 7));
        array2D_2.add(Arrays.asList(8));
        array2D_2.add(Arrays.asList(9, 10,11,12,13,14));
        array2D_2.add(Arrays.asList(15, 16));

        return Stream.of(
                Arguments.of(array2D_1, new int[]{1,4,2,7,5,3,8,6,9}),
                Arguments.of(array2D_2, new int[]{1, 6, 2, 8, 7, 3, 9, 4, 15, 10, 5, 16, 11, 12, 13, 14})
        );
    }

    @ParameterizedTest
    @MethodSource("findDiagonalOrderProvider")
    void findDiagonalOrderTest(List<List<Integer>> array2D, int[] expectedResult) {
        DiagonalTraverseII algorithm = new DiagonalTraverseII();
        int[] diagonalOrder = algorithm.findDiagonalOrder(array2D);

        assertArrayEquals(expectedResult, diagonalOrder, "Wrong output");
    }

}
