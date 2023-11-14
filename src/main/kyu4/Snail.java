package kyu4;
/*
DESCRIPTION:
    Snail Sort
    Given an n x n array, return the array elements arranged from outermost elements
    to the middle element, traveling clockwise.

    array = [[1,2,3],
            [4,5,6],
            [7,8,9]]
    snail(array) #=> [1,2,3,6,9,8,7,4,5]
    For better understanding, please follow the numbers of the next array consecutively:

    array = [[1,2,3],
            [8,9,4],
            [7,6,5]]
    snail(array) #=> [1,2,3,4,5,6,7,8,9]

    NOTE: The idea is not sort the elements from the lowest value to the highest;
    the idea is to traverse the 2-d array in a clockwise snailshell pattern.

    NOTE 2: The 0x0 (empty matrix) is represented as en empty array inside an array [[]].
 */
public class Snail {
    public static int[] snail(int[][] array) {
        int n = array[0].length;
        int[] result = new int[n * n];
        int k = 0;
        for (int i = 0; i < n/2; i++) {
            for (int j = i; j <n-i; j++) {
                result[k]=array[i][j];
                k++;
            }
            for (int j = i+1; j < n-i; j++) {
                result[k]=array[j][n-i-1];
                k++;
            }
            for (int j = i+1; j < n-i; j++) {
                result[k]=array[n-i-1][n-j-1];
                k++;
            }
            for (int j = i+2; j < n-i; j++) {
                result[k]=array[n-j][i];
                k++;
            }
        }
        if (n%2==1) result[n*n-1] = array[n/2][n/2];
        return result;
    }
}
