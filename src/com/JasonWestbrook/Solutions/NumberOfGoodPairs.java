package com.JasonWestbrook.Solutions;

/**********
 * Description:
 * Given an array of integers nums.
 *
 * A pair (i,j) is called good if nums[i] == nums[j] and i < j.
 *
 * Return the number of good pairs.
 */

public class NumberOfGoodPairs
{
    public static int solution(int[] nums)
    {
        int pairCount = 0;
        int i = 0;
        boolean resetLoop = false;

        while (i < nums.length)
        {
            for (int j = 0; j<nums.length; j++)
            {
                if(resetLoop)
                {
                    j = i;
                    resetLoop = false;
                }
                if((i<j) && nums[i] == nums[j])
                {
                    pairCount++;
                }

            }
            i++;
            resetLoop = true;
        }
        return pairCount;
    }
}
