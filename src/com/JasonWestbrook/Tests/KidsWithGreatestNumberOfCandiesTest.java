package com.JasonWestbrook.Tests;
import static com.JasonWestbrook.Solutions.KidsWithGreatestNumberOfCandies.solution;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KidsWithGreatestNumberOfCandiesTest
{
    @Test
    public void exampleOne()
    {
        List <Boolean> expected = new ArrayList<>();
        expected.add(true);
        expected.add(true);
        expected.add(true);
        expected.add(false);
        expected.add(true);
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> actual = solution(candies, extraCandies);
        assertIterableEquals(expected, actual);
    }


}