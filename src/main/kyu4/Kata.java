package kyu4;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
DESCRIPTION:
    Create a function that takes a positive integer and returns the next bigger number that can be formed by rearranging its digits. For example:

     12 ==> 21
    513 ==> 531
    2017 ==> 2071
    If the digits can't be rearranged to form a bigger number, return -1 (or nil in Swift, None in Rust):

     9 ==> -1
    111 ==> -1
    531 ==> -1
 */
public class Kata {
    public static long nextBiggerNumber(long n) {
        if (n / 100 == 0) {
            if (n / 10 > n % 10)
                return -1;
            else
                return (n % 10) * 10 + n / 10;
        }
        String text = Long.toString(n);
        String tail = "";
        char st = ' ';
        int i;
        for (i = text.length() - 2; i >= 0; i--) {
            if (text.charAt(i) < text.charAt(i + 1)) {
                tail = text.substring(i + 1);
                st = text.charAt(i);
                break;
            }
        }
        if (tail.isEmpty()) return -1;
        if (tail.length() == 1) return Long.parseLong(text.substring(0, i) + tail + st);
        tail = Arrays.stream(tail.split("")).sorted().collect(Collectors.joining());
        for (int j = 0; j < tail.length(); j++) {
            if (st < tail.charAt(j)) {
                char temp = st;
                st = tail.charAt(j);
                tail = tail.substring(0, j) + temp + tail.substring(j + 1);
                break;
            }
        }
        return Long.parseLong(text.substring(0, i) + st + tail);
    }
}
