package com.JasonWestbrook.Solutions;

/***********
 * Description:
 * Given a 32-bit signed integer, reverse digits of an integer.
 */

public class ReverseInteger
{
    public static int solution(int x)
    {
        long xAsLong = x;
        if (xAsLong > Integer.MAX_VALUE || xAsLong < Integer.MIN_VALUE) return 0;
        String xAsString = String.valueOf(x);
        int negativeValueModifier = 0;
        if (x<0)
        {
            negativeValueModifier = 1;
        }
        char[] xAsCharArray = new char[xAsString.length()];

        for (int index = 0; index<xAsCharArray.length; index++)
        {
            xAsCharArray[index] = xAsString.charAt(index);
        }
        char[] reverseXAsCharArray = new char[xAsCharArray.length];
        for (int index = 0; index < reverseXAsCharArray.length - negativeValueModifier; index++)
        {
            reverseXAsCharArray[index + negativeValueModifier] = xAsCharArray[xAsCharArray.length-index-1];
        }
        if (negativeValueModifier == 1)
        {
            reverseXAsCharArray[0] = '-';
        }
        try
        {
            return Integer.parseInt(new String(reverseXAsCharArray));
        } catch (NumberFormatException e)
        {
            return 0;
        }
    }

    public static void main(String[] args)
    {
        int answer = solution(1534236469);
        System.out.println("The answer is: " + answer);
    }
}
