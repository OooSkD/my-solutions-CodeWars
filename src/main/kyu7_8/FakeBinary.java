package kyu7_8;

/*
DESCRIPTION:
    Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'.
    Return the resulting string.
    Note: input will never be an empty string
 */
public class FakeBinary {
    public static String fakeBin(String numberString) {
        String res = "";
        for (char c : numberString.toCharArray()) {
            res += (c < '5') ? '0' : '1';
        }
        return res;
    }
}
