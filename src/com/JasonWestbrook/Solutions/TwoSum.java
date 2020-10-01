package com.JasonWestbrook.Solutions;

/***********
 * Description:
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 */

public class TwoSum
{
    public static int[] twoSum(int[] nums, int target)
    {
        int testSum = 0;
        int[] answer = {0,0};
        boolean indiciesFound = false;


            for (int firstIndex = 0; firstIndex < nums.length; firstIndex++)
            {
                for (int secondIndex = 0; secondIndex <nums.length; secondIndex++)
                {
                    if (secondIndex != firstIndex)
                    {
                        testSum = nums[firstIndex] + nums[secondIndex];
                        if (testSum == target)
                        {
                            answer[0] = firstIndex;
                            answer[1] = secondIndex;
                            indiciesFound = true;
                            break;
                        }
                    }
                }
                if (indiciesFound)
                {
                    break;
                }

            }


        return answer;




    }

    public static void main(String[] args)
    {
        int[] nums = {3,2,5,8,9,10,4};
        int target = 6;

        int[] answer = twoSum(nums, target);
        System.out.println("The answer is: " + answer[0] + " " + answer[1]);



    }
}
