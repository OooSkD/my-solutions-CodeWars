package kyu7_8;

/*
DESCRIPTION:
    Given two integers a and b, which can be positive or negative, find the sum of all the integers between and including them and return it. If the two numbers are equal return a or b.
    Note: a and b are not ordered!
    Your function should only return a number, not the explanation about how you get that number.
*/

public class Sum {
    public static int GetSum(int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        return (max - min + 1) * (max + min) / 2;
    }
}
