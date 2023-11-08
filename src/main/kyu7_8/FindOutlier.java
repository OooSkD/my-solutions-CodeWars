package kyu7_8;

/*
DESCRIPTION:
    You are given an array (which will have a length of at least 3, but could be very large) containing integers.
    The array is either entirely comprised of odd integers or entirely comprised of even integers except for
    a single integer N.
    Write a method that takes the array as an argument and returns this "outlier" N.
*/
public class FindOutlier {
    public static int find(int[] integers) {
        if (integers[0] % 2 == 0 && integers[1] % 2 == 0) {
            for (int i = 2; i < integers.length; i++)
                if (integers[i] % 2 != 0)
                    return integers[i];
        } else if (integers[0] % 2 != 0 && integers[1] % 2 != 0) {
            for (int i = 2; i < integers.length; i++)
                if (integers[i] % 2 == 0)
                    return integers[i];
        } else
        {
            if (!(integers[1] % 2 != 0 ^ integers[2] % 2 != 0))
                return integers[0];
            else
                return integers[1];
        }
        return 0;
    }
}
