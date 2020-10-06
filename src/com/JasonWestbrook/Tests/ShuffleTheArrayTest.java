package com.JasonWestbrook.Tests;
import org.junit.jupiter.api.Test;
import static com.JasonWestbrook.Solutions.ShuffleTheArray.solution;
import static org.junit.jupiter.api.Assertions.*;

class ShuffleTheArrayTest
{
    @Test
    void testExampleOne()
    {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] expected = {2,3,5,4,1,7};
        int[] actual = solution(nums, n);
        assertArrayEquals(expected, actual);
    }
}