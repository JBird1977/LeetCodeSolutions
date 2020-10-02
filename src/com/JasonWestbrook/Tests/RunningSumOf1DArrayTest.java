package com.JasonWestbrook.Tests;
import org.junit.jupiter.api.Test;
import static com.JasonWestbrook.Solutions.RunningSumOf1DArray.solution;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RunningSumOf1DArrayTest
{

    @Test
    void testOneThroughFive()
    {
        int[] nums = {1,2,3,4,5};
        int[] expected = {1, 3, 6, 10, 15};
        int[] actual = solution(nums);
        assertArrayEquals(expected, actual);
    }
    @Test
    void testNegativeNumbers()
    {
        int[] nums = {-1,-3,-5,-7,-9};
        int[] expected = {-1,-4,-9,-16,-25};
        int[] actual = solution(nums);
        assertArrayEquals(expected, actual);
    }
}