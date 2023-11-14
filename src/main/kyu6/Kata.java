package kyu6;

import java.util.*;


public class Kata {

    /*
    DESCRIPTION:
        There is an array with some numbers. All numbers are equal except for one. Try to find it!

        Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
        Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
        It’s guaranteed that array contains at least 3 numbers.

        The tests contain some very huge arrays, so think about performance.
    */
    public static double findUniq(double arr[]) {
        double repeat = arr[arr[0] == arr[1] ? 0 : 2];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != repeat)
                return arr[i];
        }
        throw new RuntimeException("only repeats");
    }

    /*
    DESCRIPTION:
        You will be given an array of numbers.
        You have to sort the odd numbers in ascending order while leaving the even numbers at
        their original positions.
     */
    public static int[] sortArray(int[] array) {
        int[] odd = new int[array.length];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] & 1) == 1) {
                odd[j] = array[i];
                j++;
            }
        }
        Arrays.sort(odd);
        j = array.length - j;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] & 1) == 1) {
                array[i] = odd[j];
                j++;
            }
        }
        return array;
    }

    /*
    DESCRIPTION:
        Your goal in this kata is to implement a difference function, which subtracts one list
        from another and returns the result.

        It should remove all values from list a, which are present in list b keeping their order.

        Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
        If a value is present in b, all of its occurrences must be removed from the other:

        Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}
    */
    public static int[] arrayDiff(int[] a, int[] b) {
        return Arrays.stream(a).filter(n -> Arrays.stream(b).noneMatch(c -> c == n)).toArray();
    }

    /*
    DESCRIPTION:
        Write a function that accepts an array of 10 integers (between 0 and 9),
        that returns a string of those numbers in the form of a phone number.

        Example
        Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
        The returned format must be correct in order to complete this challenge.

        Don't forget the space after the closing parentheses!
    */
    public static String createPhoneNumber(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", numbers[0], numbers[1],
                numbers[2], numbers[3],
                numbers[4], numbers[5],
                numbers[6], numbers[7],
                numbers[8], numbers[9]);
    }
}
