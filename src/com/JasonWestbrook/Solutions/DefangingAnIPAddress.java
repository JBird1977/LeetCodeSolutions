package com.JasonWestbrook.Solutions;

public class DefangingAnIPAddress
{
    public static String solution(String address)
    {
        char[] result = new char[address.length()+6];
        int j = -1;

        for(int i = 0; i < address.length(); i++)
        {
            j++;
            if(address.charAt(i) == '.')
            {
                result[j] = '[';
                j++;
                result[j] = '.';
                j++;
                result[j] = ']';
            }
            else
            {
                result[j] = address.charAt(i);
            }
        }
        return new String(result);
    }

}
