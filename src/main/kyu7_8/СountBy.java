package kyu7_8;

import java.util.stream.IntStream;

/*
DESCRIPTION:
    Create a function with two arguments that will return an array of the first n multiples of x.
    Assume both the given number and the number of times to count will be positive numbers greater than 0.
    Return the results as an array or list ( depending on language ).
 */
public class СountBy {
    public static int[] countBy(int x, int n){
        return IntStream.range(1, n+1).map(a->a*x).toArray();
    }
}
