package kyu6;
import org.apache.commons.lang3.ArrayUtils;

/*
DESCRIPTION:
    Write a function that takes an array of numbers (integers for the tests) and a target number.
    It should find two different items in the array that, when added together, give the target value.
    The indices of these items should then be returned in a tuple / list (depending on your language) like so:
    (index1, index2).

    For the purposes of this kata, some tests may have multiple answers; any valid solutions will be accepted.

    The input will always be valid (numbers will be an array of length 2 or greater,
    and all of the items will be numbers; target will always be the sum of two different items from that array).
 */

public class Solution
{
    public static int[] twoSum(int[] numbers, int target)
    {
        int[] res=new int[2];
        int temp,index2;
        for (int i = 0; i < numbers.length; i++) {
            res[0]=i;
            temp=target-numbers[i];
            index2=ArrayUtils.indexOf(numbers, temp);
            if (index2 != -1){
                res[1]=index2;
                break;
            }
        }
        return res;
    }
}
