package com.JasonWestbrook.Tests;

import com.JasonWestbrook.Solutions.NumberOfGoodPairs;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static com.JasonWestbrook.Solutions.NumberOfGoodPairs.numIdenticalPairs;
class NumberOfGoodPairsTest
{

    @Test
    public void exampleOne()
    {
        int[] nums = {1,2,3,1,1,3};
        int expected = 4;
        int actual = numIdenticalPairs(nums);
        assertEquals(expected, actual);
    }

}