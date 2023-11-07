package kyu7_8;

/*
DESCRIPTION:
        Return the number (count) of vowels in the given string.
        We will consider a, e, i, o, u as vowels for this Kata (but not y).
        The input string will only consist of lower case letters and/or spaces.
*/
public class Vowels {
    public static int getCount(String str) {
        int vowelsCount = 0;
        // your code here
        char temp;
        for (int i = 0; i < str.length(); i++) {
            temp = str.charAt(i);
            if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u')
                vowelsCount++;
        }
        return vowelsCount;
    }
}
