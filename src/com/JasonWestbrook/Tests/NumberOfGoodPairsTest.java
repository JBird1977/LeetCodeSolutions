package com.JasonWestbrook.Tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static com.JasonWestbrook.Solutions.NumberOfGoodPairs.solution;
class NumberOfGoodPairsTest
{

    @Test
    public void exampleOne()
    {
        int[] nums = {1,2,3,1,1,3};
        int expected = 4;
        int actual = solution(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void exampleTwo()
    {
        int[] nums = {1,1,1,1};
        int expected = 6;
        int actual = solution(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void exampleThree()
    {
        int[] nums = {1,2,3};
        int expected = 0;
        int actual = solution(nums);
        assertEquals(expected, actual);
    }

}