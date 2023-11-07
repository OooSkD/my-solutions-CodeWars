package kyu7_8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Kata {
    /*
    DESCRIPTION:
        In this simple assignment you are given a number and have to make it negative. But maybe the number is already negative?
        Notes: The number can be negative already, in which case no change is required.
        Zero (0) is not checked for any specific sign. Negative zeros make no mathematical sense.
    */
    public static int makeNegative(final int a){
        return (a<=0) ? a:-a;
    }

    /*
    DESCRIPTION:
        Convert number to reversed array of digits
        Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
    */
    public static int[] digitizeMy1(long n) {
        if (n<=0) return new int[]{0};
        int lenght = String.valueOf(n).length();
        int[] numArr = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            numArr[i] = (int) (n % 10);
            n = n/10;
        }
        return numArr;
    }

    /*
    DESCRIPTION:
        Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).
    */
    public static boolean solution(String str, String ending) {
        if (str.length()<ending.length()) return false;
        return str.substring(str.length()-ending.length()).equals(ending);
    }
    /*
        DESCRIPTION:
        In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.
    */
    public static List<Object> filterList(final List<Object> list) {
        List<Object> result = new ArrayList<>();
        for (Object object : list) {
            if (object instanceof Integer)
                result.add(object);
        }
        return result;
    }
    public static List<Object> filterList2(final List<Object> list) {

        return list.stream().filter(o -> o instanceof Integer).collect(Collectors.toList());
    }
}
