package com.JasonWestbrook.Solutions;

/*********
 * Description:
 * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
 *
 * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 * Constraints:
 *1 <= n <= 500
 *nums.length == 2n
 *1 <= nums[i] <= 10^3
 */

public class ShuffleTheArray
{
    public static int[] solution(int[] nums, int n)
    {
        int[] answer = new int[nums.length];
        int firstHalfIndex = 0;
        int secondHalfIndex = n;
        int answerIndex = -1;


        while (answerIndex < nums.length-1)
        {

            answerIndex++;
            answer[answerIndex] = nums[firstHalfIndex];
            answerIndex++;
            answer[answerIndex] = nums[secondHalfIndex];
            firstHalfIndex++;
            secondHalfIndex++;
        }
        return answer;
    }

}
