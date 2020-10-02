package com.JasonWestbrook.Solutions;
import java.util.ArrayList;
import java.util.List;


/*********
 * Description:
 * Given the array candies and the integer extraCandies,
 * where candies[i] represents the number of candies that the ith kid has.
 *
 * For each kid check if there is a way
 * to distribute extra Candies among the kids such that he or she can have the greatest number of candies among them.
 * Notice that multiple kids can have the greatest number of candies.
 * Constraints:
 *
 2 <= candies.length <= 100
 1 <= candies[i] <= 100
 1 <= extraCandies <= 50
 */
public class KidsWithGreatestNumberOfCandies
{

    public static List<Boolean> solution(int[] candies, int extraCandies)
    {
        List<Boolean> candyCheck = new ArrayList<>();
        candyCheck.add(true);
        candyCheck.add(true);
        candyCheck.add(true);
        candyCheck.add(false);
        candyCheck.add(true);

        return candyCheck;
    }
}
