package com.JasonWestbrook.Tests;

import org.junit.jupiter.api.Test;

import static com.JasonWestbrook.Solutions.JewelsAndStones.solution;
import static org.junit.jupiter.api.Assertions.*;

/**********
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
 * Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
 *
 * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive,
 * so "a" is considered a different type of stone from "A".
 */
class JewelsAndStonesTest
{
    @Test
    public void exampleOne()
    {
        String J = "aA";
        String S = "aAAbbbb";
        int expected = 3;
        int actual  = solution(J, S);
        assertEquals(expected, actual);

    }
}