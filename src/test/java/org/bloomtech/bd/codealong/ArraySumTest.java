package org.bloomtech.bd.codealong;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraySumTest {

    @Test
    public void test_arraySumSolution_returnsCorrectValue() {
        ArraySum arraySum = new ArraySum();
        int[] arr1 = {85, 57, 43, 71, 62};
        int result = arraySum.solution(arr1);
        assertEquals(318, result, "Array Sum Tests Failed");

        int[] arr2 = {82, 27, 86, 9, 7, 3, 49, 50, 6, 51};
        int result2 = arraySum.solution(arr2);
        assertEquals(370, result2, "Array Sum Tests Failed");

        int[] arr3 = {-44, 89, 29, -84, 99, 61, 11, -81, 56, 41, 52, 48, 28, -49, 33, 12, -80, -99, -55, -88};
        int result3 = arraySum.solution(arr3);
        assertEquals(-21, result3, "Array Sum Tests Failed");

        int[] arr4 = {68};
        int result4 = arraySum.solution(arr4);
        assertEquals(68, result4, "Array Sum Tests Failed");

        int[] arr5 = {};
        int result5 = arraySum.solution(arr5);
        assertEquals(0, result5, "Array Sum Tests Failed");
    }
}
