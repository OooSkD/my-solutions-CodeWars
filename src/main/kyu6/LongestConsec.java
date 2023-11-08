package kyu6;

/*
DESCRIPTION:
    You are given an array(list) strarr of strings and an integer k.
    Your task is to return the first longest string consisting of k consecutive strings taken in the array.

    n being the length of the string array, if n = 0 or k > n or k <= 0 return ""
    (return Nothing in Elm, "nothing" in Erlang).

    Note consecutive strings : follow one after another without an interruption
 */

public class LongestConsec {
    public static String longestConsec(String[] strarr, int k) {
        if (strarr.length == 0 || k<=0 || strarr.length<k) return "";
        String res = "";
        for (int i = 0; i < strarr.length - k + 1; i++) {
            String str = "";
            for (int j = i; j < i + k; j++) {
                str+=strarr[j];
            }
            if (str.toString().length() > res.length()) {
                res = str.toString();
            }
        }
        return res;
    }
}
