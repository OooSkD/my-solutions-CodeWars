package kyu6;

import kyu5.Node;

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
        j=array.length - j;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] & 1) == 1) {
                array[i] = odd[j];
                j++;
            }
        }
        return array;
    }
}
