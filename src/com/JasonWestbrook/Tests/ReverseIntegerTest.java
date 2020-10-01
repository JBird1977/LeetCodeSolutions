package com.JasonWestbrook.Tests;
import org.junit.jupiter.api.Test;
import static com.JasonWestbrook.Solutions.ReverseInteger.solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseIntegerTest
{
    @Test
    void test123expect321()
    {
        int actual = solution(123);
        int expected = 321;
        assertEquals(expected, actual);
    }

    @Test
    void testNegative234expectNegative432()
    {
        int actual = solution(-234);
        int expected = -432;
        assertEquals(expected, actual);
    }


    @Test
    void test1534236469expectZero()
    {
        int actual = solution(1534236469);
        int expected = 0;
        assertEquals(expected, actual);
    }
}