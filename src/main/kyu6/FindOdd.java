package kyu6;

import java.util.ArrayList;
import java.util.List;

/*
DESCRIPTION:
    Given an array of integers, find the one that appears an odd number of times.

    There will always be only one integer that appears an odd number of times.

    Examples
    [7] should return 7, because it occurs 1 time (which is odd).
    [0] should return 0, because it occurs 1 time (which is odd).
    [1,1,2] should return 2, because it occurs 1 time (which is odd).
    [0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
    [1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).
 */
public class FindOdd {
    public static int findIt(int[] a) {
        List<Integer> maybe_odd = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (maybe_odd.contains(a[i])){
                maybe_odd.remove(maybe_odd.indexOf(a[i]));
            }
            else{
                maybe_odd.add(a[i]);
            }
        }
        return maybe_odd.get(0);
    }
    public static int findIt2(int[] A) {
        int xor = 0;
        for (int i = 0; i < A.length; i++) {
            xor ^= A[i];
        }
        return xor;
    }
}
