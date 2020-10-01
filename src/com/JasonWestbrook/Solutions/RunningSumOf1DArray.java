package com.JasonWestbrook.Solutions;

/**********
 * Description:
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 */

public class RunningSumOf1DArray
{
    public static int[] runningSum(int[] nums)
    {
        int currentSum = 0;
        int[] answer = new int[nums.length];

        for (int numIndex = 0; numIndex < nums.length; numIndex++)
        {
            if(numIndex == 0)
            {
                answer[numIndex] = nums[numIndex];
            } else
            {
                answer[numIndex] = answer[numIndex-1] + nums[numIndex];
            }
        }
        return answer;
    }
}
