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
}