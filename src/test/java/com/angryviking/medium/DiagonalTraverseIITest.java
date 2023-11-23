package com.angryviking.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DiagonalTraverseIITest {

    @Test
    void findDiagonalOrderTest() {
        List<List<Integer>> array2D = new ArrayList<>();
        array2D.add(Arrays.asList(1, 2, 3, 4, 5));
        array2D.add(Arrays.asList(6, 7));
        array2D.add(Arrays.asList(8));
        array2D.add(Arrays.asList(9, 10,11,12,13,14));
        array2D.add(Arrays.asList(15, 16));

        DiagonalTraverseII algorithm = new DiagonalTraverseII();
        int[] diagonalOrder = algorithm.findDiagonalOrder(array2D);

        int[] expected = {1, 6, 2, 8, 7, 3, 9, 4, 15, 10, 5, 16, 11, 12, 13, 14};
        assertArrayEquals(diagonalOrder, expected, "Wrong output");
    }

}
