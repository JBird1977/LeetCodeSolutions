package com.JasonWestbrook.Tests;

import org.junit.jupiter.api.Test;

import static com.JasonWestbrook.Solutions.DefangingAnIPAddress.solution;
import static org.junit.jupiter.api.Assertions.*;

class DefangingAnIPAddressTest
{
    @Test
    public void exampleOne()
    {
        String address = "1.1.1.1";
        String expected = "1[.]1[.]1[.]1";
        String actual = solution(address);
        assertEquals(expected, actual);
    }

    @Test
    public void exampleTwo()
    {
        String address = "255.100.50.0";
        String expected = "255[.]100[.]50[.]0";
        String actual = solution(address);
        assertEquals(expected, actual);
    }

}