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
    @Test
    void testExampleTwo()
    {
        int[] nums = {1,2,3,4,4,3,2,1};
        int n = 4;
        int[] expected = {1,4,2,3,3,2,4,1};
        int[] actual = solution(nums, n);
        assertArrayEquals(expected, actual);
    }
    @Test
    void testExampleThree()
    {
        int[] nums = {1,1,2,2};
        int n = 2;
        int[] expected = {1,2,1,2};
        int[] actual = solution(nums, n);
        assertArrayEquals(expected, actual);
    }
}