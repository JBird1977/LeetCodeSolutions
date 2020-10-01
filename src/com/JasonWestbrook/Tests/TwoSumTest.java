package com.JasonWestbrook.Tests;
import org.junit.jupiter.api.Test;
import static com.JasonWestbrook.Solutions.TwoSum.twoSum;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class TwoSumTest
{

    @Test
    void testOneTwoThreeTargetFiveExpectOneTwo()
    {
        int[] nums = {1,2,3};
        int target = 5;
        int[] expected = {1,2};
        int[] actual = twoSum(nums, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testOneThreeFiveTargetFourExpectZeroOne()
    {
        int[] nums = {1,3,5};
        int target = 4;
        int[] expected = {0,1};
        int[] actual = twoSum(nums, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testOneThreeFiveSevenNineTargetSixteenExpectThreeFour()
    {
        int[] nums = {1,3,5,7,9};
        int target = 16;
        int[] expected = {3,4};
        int[] actual = twoSum(nums, target);
        assertArrayEquals(expected, actual);
    }
}